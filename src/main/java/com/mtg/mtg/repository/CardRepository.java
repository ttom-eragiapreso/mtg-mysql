package com.mtg.mtg.repository;

import com.mtg.mtg.model.Card;
import com.mtg.mtg.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Integer> {

    List<Card> findByNameContainingIgnoreCase(String keyword);

    List<Card> findByTypeContainingIgnoreCase(String type);

}
