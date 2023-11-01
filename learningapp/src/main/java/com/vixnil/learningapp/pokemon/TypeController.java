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
@RequestMapping(path="pokedex/type")
public class TypeController 
{
    TypeService service;

    @Autowired
    public TypeController(TypeService service)
    {
        this.service = service;
    }

    @GetMapping
    public List<Type> getTypes()
    {
        return service.getTypes();
    }

    @PostMapping
    public void addType(@RequestBody Type type)
    {
        service.addType(type);
    }

    @DeleteMapping(path="{id}")
    public void deleteById(@PathVariable("id") Integer id)
    {
        service.deleteById(id);
    }

    
}
