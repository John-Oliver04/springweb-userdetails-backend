package com.virola.springquiz.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("Could Not Found the Id!");
    }
}
