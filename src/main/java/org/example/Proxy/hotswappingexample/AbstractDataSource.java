package org.example.Proxy.hotswappingexample;

public abstract class AbstractDataSource implements DataSource{

    private String datasourceName;

    public AbstractDataSource(String datasourceName) {
        this.datasourceName = datasourceName;
    }

    @Override
    public String getDatasourceName() {
        return this.datasourceName;
    }

}
