/*package com.simplilearn.phase3.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	private final String URL = "jdbc:mysql://localhost:3306/sportyshoes";
	private final String USER = "root";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String PASSWORD = "Awesome@2021";
	
	
	@Bean
	DataSource dataSource(){
		
		DriverManagerDataSource dms = new DriverManagerDataSource();
		
		dms.setUrl(URL);
		dms.setUsername(USER);
		dms.setDriverClassName(DRIVER);
		dms.setPassword(PASSWORD);
		return dms;
	}
	
	

}*/
