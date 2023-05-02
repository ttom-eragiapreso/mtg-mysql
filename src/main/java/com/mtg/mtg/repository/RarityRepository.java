package com.mtg.mtg.repository;

import com.mtg.mtg.model.Rarity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RarityRepository extends JpaRepository<Rarity, Integer> {
}
