package com.mtg.mtg.service;

import com.mtg.mtg.model.Card;
import com.mtg.mtg.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;


    public List<Card> getAll(){
        return cardRepository.findAll();
    }
}
