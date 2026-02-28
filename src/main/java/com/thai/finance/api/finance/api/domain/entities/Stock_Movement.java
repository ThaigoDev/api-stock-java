package com.thai.finance.api.finance.api.domain.entities;

import com.thai.finance.api.finance.api.domain.enums.MovementType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_STOCK_MOVEMENT")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Stock_Movement {

    @Id
    @GeneratedValue(strategy  = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @Enumerated(EnumType.STRING)
    private MovementType type;

    @Column(name= "QUANTITY_MOVEMENT")
    private Integer quantityMovement;

    @CreatedDate
    private LocalDateTime createAt;

    @LastModifiedDate
    private Instant updateAt;

    public Stock_Movement() {
    }

    public Stock_Movement(UUID id, Product product, MovementType type, Integer quantityMovement) {
        this.id = id;
        this.product = product;
        this.type = type;
        this.quantityMovement = quantityMovement;
    }


}
