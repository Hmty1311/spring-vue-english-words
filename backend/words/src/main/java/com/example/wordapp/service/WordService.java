package com.example.wordapp.service;

import com.example.wordapp.model.Word;
import com.example.wordapp.repository.WordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {
  
  private final WordRepository repository;
  
  public WordService(WordRepository repository) {
    this.repository = repository;
  }
  
  public List<Word> getAllWords() {
    return repository.findAll();
  }
}