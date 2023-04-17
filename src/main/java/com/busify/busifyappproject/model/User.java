package com.busify.busifyappproject.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "User")
public class User {

    public User() {
    }

    public User(int id, String email, String password, String first_name, String last_name, UserRole role, LocalDate date_of_birth) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
        this.date_of_birth = date_of_birth;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_User")
    private int id;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "First_Name")
    private String first_name;

    @Column(name = "Last_Name")
    private String last_name;

    @Enumerated
    @Column(name = "Role")
    private UserRole role;

    @Column(name = "Date_Of_Birth")
    private LocalDate date_of_birth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
