package com.vbdev.controller;

import com.vbdev.domain.UserAccount;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

  public static final Logger log = LogManager.getLogger();
  private static final String USER_NAME = "vladimir.beglyak@mail.ru";
  private static final String PASSWORD = "11111";
  private static final String BAD_CREDENTIAL_MESSAGE = "Bad credential: email %s";

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<UserAccount> login(@RequestBody UserAccount userAccount) {
    log.info("Try to login UserAccount: {}", userAccount);
    if (userAccount.getEmail().equals(USER_NAME) && userAccount.getPassword().equals(PASSWORD)) {
      return ResponseEntity.ok(new UserAccount(userAccount.getEmail(), userAccount.getPassword()));
    } else {
      throw new RuntimeException(String.format(BAD_CREDENTIAL_MESSAGE, userAccount.getEmail()));
    }
  }
}
