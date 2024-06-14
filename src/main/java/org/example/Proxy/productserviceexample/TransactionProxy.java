package org.example.Proxy.productserviceexample;

public class TransactionProxy extends AbstractProductService{

    public TransactionProxy(ProductServiceImpl productService) {
        super(productService);
    }

    @Override
    public Product addProduct(Product product) {
        try {
            System.out.println("Transaction Begin");
            Product addedProduct = productService.addProduct(product);
            System.out.println("Transaction commit");
            return addedProduct;
        } catch (Exception e) {
            System.out.println("Transaction rollback");
            throw new RuntimeException(e.getMessage());
        }
    }


}
