package com.mtg.mtg.controller;

import com.mtg.mtg.dto.CardDTO;
import com.mtg.mtg.model.Card;
import com.mtg.mtg.pojo.Filter;
import com.mtg.mtg.service.CardService;
import com.mtg.mtg.service.ColorIdentityService;
import com.mtg.mtg.service.ColorService;
import com.mtg.mtg.service.RarityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @Autowired
    private ColorIdentityService colorIdentityService;

    @Autowired
    private ColorService colorService;

    @Autowired
    private RarityService rarityService;

    @GetMapping
    public String index(Model model){
        model.addAttribute("cards", cardService.getAll());
        model.addAttribute("filter", new Filter());
        model.addAttribute("colors", colorService.getAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("card", new CardDTO());
        model.addAttribute("colors", colorService.getAll());
        model.addAttribute("color_identities", colorIdentityService.getAll());
        model.addAttribute("rarities", rarityService.getAll());
        return "/create";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute CardDTO cardDTO, BindingResult bindingResult, Model model) throws IOException {

        if(bindingResult.hasErrors()) {
            model.addAttribute("card", cardDTO);
            model.addAttribute("colors", colorService.getAll());
            model.addAttribute("color_identities", colorIdentityService.getAll());
            model.addAttribute("rarities", rarityService.getAll());
            return "/create";
        }

        Card cardSaved = cardService.store(cardDTO);

        return "redirect:/cards";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        cardService.delete(id);

        return "redirect:/cards";
    }


    @PostMapping("/filter")
    public String filterSearch(@ModelAttribute Filter filter, Model model){
        model.addAttribute("cards", cardService.filteredCards(filter));
        model.addAttribute("colors", colorService.getAll());
        return "/index";
    }
}
