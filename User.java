package com.example.mvp_designpattern;

import androidx.annotation.NonNull;

public class User {

    String email = "", name = "";

    public User(){

    }

    public User(String _name, String _email){
        this.name = _name;
        this.email = _email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "Email : "+email+"\n Name :"+name;
    }
}
