package com.Chen.pojo;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String aaa;

    public User(int id, String name, String aaa) {
        this.id = id;
        this.name = name;
        this.aaa = aaa;
    }
}
