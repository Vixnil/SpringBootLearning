package com.vixnil.learningapp.pokemon;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name="Monster")
public class Monster
{
    @Id
    @Column
    (   
          name = "dex_number"
        , unique = true
    )
    private Integer dexNumber;

    @Column(unique = true)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
          name="monster_type_mapping"
        , joinColumns = @JoinColumn(name="monster_id", referencedColumnName = "dex_number")
        , inverseJoinColumns = @JoinColumn(name = "type_id", referencedColumnName = "id")
        )
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
