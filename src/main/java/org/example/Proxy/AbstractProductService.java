package org.example.Proxy;

public abstract class AbstractProductService implements ProductService{
    
    protected ProductService productService;

    public AbstractProductService(ProductService productService) {
        super();
        this.productService = productService;
    }

}
