package com.contact.contact.entity;

public class Contact {

    private int cid;
    private String email;
    private long phno;
    private int id;

    public Contact() {
    }

    public Contact(int cid, String email, long phno, int id) {
        this.cid = cid;
        this.email = email;
        this.phno = phno;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact [cid=" + cid + ", email=" + email + ", id=" + id + ", phno=" + phno + "]";
    }

}
