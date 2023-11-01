package com.vixnil.learningapp.pokemon;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Monster")
public class Monster
{
    @Id
    @Column
    (   
          name = "id"
        , unique = true
    )
    private Integer dexNumber;

    @Column(unique = true)
    private String name;
    private List<Type> types;
    private Integer catchRate;

    public Monster() 
    {
    }

    public Monster(Integer dexNumber, String name, List<Type> types, Integer catchRate)
    {
        this.dexNumber = dexNumber;
        this.name = name;
        this.types = types;
        this.catchRate = catchRate;
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

    public Integer getCatchRate() 
    {
        return this.catchRate;
    }

    public void setCatchRate(Integer catchRate) 
    {
        this.catchRate = catchRate;
    }

    @Override
    public String toString() {
        return "{" +
            " dexNumber='" + getDexNumber() + "'" +
            ", name='" + getName() + "'" +
            ", types='" + getTypes() + "'" +
            ", catchRate='" + getCatchRate() + "'" +
            "}";
    }

}
