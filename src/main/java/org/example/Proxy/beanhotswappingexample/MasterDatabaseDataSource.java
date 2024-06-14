package org.example.Proxy.beanhotswappingexample;

public class MasterDatabaseDataSource implements DataSource {

    @Override
    public String getConnection() {
        return "Master Database is using";
    }
    
}