/**
 * 
 */
package com.test.freme.spring.jpa.config;


import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.Vietnamese;

/**
 * @author bilonjea
 *
 */

@Configuration
@EnableTransactionManagement
public class PersistenceJPAConfig {
	

    @Bean(name ="language")
    public Language getLanguage() {
 
        return new Vietnamese();
    }
    
    
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new org.springframework.jdbc.datasource.DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("testuser");
        dataSource.setPassword("RjqpoN5oLmiD7nEJ");
        dataSource.setUrl("jdbc:mysql://localhost:3306/feedback?useSSL=false&serverTimezone=UTC");
        return dataSource;
    }

    
    
    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
       LocalContainerEntityManagerFactoryBean em  = new LocalContainerEntityManagerFactoryBean();
       em.setDataSource(dataSource());
       em.setPackagesToScan(new String[] { "com.test.freme.spring.jpa.persistence.model" });
  
       JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
       em.setJpaVendorAdapter(vendorAdapter);
       em.setJpaProperties(additionalProperties());
  
       return em;
    }

    
    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
     
        return transactionManager;
    }
     

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
        return new PersistenceExceptionTranslationPostProcessor();
    }
     
    Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
           
        return properties;
    }
	
}
