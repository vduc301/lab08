package edu.vn.tdtu.Lab08.controller;

import com.sun.istack.NotNull;
import edu.vn.tdtu.Lab08.dto.ProductDto;
import edu.vn.tdtu.Lab08.model.Product;
import edu.vn.tdtu.Lab08.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = {"", "/"})
    public @NotNull Iterable<Product> getProduct(){
        return productService.getAllProducts();
    }
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductDto productDto){
        Product product = Product.builder()
                .brand(productDto.getBrand())
                .color(productDto.getColor())
                .price(productDto.getPrice())
                .name(productDto.getName()).build();
        productService.save(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

}
