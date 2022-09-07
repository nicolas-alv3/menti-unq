package com.unq.mentiunq.login;

import javax.persistence.*;

@Entity
@Table(name = "menti_login")
public class Login {
    private String email;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    public Login() {

    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
