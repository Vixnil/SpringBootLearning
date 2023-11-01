package com.vixnil.learningapp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vixnil.learningapp.pokemon.Monster;
import com.vixnil.learningapp.pokemon.Type;

@SpringBootApplication
@RestController
public class LearningappApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(LearningappApplication.class, args);
	}

	@GetMapping
	public List<Monster> hello()
	{
		return List.of
		(
			new Monster(0016, "Pidgey", List.of(Type.Normal, Type.Flying))
		);
	}

}
