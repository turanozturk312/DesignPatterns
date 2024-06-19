package org.example.Proxy.dynamicproxylazyloading;

import net.sf.cglib.proxy.Enhancer;

import java.util.Set;

public class CustomerDao {

    public Customer getCustomer(Long id){
        Customer fetchedCustomer = CustomerProxyFactory.getCustomerProxy();
        fetchedCustomer.setId(1L);
        fetchedCustomer.setName("turanozturk");
        fetchedCustomer.setOrders(Set.of());
        return fetchedCustomer;
    }

}
