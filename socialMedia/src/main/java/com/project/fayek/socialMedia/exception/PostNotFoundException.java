package com.project.fayek.socialMedia.exception;

/* @author : fayek.mubarrat
 * date : 07/07/2021
 * purpose : To handle post not found exception */

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String message) {
        super(message);
    }
}
