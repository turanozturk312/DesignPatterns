package org.example.Proxy.dynamicproxylazyloading;

public class LazyLoadingMain {

    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        Customer customerFromDatabase = customerDao.getCustomer(1L);

        // FETCH CUSTOMER FROM DATABASE
        System.out.println("Customer fetched");
        System.out.println("Orders not fetched yet");
        System.out.println(customerFromDatabase);

        System.out.println("\n*********\n");

        // INVOKE GETORDERS METHOD FIRST TIME
        System.out.println("If we want get orders, LazyLoader load orders from database");
        System.out.println("customer's getoOrders method invocated");
        customerFromDatabase.getOrders();
        System.out.println(customerFromDatabase);

        /**OUTPUT OF PROGRAM
         *
         * Customer fetched
         * Orders not fetched yet
         * Customer{id=1, name='turanozturk', orders=[]}
         *
         * *********
         *
         * If we want get orders, LazyLoader load orders from database
         * customer's getoOrders method invocated
         * Customer{id=1, name='turanozturk', orders=[{id=2, description='Food'}, {id=1, description='Technology'}]}
         *
         */

    }

}
