package org.example.Proxy;

public class SecurityProxy extends AbstractProductService {

    public SecurityProxy(ProductService productService) {
        super(productService);
    }

    @Override
    public Product addProduct(Product product) {
       System.out.println("Security checked");
       return productService.addProduct(product);
    }
    
}
