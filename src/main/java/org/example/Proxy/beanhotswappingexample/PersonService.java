package org.example.Proxy.beanhotswappingexample;

public class PersonService {
    
    DataSource dataSource;

    public PersonService() {
        dataSource = DataSourceFactory.getDataSource();
    }

    

    public void getPersonInformations(Long personId){
        System.out.println( dataSource.getConnection());
        System.out.println("Getting person information from current using database");
    }


    public DataSource getDataSource() {
        return dataSource;
    }

}
