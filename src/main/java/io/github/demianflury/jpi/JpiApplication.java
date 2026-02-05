package io.github.demianflury.jpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class JpiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpiApplication.class, args);
	}

}
