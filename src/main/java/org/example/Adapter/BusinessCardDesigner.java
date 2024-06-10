package org.example.Adapter;

//Client
public class BusinessCardDesigner {

    public String designCard(Customer customer){
        StringBuilder builder = new StringBuilder();
        builder.append(customer.getName());
        builder.append("\n" + customer.getDesignation());
        builder.append("\n" + customer.getAddress());
        return builder.toString();
    }

}
