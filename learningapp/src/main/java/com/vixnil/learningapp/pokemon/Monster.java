package com.vixnil.learningapp.pokemon;

import java.util.List;

public class Monster
{
    private Integer dexNumber;
    private String name;
    private List<Type> types;

    public Monster()
    {

    }

    public Monster(Integer dexNumber, String name, List<Type> types) 
    {
        this.dexNumber = dexNumber;
        this.name = name;
        this.types = types;
    }

    public Integer getDexNumber() 
    {
        return this.dexNumber;
    }

    public void setDexNumber(Integer dexNumber) 
    {
        this.dexNumber = dexNumber;
    }

    public String getName() 
    {
        return this.name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public List<Type> getTypes() 
    {
        return this.types;
    }

    public void setTypes(List<Type> types) 
    {
        this.types = types;
    }

    @Override
    public String toString() {
        return "{" +
            " dexNumber='" + getDexNumber() + "'" +
            ", name='" + getName() + "'" +
            ", types='" + getTypes() + "'" +
            "}";
    }

}