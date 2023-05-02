package com.mtg.mtg.controller;

import com.mtg.mtg.model.Card;
import com.mtg.mtg.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/files")
public class FileController {

    @Autowired
    private CardService cardService;

    @GetMapping("/{cardId}")
    public ResponseEntity<byte[]> image(@PathVariable Integer cardId){
        MediaType mediaType = MediaType.IMAGE_JPEG;
        Card card = cardService.getById(cardId);
        return ResponseEntity.ok().contentType(mediaType).body(card.getFrontImage());
    }
}
