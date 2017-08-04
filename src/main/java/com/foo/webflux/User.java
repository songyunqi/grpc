package com.foo.webflux;

import lombok.Data;

@Data
public class User {

    public User() {
    }

    public User(Long id, String user) {
        this.id = id;
        this.user = user;
    }
    private Long id;
    private String user;
}