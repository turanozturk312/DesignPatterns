package org.example.Proxy.beanhotswappingexample;

import java.util.Scanner;

public class BeanHowSwippingMain {
    public static void main(String[] args) {
        
        PersonService personService = new PersonService();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter database type (master/slave) : ");
            String type = scanner.nextLine();
            if(!(type.equalsIgnoreCase("master") || type.equalsIgnoreCase("slave"))){
                System.out.println("Wrong type. Type is must be 'master' or 'slave'");
            } else {
                changeDataSource(type);
                personService.getPersonInformations(1L);
            }
                
        }

    }

    public static void changeDataSource(String dataSourceType){
        try {
            DataSourceFactory.getDataSource().changePrimaryDataSource(dataSourceType);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
