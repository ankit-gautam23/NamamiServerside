package com.namami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:messages.properties"})
public class BeautyBattleServerSideApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeautyBattleServerSideApplication.class, args);
	}

}
