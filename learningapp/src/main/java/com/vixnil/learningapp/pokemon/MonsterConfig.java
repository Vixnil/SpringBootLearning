package com.vixnil.learningapp.pokemon;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MonsterConfig 
{

    @Bean
	CommandLineRunner load(MonsterRepository repository)
	{
        Monster pidgey = new Monster(16, "Pidgey", List.of(Type.Normal, Type.Flying), 255);

		return args -> {	
			repository.save(pidgey);
		};
	}
    
}
