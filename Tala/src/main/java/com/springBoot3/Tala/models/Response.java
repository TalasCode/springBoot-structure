package com.springBoot3.Tala.models;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
public class Response {

    private LocalDateTime timeStamp;
    private HttpStatus status;
    private Integer statusCode;
    private String message;
    private java.util.Map<?, ?> data;
    private String devMessage;

}
