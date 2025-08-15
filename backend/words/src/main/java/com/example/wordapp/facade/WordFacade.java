package com.example.wordapp.facade;

import com.example.wordapp.model.Word;
import com.example.wordapp.service.WordService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WordFacade {
  private final WordService service;
  
  public WordFacade(WordService service) {
    this.service = service;
  }
  
  public List<Word> getWords() {
    return service.getAllWords();
  }
}