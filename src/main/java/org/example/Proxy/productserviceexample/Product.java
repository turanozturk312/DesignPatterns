package org.example.Proxy.productserviceexample;

import java.math.BigInteger;

public class Product {

    private String productName;

    private BigInteger productPrice;

    public Product(String productName, BigInteger productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigInteger getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigInteger productPrice) {
        this.productPrice = productPrice;
    }

}
