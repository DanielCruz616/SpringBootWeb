package com.rip.springboot.web.springboot_web.models;

public class User {

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    private String name;
    private String lastname;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null){
            this.name =name;
        }
        else throw new IllegalArgumentException("Name cannot be null");
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
