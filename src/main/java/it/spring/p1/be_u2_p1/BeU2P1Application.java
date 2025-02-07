package it.spring.p1.be_u2_p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BeU2P1Application {

	public static void main(String[] args) {
		SpringApplication.run(BeU2P1Application.class, args);
	}

}
