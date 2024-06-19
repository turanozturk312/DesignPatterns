package org.example.Proxy.dynamicproxylazyloading;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Set;

public class CustomerMethodInterceptor implements MethodInterceptor {

    private LazyLoader<Set<Order>> lazyLoader;

    public CustomerMethodInterceptor(LazyLoader<Set<Order>> orderLazyLoader) {
        this.lazyLoader = orderLazyLoader;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        OrderLazyLoader orderLazyLoader = (OrderLazyLoader) lazyLoader;
        Customer customer = (Customer) obj;
        if(method.getName().equals("getOrders")) loadOrdersIfNotLoaded(customer, orderLazyLoader);
        return proxy.invokeSuper(obj, args);
    }

    public void loadOrdersIfNotLoaded(Customer customer, OrderLazyLoader orderLazyLoader){
        if(!orderLazyLoader.getLoaded()){
            Set<Order> fetchedOrders = orderLazyLoader.load(customer);
            customer.setOrders(fetchedOrders);
        }
    }
}
