package com.s.ureport.starter;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@Configuration
@ImportResource("classpath:ureport-console-context.xml")
public class Ureport2StarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ureport2StarterApplication.class, args);
	}



	@Bean
	public ServletRegistrationBean ureportServlet(){
		return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");
	}
}
