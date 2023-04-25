package edu.vn.tdtu.Lab08.service;

import edu.vn.tdtu.Lab08.model.Product;
import edu.vn.tdtu.Lab08.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Object getProduct(long id) throws Throwable {
        return productRepository.findById(id).orElseThrow(() -> new Exception("Product not found"));
    }

    @Override
    public Object save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void removeById(long id) throws Exception {
        productRepository.deleteById(id);
    }
}
