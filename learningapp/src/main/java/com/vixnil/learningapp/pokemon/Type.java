package com.vixnil.learningapp.pokemon;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name="Type")
public class Type 
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(
          unique = true
        , nullable = false
        )
    private String name;

    @ManyToMany(mappedBy="types")
    private List<Monster> monsters;

    public Type()
    {

    }

    public Type(String name) 
    {
        this.name = name;
    }

    public int getId() 
    {
        return this.id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return this.name;
    }

    public void setName(String name) 
    {
        this.name = name.toLowerCase();
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
    
}
