package org.example.Proxy.hotswappingexample;

public class DataSourceProxy implements DataSource {

    MasterDatabaseDataSource masterDatabaseDataSource;

    SlaveDatabaseDataSource slaveDatabaseDataSource;

    DataSource primaryDataSource;

    public DataSourceProxy(MasterDatabaseDataSource masterDatabaseDataSource,
                           SlaveDatabaseDataSource slaveDatabaseDataSource) {
        this.masterDatabaseDataSource = masterDatabaseDataSource;
        this.slaveDatabaseDataSource = slaveDatabaseDataSource;
        this.primaryDataSource = masterDatabaseDataSource;
    }

    public void changePrimaryDataSource(String type) throws Exception {
        if (type.equalsIgnoreCase("master"))
            this.primaryDataSource = this.masterDatabaseDataSource;
        else if (type.equalsIgnoreCase("slave"))
            this.primaryDataSource = this.slaveDatabaseDataSource;
        else
            throw new Exception("Invalid DataSource Type");
    }

    @Override
    public void getConnection() {
        System.out.println("Received a connection to " + primaryDataSource.getDatasourceName());
    }

    @Override
    public String getDatasourceName() {
        return primaryDataSource.getDatasourceName();
    }

}
