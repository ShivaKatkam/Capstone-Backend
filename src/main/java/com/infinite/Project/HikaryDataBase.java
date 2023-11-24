package com.infinite.Project;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikaryDataBase {
	
	//creating data source for connection with database
	private static DataSource datasource = null;
	 
    public static DataSource getDatasource() {
        if (datasource == null) {
        	//initializing data source configuration
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl("jdbc:mysql://localhost:3306/payroll");
            config.setUsername("root");
            config.setPassword("mysql123@");
            config.setMaximumPoolSize(10);
            config.setAutoCommit(false);
            config.addDataSourceProperty("cachePrepStmts", "true");
            config.addDataSourceProperty("PrepStmtCacheSize", "250");
            config.addDataSourceProperty("PrepStmtCacheSqlLimit", "2048");
            datasource = new HikariDataSource(config);
        }
        return datasource;
    }
}
