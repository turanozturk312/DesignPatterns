package org.example.Proxy.hotswappingexample;

public class DataSourceFactory {

    private static DataSourceProxy currentDataSource = null;

    public static DataSourceProxy getDataSource(){

        if(DataSourceFactory.currentDataSource != null) return currentDataSource;

        MasterDatabaseDataSource masterDatabaseDataSource = new MasterDatabaseDataSource("Master Database");
    
        SlaveDatabaseDataSource slaveDatabaseDataSource = new SlaveDatabaseDataSource("Slave Database");
        
        DataSourceProxy dataSourceProxy = new DataSourceProxy(masterDatabaseDataSource, slaveDatabaseDataSource);

        currentDataSource = dataSourceProxy;

        return dataSourceProxy;

    }

}
