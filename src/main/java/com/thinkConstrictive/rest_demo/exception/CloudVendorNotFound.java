package com.thinkConstrictive.rest_demo.exception;

public class CloudVendorNotFound extends RuntimeException{
    public CloudVendorNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public CloudVendorNotFound(String message) {
        super(message);
    }
}
