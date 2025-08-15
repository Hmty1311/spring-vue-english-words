package com.example.wordapp.model;

import lombok.Data;

@Data
public class Word {
  
  private Long id;
  private String english;
  private String japanese;
  private String example;
  
}