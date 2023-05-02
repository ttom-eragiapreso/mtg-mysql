package com.mtg.mtg.service;

import com.mtg.mtg.model.Color;
import com.mtg.mtg.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public List<Color> getAll(){
        return colorRepository.findAll();
    }
}
