package com.example.wordapp.repository;

import com.example,wordapp.model.Word;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WordRepository {
  
  public List<Word> findAll() {
    List<Word> words = new ArrayList<>();
    
    Word w1 = new Word();
    w1.setId(1L);
    w1.setEnglish("apple");
    w1.setJapanese("りんご");
    w1.setExample("I eat an apple every morning.");
    words.add(w1);
    
    Word w2 = new Word();
    w2.setId(2L);
    w2.setEnglish("book");
    w2.setJapanese("本");
    w2.setExample("This is my favorite book");
    words.add(w2);
    
    return words;
  }
}