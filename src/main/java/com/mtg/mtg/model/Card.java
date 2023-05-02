package com.mtg.mtg.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @NotNull
    private String name;


    private String manaCost;

    private Integer Cmc;

    @NotEmpty
    @NotNull
    @Lob
    @Column(length = 16777215)
    private byte[] frontImage;

    @Lob
    @Column(length = 16777215)
    private byte[] backImage;

    @NotNull
    @NotEmpty
    private String type;


    private String textDescription;

    @ManyToMany
    private List<Color> color;

    @ManyToMany
    private List<ColorIdentity> colorIdentity;

    @ManyToOne
    private Rarity rarity;

    @NotNull
    @NotEmpty
    private String nameSet;

    @NotNull
    @NotEmpty
    private String power;

    @NotNull
    @NotEmpty
    private String toughness;

    private String flavour;

    private String artist;


    //GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public Integer getCmc() {
        return Cmc;
    }

    public void setCmc(Integer Cmc) {
        this.Cmc = Cmc;
    }

    public byte[] getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(byte[] frontImage) {
        this.frontImage = frontImage;
    }

    public byte[] getBackImage() {
        return backImage;
    }

    public void setBackImage(byte[] backImage) {
        this.backImage = backImage;
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

    public List<Color> getColor() {
        return color;
    }

    public void setColor(List<Color> color) {
        this.color = color;
    }

    public List<ColorIdentity> getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(List<ColorIdentity> colorIdentity) {
        this.colorIdentity = colorIdentity;
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

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
