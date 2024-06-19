package org.example.Proxy.dynamicproxylazyloading;

import java.util.Iterator;
import java.util.Set;

public class Customer {

    private Long id;

    private String name;

    private Set<Order> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orders=" + printOrders() +
                '}';
    }

    public String printOrders() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator<Order> orderIterator = orders.iterator();
        while(orderIterator.hasNext()){
            stringBuilder.append(orderIterator.next());
            if(orderIterator.hasNext()) stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

