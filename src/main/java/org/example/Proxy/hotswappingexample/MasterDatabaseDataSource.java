package org.example.Proxy.hotswappingexample;

public class MasterDatabaseDataSource extends AbstractDataSource {

    public MasterDatabaseDataSource(String datasourceName) {
        super(datasourceName);
    }

    @Override
    public void getConnection() {
        // "this method gives connection to master database";
    }
    
}