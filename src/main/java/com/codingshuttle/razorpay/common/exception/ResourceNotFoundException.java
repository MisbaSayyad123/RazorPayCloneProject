package com.codingshuttle.razorpay.common.exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException{

    private final String resource;
    private final Object identifier;

    public ResourceNotFoundException(String resource, Object identifier) {
        super(resource+ " Not Found "+ identifier);
        this.resource = resource;
        this.identifier = identifier;
    }
}
