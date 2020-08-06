package com.marcelino.crudbackend.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.marcelino.crudbackend.entities.User;
import com.marcelino.crudbackend.repositories.UserRepository;

@Configuration
@Profile("test") //Parametro precisa bater com o valor setado para "spring.profiles.active", no application.properties
public class TestConfig implements CommandLineRunner {
	
	@Autowired //injeção de dependência automática
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		//Executado sempre que a aplicação é executada
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
	
}
