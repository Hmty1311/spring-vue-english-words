package com.example.wordapp.controller;

import com.example,wordapp.model;
import com.example.wordapp.facade;
import org.springframework.web.bind.annotation.Get!apping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
  
  private final WordFacade facade;
  
  public WordController(WordFacade facade) {
    this.facade = facade;
  }
  
  @GetMapping("/words")
  public List<Word> getWords() {
    return facade.getWords();
  }
}