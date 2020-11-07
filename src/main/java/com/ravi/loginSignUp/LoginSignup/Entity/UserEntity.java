package com.ravi.loginSignUp.LoginSignup.Entity;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name="User")
public class UserEntity {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String LastName;
    private String email;
    @Column(unique=true)
    private String userName;
    private String password;
    @OneToMany(fetch=FetchType.LAZY)
    private List<ToDoEntity> toDoEntity;
    public  UserEntity(){

    }

    public UserEntity( String firstName, String LastName, String email, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        this.LastName = LastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    public UserEntity( int id,String firstName, String LastName, String email, String userName, String password) {
        this.id = id;
        this.firstName = firstName;
        LastName = LastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ToDoEntity> getToDoEntity() {
        return toDoEntity;
    }

    public void setToDoEntity(List<ToDoEntity> toDoEntity) {
        this.toDoEntity = toDoEntity;
    }

    @Override
    public String toString() {
        return id+" "+firstName+" "+LastName+" "+email+" "+userName+" "+password;
    }
}
