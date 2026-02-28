package com.thai.finance.api.finance.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Role {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;
    private String name;

    public enum Values {
        BASIC(1L),
        ADMIN (2L);
        long roleId;
        Values(Long roleId) {
            this.roleId = roleId;
        }
        public long getRoleId() {
            return roleId;
        }
    }

    @CreatedDate
    private LocalDateTime createAt;

    @LastModifiedDate
    private LocalDateTime updateAt;

    public Role(Long roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }
}
