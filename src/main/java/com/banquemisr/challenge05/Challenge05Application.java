package com.banquemisr.challenge05;

import com.banquemisr.challenge05.dao.UserRepository;
import com.banquemisr.challenge05.model.User;
import com.banquemisr.challenge05.security.configuration.RsaKeyConfigProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static com.banquemisr.challenge05.model.UserRole.ADMIN;

@EnableConfigurationProperties(RsaKeyConfigProperties.class)
@SpringBootApplication
public class Challenge05Application {

	public static void main(String[] args) {
		SpringApplication.run(Challenge05Application.class, args);
	}

	@Bean
	public CommandLineRunner initializeUser(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
		return args -> {

			User user = new User();
			user.setUsername("ehabkamil");
			user.setEmail("ehabkamil2@gmail.com");
			user.setPassword(passwordEncoder.encode("password"));
			user.setRole(ADMIN);
			// Save the user to the database
		try{
			userRepository.save(user);
		}catch (Exception e){
			//do nothing just to keep the application running incase unable to create the user
		}



		};
	}
}
