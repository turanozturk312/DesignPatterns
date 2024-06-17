package org.example.Proxy.hotswappingexample;

public class PersonService {
    
    DataSource dataSource;

    public PersonService() {
        dataSource = DataSourceFactory.getDataSource();
    }

    public void getPersonInformations(Long personId){
        dataSource.getConnection();
        System.out.println("Person Information fetched from " + dataSource.getDatasourceName());
    }

}
