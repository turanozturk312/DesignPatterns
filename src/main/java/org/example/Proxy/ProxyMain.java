package org.example.Proxy;

import java.math.BigInteger;

public class ProxyMain {
    public static void main(String[] args) {
        
        Product product = new Product("Computer", BigInteger.valueOf(150L));
        ProductService productService = ProductServiceFactory.getProductService();
        productService.addProduct(product);

    }
}
