package com.vbdev.controller;

import com.vbdev.domain.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class GreetingController {

  @GetMapping
  public ResponseEntity<Message> getMessage() {
    return ResponseEntity.ok(new Message("Vladimir Beglyak", "Hello guys!!!"));
  }
}
