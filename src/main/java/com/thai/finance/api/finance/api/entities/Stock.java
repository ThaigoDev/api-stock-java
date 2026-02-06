package com.thai.finance.api.finance.api.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_STOCK")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name="PRODUCT_ID", nullable = false, unique = true)
    private Product product;

    @Column(name= "QUANTITY")
    private Integer quantityProduct;

    public Stock() {
    }

    public Stock(UUID id, Product product, Integer quantityProduct) {
        this.id = id;
        this.product = product;
        this.quantityProduct = quantityProduct;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(Integer quantityProduct) {
        this.quantityProduct = quantityProduct;
    }
}
