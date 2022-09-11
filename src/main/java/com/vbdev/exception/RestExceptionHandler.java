package com.vbdev.exception;

import java.time.Instant;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<ErrorResponse> handle(RuntimeException exception, HttpServletRequest request) {
    ErrorResponse response = ErrorResponse.of(Instant.now(), exception.getMessage(), HttpStatus.UNAUTHORIZED.value(), request.getRequestURI());
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
  }
}
