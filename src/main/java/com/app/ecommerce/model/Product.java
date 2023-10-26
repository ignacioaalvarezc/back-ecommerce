package com.app.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer amount;
    @Column
    private double price;
    @Column
    private String image;

}
