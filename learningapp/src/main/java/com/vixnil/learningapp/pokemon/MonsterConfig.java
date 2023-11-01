package com.vixnil.learningapp.pokemon;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MonsterConfig 
{

    @Bean
	CommandLineRunner loadPokedex(MonsterRepository monsterRepo, TypeRepository typeRepo)
	{
		return args -> {
			typeRepo.save(new Type("normal"));
            typeRepo.save(new Type("fire"));
            typeRepo.save(new Type("water"));
            typeRepo.save(new Type("grass"));
            typeRepo.save(new Type("electric"));
            typeRepo.save(new Type("ice"));
            typeRepo.save(new Type("fighting"));
            typeRepo.save(new Type("posison"));
            typeRepo.save(new Type("ground"));
            typeRepo.save(new Type("flying"));
            typeRepo.save(new Type("psychic"));
            typeRepo.save(new Type("bug"));
            typeRepo.save(new Type("rock"));
            typeRepo.save(new Type("ghost"));
            typeRepo.save(new Type("dragon"));
            typeRepo.save(new Type("dark"));
            typeRepo.save(new Type("steel"));
            typeRepo.save(new Type("fairy"));

			Type normal = typeRepo.findByName("normal").get();
			Type flying = typeRepo.findByName("flying").get();
        	Monster pidgey = new Monster(16, "Pidgey", List.of(normal, flying), 255);

			monsterRepo.save(pidgey);
		};
	}
    
}
