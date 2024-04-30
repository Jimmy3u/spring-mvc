package com.study.springmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.study.springmvc.model.User;
import com.study.springmvc.repository.UserRepository;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Bean
	public CommandLineRunner teste(UserRepository repo){
		return args -> {
			repo.save(new User("Carlos", "Silva"));
			repo.save(new User("Luiz", "Gonzaga"));
			repo.save(new User("Alberto", "Silva"));
			repo.save(new User("Clarice", "Silva"));
			repo.save(new User("Gal", "Silva"));
		};
	}
	
}
