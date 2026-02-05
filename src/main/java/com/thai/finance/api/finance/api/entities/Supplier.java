package com.thai.finance.api.finance.api.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_SUPPLIERS")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name= "NAME")
    private String nameSupplier;

    public Supplier() {
    }

    public Supplier(UUID id, String nameSupplier) {
        this.id = id;
        this.nameSupplier = nameSupplier;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }
}
