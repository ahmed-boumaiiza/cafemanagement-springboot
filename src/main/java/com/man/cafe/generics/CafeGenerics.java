package com.man.cafe.generics;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeGenerics {
    private CafeGenerics(){

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus) {
        return new ResponseEntity<String> ("{\"message\":\"" +responseMessage+ "\"}",  httpStatus);
    }

}
