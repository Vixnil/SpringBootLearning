package com.vixnil.learningapp.pokemon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="pokedex/monster")
public class PokedexController 
{
    PokedexService service;

    @Autowired
    public PokedexController(PokedexService service)
    {
        this.service = service;
    }

    @GetMapping
	public List<Monster> getMonsters()
	{
		return service.getMonsters();
	}

    @PostMapping
    public void addMonster(@RequestBody Monster record)
    {
        service.addMonster(record);
    }

    @DeleteMapping(path="{dexNumber}")
    public void deleteMonster(@PathVariable("dexNumber") Integer dexNumber)
    {
        service.deleteMonster(dexNumber);
    }
    
}
