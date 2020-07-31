package com.test.freme.spring.confing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.Vietnamese;

/**
 * @author bilonjea
 *
 */

@Configuration
@ComponentScan({"com.test.freme.spring"})
public class AppConfiguration {
	

    @Bean(name ="language")
    public Language getLanguage() {
 
        return new Vietnamese();
    }

}