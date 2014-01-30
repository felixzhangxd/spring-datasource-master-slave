package biz.ezcom.spring.datasource.dynamic;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {
    
    @Override
    public Object determineCurrentLookupKey() {
        return DynamicDataSourceContext.getInstance().getDataSourceKey();
    }
}
