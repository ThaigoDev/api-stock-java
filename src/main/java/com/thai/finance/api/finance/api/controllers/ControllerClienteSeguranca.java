package com.thai.finance.api.finance.api.controllers;

import com.thai.finance.api.finance.api.controllers.util.GeradorURILocation;
import com.thai.finance.api.finance.api.domain.dtos.ClienteSegurancaDTO.ClienteSegurancaRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.ClienteSegurancaDTO.ClienteSegurancaRespostaDTO;
import com.thai.finance.api.finance.api.services.ServiceClienteSeguranca;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clienteseguranca")
@RequiredArgsConstructor
public class ControllerClienteSeguranca implements GeradorURILocation {
    private final ServiceClienteSeguranca serviceClienteSeguranca;
    @PostMapping
    public ResponseEntity<ClienteSegurancaRespostaDTO> salvarClienteSeguranca(@RequestBody ClienteSegurancaRequisicaoDTO clienteSegurancaRequisicaoDTO) {
        ClienteSegurancaRespostaDTO clienteCriado = serviceClienteSeguranca.salvar(clienteSegurancaRequisicaoDTO);
        return ResponseEntity.created(gerar(clienteCriado.id())).body(clienteCriado);
    }

}
