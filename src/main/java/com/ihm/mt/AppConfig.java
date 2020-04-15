package com.ihm.mt;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
@EnableScheduling
public class AppConfig {

	@Configuration
	@EnableAutoConfiguration
	@PropertySource("classpath:application.properties")
	public class ApplicationDataSource {
	    
	    @Autowired
	    private Environment environment;

	    @Bean
	    public DataSource dataSource() {
	        BoneCPDataSource dataSource = new BoneCPDataSource();
	        dataSource.setDriverClass(environment.getRequiredProperty("spring.datasource.driver-class-name"));
	        dataSource.setJdbcUrl(environment.getRequiredProperty("spring.datasource.url"));
	        dataSource.setUsername(environment.getRequiredProperty("spring.datasource.username"));
	        dataSource.setPassword(environment.getRequiredProperty("spring.datasource.password"));
	        //dataSource.setDriverClass(environment.getRequiredProperty("spring.jpa.properties.hibernate.ddl.auto"));
	        return dataSource;
	    }

	}
	
}

