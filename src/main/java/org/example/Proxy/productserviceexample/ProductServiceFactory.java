package org.example.Proxy.productserviceexample;


public class ProductServiceFactory {
    
    public static ProductService getProductService(){
        ProductServiceImpl productServiceImpl = new ProductServiceImpl();
        TransactionProxy transactionProxy = new TransactionProxy(productServiceImpl);
        SecurityProxy securityProxy = new SecurityProxy(transactionProxy);
        return securityProxy;
    }
    
}