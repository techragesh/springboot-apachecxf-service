package com.techjava.springbootapachecxfservice.config;

import com.techjava.springbootapachecxfservice.service.BookingService;
import com.techjava.springbootapachecxfservice.service.impl.BookingServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class ServiceConfig {

    public static final String BASE_URL= "/services";
    public static final String SERVICE_URL = "/bookingservice";

    @Bean
    public ServletRegistrationBean registrationBean(){
        return new ServletRegistrationBean(new CXFServlet(), BASE_URL+"/*");
    }

    @Bean
    public BookingService bookingService(){
        return new BookingServiceImpl();
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(springBus(), bookingService());
        endpoint.publish(SERVICE_URL);
        return endpoint;
    }
}
