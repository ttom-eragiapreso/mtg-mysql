package com.mtg.mtg.repository;

import com.mtg.mtg.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Integer> {
}
