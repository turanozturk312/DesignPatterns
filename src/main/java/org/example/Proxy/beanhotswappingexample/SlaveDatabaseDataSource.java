package org.example.Proxy.beanhotswappingexample;

public class SlaveDatabaseDataSource implements DataSource{

    @Override
    public String getConnection() {
        return "Slave Database is using;";
    }

}
