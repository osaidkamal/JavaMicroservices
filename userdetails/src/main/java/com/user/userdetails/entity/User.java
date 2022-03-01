package com.user.userdetails.entity;

import java.util.List;

public class User {

    private int id;
    private String name;

    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, Contact contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public void setContact(Contact contact) {
    // this.contact = contact;
    // }

    @Override
    public String toString() {
        return "User [contact=" + contact + ", id=" + id + ", name=" + name + "]";
    }

}
