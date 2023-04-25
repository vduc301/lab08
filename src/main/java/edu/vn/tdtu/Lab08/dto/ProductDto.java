package edu.vn.tdtu.Lab08.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    private long id;
    private String name;
    private double price;
    private String brand;
    private String color;
    @Builder
    public ProductDto(long id, String name, double price, String brand, String color){
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.color = color;
    }
}
