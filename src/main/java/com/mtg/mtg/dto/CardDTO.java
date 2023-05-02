package com.mtg.mtg.dto;

import com.mtg.mtg.model.Card;
import org.springframework.web.multipart.MultipartFile;

public class CardDTO extends Card {

    private MultipartFile multipartFile;

    public CardDTO(Card card){
        this.setArtist(card.getArtist());
        this.setCmc(card.getCmc());
        this.setColor(card.getColor());
        this.setFlavour(card.getFlavour());
        this.setName(card.getName());
        this.setManaCost(card.getManaCost());
        this.setPower(card.getPower());
        this.setNameSet(card.getNameSet());
        this.setRarity(card.getRarity());
        this.setType(card.getType());
        this.setColorIdentity(card.getColorIdentity());
        this.setNameSet(card.getNameSet());
    }

    public CardDTO() {
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
