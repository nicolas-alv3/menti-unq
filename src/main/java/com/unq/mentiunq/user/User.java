package com.unq.mentiunq.user;

import javax.persistence.*;

@Entity
@Table(name = "menti_user")
public class User {
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public User() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
