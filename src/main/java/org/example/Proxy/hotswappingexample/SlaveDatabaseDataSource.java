package org.example.Proxy.hotswappingexample;

public class SlaveDatabaseDataSource extends AbstractDataSource{

    public SlaveDatabaseDataSource(String datasourceName) {
        super(datasourceName);
    }

    @Override
    public void getConnection() {
        // "this method gives connection to slave database";
    }

}
