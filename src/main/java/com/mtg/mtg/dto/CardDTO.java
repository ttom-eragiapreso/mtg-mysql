package com.mtg.mtg.dto;

import com.mtg.mtg.model.Card;
import com.mtg.mtg.model.Color;
import com.mtg.mtg.model.ColorIdentity;
import com.mtg.mtg.model.Rarity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class CardDTO{

    private Integer id;

    private String artist;

    private Integer cmc;

    private String flavour;

    private String manaCost;

    private String name;

    private String power;

    private String toughness;

    private List<Color> colors;

    private List<ColorIdentity> colorIdentities;

    private String type;

    private String textDescription;

    private Rarity rarity;

    private String nameSet;

    private MultipartFile multipartFile;

    private byte[] frontImage;

    public CardDTO(Card card) {
        this.id = card.getId();
        this.name = card.getName();
        this.cmc = card.getCmc();
        this.colors = card.getColors();
        this.artist = card.getArtist();
        this.colorIdentities = card.getColorIdentities();
        this.flavour = card.getFlavour();
        this.manaCost = card.getManaCost();
        this.nameSet = card.getNameSet();
        this.power = card.getPower();
        this.toughness = card.getToughness();
        this.rarity = card.getRarity();
        this.textDescription = card.getDescription();
        this.type = card.getType();
        this.frontImage = card.getFrontImage();
    }

    public CardDTO() {
    }


    public byte[] getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(byte[] frontImage) {
        this.frontImage = frontImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getCmc() {
        return cmc;
    }

    public void setCmc(Integer cmc) {
        this.cmc = cmc;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public List<Color> getColors() {
        return colors;
    }

    public void setColors(List<Color> colors) {
        this.colors = colors;
    }

    public List<ColorIdentity> getColorIdentities() {
        return colorIdentities;
    }

    public void setColorIdentities(List<ColorIdentity> colorIdentities) {
        this.colorIdentities = colorIdentities;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }


    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public String getNameSet() {
        return nameSet;
    }

    public void setNameSet(String nameSet) {
        this.nameSet = nameSet;
    }
}
