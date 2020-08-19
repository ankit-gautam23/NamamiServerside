package com.namami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:messages.properties"})
public class NamamiServerSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamamiServerSideApplication.class, args);
	}

}
