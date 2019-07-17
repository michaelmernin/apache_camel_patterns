package com.camelcontext.camel_context;

//import org.apache.camel.component.servlet.CamelHttpTransportServlet;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.camelcontext.camel_context")
public class CamelContextApplication {


    public static void main(String[] args) {
        SpringApplication.run(CamelContextApplication.class, args);

    }

}
