package com.vbdev.domain;

public class Message {

  private String author;
  private String text;

  public Message() {
  }

  public Message(String author, String text) {
    this.author = author;
    this.text = text;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
