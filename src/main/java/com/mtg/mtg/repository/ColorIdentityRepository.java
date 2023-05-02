package com.mtg.mtg.repository;

import com.mtg.mtg.model.ColorIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorIdentityRepository extends JpaRepository<ColorIdentity, Integer> {
}
