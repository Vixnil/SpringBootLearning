package com.vixnil.learningapp.pokemon;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PokedexService 
{
    static public List<Monster> getMonsters()
	{
		return List.of
		(
			new Monster(0016, "Pidgey", List.of(Type.Normal, Type.Flying))
		);
	}
    
}
