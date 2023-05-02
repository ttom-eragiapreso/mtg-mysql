package com.mtg.mtg.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "colors")
public class Color {

    @Id
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "color")
    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

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
}
