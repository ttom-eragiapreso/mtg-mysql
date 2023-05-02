package com.mtg.mtg.service;

import com.mtg.mtg.model.ColorIdentity;
import com.mtg.mtg.repository.ColorIdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorIdentityService {

    @Autowired
    private ColorIdentityRepository colorIdentityRepository;

    public List<ColorIdentity> getAll(){
        return colorIdentityRepository.findAll();
    }
}
