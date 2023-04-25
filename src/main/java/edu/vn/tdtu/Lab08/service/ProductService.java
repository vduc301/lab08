package edu.vn.tdtu.Lab08.service;

import edu.vn.tdtu.Lab08.model.Product;

public interface ProductService {
    Iterable<Product> getAllProducts();
    Object getProduct(long id) throws Throwable;
    Object save(Product product);
    void removeById(long id) throws Exception;
}
