package com.amos.mybatis.datasource;

import com.amos.mybatis.util.DataSourceContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * User:Amos.zhou
 * Date: 14-3-14
 * Time: 下午5:27
 */
public class CustomerDatasource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSourceKey();
    }
}
