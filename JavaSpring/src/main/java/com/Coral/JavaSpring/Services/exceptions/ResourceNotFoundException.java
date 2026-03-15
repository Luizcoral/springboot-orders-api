package com.Coral.JavaSpring.Services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resouce not found. Id " + id);
    }
}
