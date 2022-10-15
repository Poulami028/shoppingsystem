package com.dte.zulluproduct;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class zulluproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(zulluproductApplication.class, args);
	}
}
