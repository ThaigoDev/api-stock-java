package com.thai.finance.api.finance.api.entities;

import com.thai.finance.api.finance.api.enums.MovementType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "TB_STOCK_MOVEMENT")
@Getter
@Setter
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

    private Instant createAt = Instant.now();
    private Instant updateAt= null;

    public Stock_Movement() {
    }

    public Stock_Movement(UUID id, Product product, MovementType type, Integer quantityMovement) {
        this.id = id;
        this.product = product;
        this.type = type;
        this.quantityMovement = quantityMovement;
    }


}
