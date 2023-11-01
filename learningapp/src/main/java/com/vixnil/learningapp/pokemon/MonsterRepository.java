package com.vixnil.learningapp.pokemon;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MonsterRepository
    extends JpaRepository<Monster, Integer>
{

    @Query("SELECT m FROM Monster m WHERE m.name = ?1")
    Optional<Monster> findByName(String name);

}
