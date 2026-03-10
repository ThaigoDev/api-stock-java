package com.thai.finance.api.finance.api.config;

import com.thai.finance.api.finance.api.domain.entities.Funcao;
import com.thai.finance.api.finance.api.domain.entities.Usuario;
import com.thai.finance.api.finance.api.respository.RepositoryFuncao;
import com.thai.finance.api.finance.api.respository.RepositoryUsuario;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Set;

@Configuration
public class AdminUserConfig  implements CommandLineRunner {
    private RepositoryFuncao repositoryFuncao;
    private RepositoryUsuario repositoryUsuario;
    private BCryptPasswordEncoder passwordEncoder;
    public AdminUserConfig(RepositoryFuncao repositoryFuncao, RepositoryUsuario repositoryUsuario, BCryptPasswordEncoder passwordEncoder) {
        this.repositoryFuncao = repositoryFuncao;
        this.repositoryUsuario = repositoryUsuario;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public void run(String ...args) throws  Exception {
        var FuncaoAdmin = repositoryFuncao.findByName(Funcao.Values.ADMIN.name());
        var usuarioAdmin  = repositoryUsuario.findByEmail("admin@admin.com");
      usuarioAdmin.ifPresentOrElse((usuario)-> System.out.println("Usuário admin já existe"), ()-> {
          var userio = new Usuario();
          userio.setNome("admin");
          userio.setEmail("admin@admin.com");
          userio.setSenha( passwordEncoder.encode("admin331400"));
          userio.setFuncoes(Set.of(FuncaoAdmin));

          repositoryUsuario.save(userio);

      });
    }
}
