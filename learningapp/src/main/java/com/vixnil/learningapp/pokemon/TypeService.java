package com.vixnil.learningapp.pokemon;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService 
{
    private final TypeRepository repository;

    @Autowired
    public TypeService(TypeRepository repository)
    {
        this.repository = repository;
    }

    public List<Type> getTypes()
    {
        return repository.findAll();
    }

    public void addType(Type newRecord)
    {
        Optional<Type> existingRecord = repository.findByName(newRecord.getName());

        if(existingRecord.isPresent())
            throw new IllegalArgumentException("Type already exists with name: " + existingRecord.get().getName());
        else
            repository.save(newRecord);
    }

    public void deleteById(Integer id)
    {
        boolean exists = repository.existsById(id);

        if(exists)
            repository.deleteById(id);
        else
            throw new IllegalArgumentException("No record with id: " + id + " exists.");
    }
    
}
