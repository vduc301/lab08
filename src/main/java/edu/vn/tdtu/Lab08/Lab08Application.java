package edu.vn.tdtu.Lab08;

import edu.vn.tdtu.Lab08.model.Product;
import edu.vn.tdtu.Lab08.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab08Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab08Application.class, args);
	}
	@Bean
	CommandLineRunner runner(ProductService productService){
		return args -> {
			productService.save(new Product(1,"TV", 300, "LG", "pink"));
			productService.save(new Product(2,"dien thoai", 10000, "iphone", "pink"));
			productService.save(new Product(3,"may tinh", 200, "msi", "red"));
			productService.save(new Product(4,"may giat", 800, "LG", "yellow"));
			productService.save(new Product(5,"dieu hoa", 300, "LG", "pink"));
			productService.save(new Product(6,"hiihi", 700, "LG", "black"));
		};
	}

}
