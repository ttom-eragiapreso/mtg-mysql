package com.mtg.mtg.controller;

import com.mtg.mtg.dto.CardDTO;
import com.mtg.mtg.service.CardService;
import com.mtg.mtg.service.ColorIdentityService;
import com.mtg.mtg.service.ColorService;
import com.mtg.mtg.service.RarityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String index(){
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
    public String store(@Valid @ModelAttribute CardDTO cardDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()) return "/create";


        return "redirect:/cards";
    }
}
