package org.example.Proxy.dynamicproxylazyloading;

import java.util.Set;

public class OrderLazyLoader implements LazyLoader<Set<Order>>{

    Boolean isLoaded = false;

    public Boolean getLoaded() {
        return isLoaded;
    }

    public void setLoaded(Boolean loaded) {
        isLoaded = loaded;
    }

    @Override
    public Set<Order> load(Customer customer) {
        Set<Order> orders = Set.of(
                new Order(1L, "Technology", customer),
                new Order(2L, "Food", customer)
        );
        setLoaded(true);
        return orders;
    }
}

