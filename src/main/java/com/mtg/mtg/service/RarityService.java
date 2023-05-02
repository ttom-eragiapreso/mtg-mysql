package com.mtg.mtg.service;

import com.mtg.mtg.model.Rarity;
import com.mtg.mtg.repository.RarityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RarityService {

    @Autowired
    private RarityRepository rarityRepository;

    public List<Rarity> getAll(){
        return rarityRepository.findAll();
    }
}
