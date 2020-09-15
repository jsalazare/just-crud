package com.jsalazar.justcrud.Exceptions

class UserNotFoundException extends Exception {

    UserNotFoundException(Long id) {
        super("Could not find user " + id);
    }
}