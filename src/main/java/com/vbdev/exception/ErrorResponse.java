package com.vbdev.exception;

import java.time.Instant;

public class ErrorResponse {

  private Instant timestamp;
  private String message;
  private Integer status;
  private String path;

  private ErrorResponse(Instant timestamp, String message, Integer status, String path) {
    this.timestamp = timestamp;
    this.message = message;
    this.status = status;
    this.path = path;
  }

  public static ErrorResponse of(Instant timestamp, String message, Integer status, String path) {
    return new ErrorResponse(timestamp, message, status, path);
  }

  public Instant getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public Integer getStatus() {
    return status;
  }

  public String getPath() {
    return path;
  }
}
