package com.mtg.mtg.service;

import com.mtg.mtg.dto.CardDTO;
import com.mtg.mtg.model.Card;
import com.mtg.mtg.pojo.Filter;
import com.mtg.mtg.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;


    public List<Card> getAll(){
        return cardRepository.findAll();
    }

    public Card getById(Integer id){
        return cardRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void delete(Integer id){
        Card card = getById(id);
        cardRepository.delete(card);
    }


    public Card store(CardDTO cardDTO) throws IOException {
        Card card = new Card();

        card.setArtist(cardDTO.getArtist());
        card.setCmc(cardDTO.getCmc());
        card.setFlavour(cardDTO.getFlavour());
        card.setColors(cardDTO.getColors());
        card.setName(cardDTO.getName());
        card.setColorIdentities(cardDTO.getColorIdentities());
        card.setManaCost(cardDTO.getManaCost());
        card.setFrontImage(cardDTO.getMultipartFile().getBytes());
        card.setNameSet(cardDTO.getNameSet());
        card.setPower(cardDTO.getPower());
        card.setToughness(cardDTO.getToughness());
        card.setRarity(cardDTO.getRarity());
        card.setType(cardDTO.getType());
        card.setTextDescription(cardDTO.getTextDescription());

        return cardRepository.save(card);
    }

    public List<Card> filteredCards(Filter filter){
        List<Card> filteredCards = cardRepository.findAll();
        if(filter.getName() != null) filteredCards = cardRepository.findByNameContainingIgnoreCase(filter.getName());
        if(filter.getType() != null) filteredCards.retainAll(cardRepository.findByTypeContainingIgnoreCase(filter.getType()));

        if(filter.getColors() != null) filteredCards.retainAll(filteredCards.stream().filter(c -> new HashSet<>(c.getColors()).containsAll(filter.getColors())).collect(Collectors.toList()));
        return filteredCards;
    }
}
