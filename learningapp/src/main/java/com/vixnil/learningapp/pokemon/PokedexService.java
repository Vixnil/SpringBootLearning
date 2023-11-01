package com.vixnil.learningapp.pokemon;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokedexService 
{
	private final MonsterRepository repository;

	@Autowired
	public PokedexService(MonsterRepository repository)
	{
		this.repository = repository;
	}

    public List<Monster> getMonsters()
	{
		return repository.findAll();
	}

	public void addMonster(Monster newRecord) 
	{
		Optional<Monster> existingRecord = repository.findByName(newRecord.getName());
		
		if(existingRecord.isPresent())
			throw new IllegalArgumentException("Pokemon name already exists.");
		else
			repository.save(newRecord);
	}

	public void deleteMonster(Integer dexNumber) 
	{
		if(repository.existsById(dexNumber))
			repository.deleteById(dexNumber);
		else
			throw new IllegalArgumentException("Pokemon dex number '" + dexNumber + "' does not exist.");
	}
    
}
