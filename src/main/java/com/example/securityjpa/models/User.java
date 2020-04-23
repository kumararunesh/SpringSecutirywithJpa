package com.example.securityjpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    int Id;
    String userName;
    String password;
    String roles;

    public User() {
    }

    public User(String username, String password, String roles) {
        this.userName = username;
        this.password = password;
        this.roles = roles;
    }

    public User(int id, String username, String password, String roles) {
        Id = id;
        this.userName = username;
        this.password = password;
        this.roles = roles;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
