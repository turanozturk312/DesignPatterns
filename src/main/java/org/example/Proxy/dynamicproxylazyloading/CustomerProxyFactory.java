package org.example.Proxy.dynamicproxylazyloading;

import net.sf.cglib.proxy.Enhancer;

public class CustomerProxyFactory {

    public static Customer getCustomerProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Customer.class);
        enhancer.setCallback(new CustomerMethodInterceptor(new OrderLazyLoader()));
        Customer customerProxy = (Customer) enhancer.create();
        return customerProxy;
    }

}
