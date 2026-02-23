package com.thai.finance.api.finance.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.util.UUID;

@Entity
@Table(name = "TB_STOCK")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name="PRODUCT_ID", nullable = true)
    private Product product;

    @Column(name= "QUANTITY")
    private Integer quantityProduct;


}
