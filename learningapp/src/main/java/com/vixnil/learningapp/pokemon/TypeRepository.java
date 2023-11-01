package com.vixnil.learningapp.pokemon;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TypeRepository 
    extends JpaRepository<Type, Integer>
{
    @Query("SELECT t FROM Type t WHERE t.name = ?1")
    Optional<Type> findByName(String name);
}
