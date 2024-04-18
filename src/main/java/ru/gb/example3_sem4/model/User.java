package ru.gb.example3_sem4.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private String email;
    private  String password;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
