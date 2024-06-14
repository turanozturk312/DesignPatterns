package org.example.Proxy.beanhotswappingexample;

public class DataSourceFactory {

    private static DataSourceProxy currentDataSource = null;

    public static DataSourceProxy getDataSource(){

        if(DataSourceFactory.currentDataSource != null) return currentDataSource;

        MasterDatabaseDataSource masterDatabaseDataSource = new MasterDatabaseDataSource();
    
        SlaveDatabaseDataSource slaveDatabaseDataSource = new SlaveDatabaseDataSource();
        
        DataSourceProxy dataSourceProxy = new DataSourceProxy(masterDatabaseDataSource, slaveDatabaseDataSource);

        currentDataSource = dataSourceProxy;

        return dataSourceProxy;

    }

}
