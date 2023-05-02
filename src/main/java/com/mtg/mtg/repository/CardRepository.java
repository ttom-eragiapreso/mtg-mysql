package com.mtg.mtg.repository;

import com.mtg.mtg.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
}
