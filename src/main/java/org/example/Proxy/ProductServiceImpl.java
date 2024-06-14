package org.example.Proxy;

public class ProductServiceImpl implements ProductService{
    
    @Override
    public Product addProduct(Product product){
        System.out.println("Production adding logic executing..");
        return product;
    }

}
