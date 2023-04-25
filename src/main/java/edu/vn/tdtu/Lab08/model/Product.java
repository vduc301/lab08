package edu.vn.tdtu.Lab08.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Product {
    private long id;
    private String name;
    private double price;
    private String brand;
    private String color;
    @Builder
    public Product(long id, String name, double price, String brand, String color){
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.color = color;
    }
}
