package com.ravi.loginSignUp.LoginSignup.Entity;

import com.ravi.loginSignUp.LoginSignup.JasonProp.User;

import javax.persistence.*;


@Entity
@Table(name="ToDo")
public class ToDoEntity {

    @Id
    @GeneratedValue
    private  int id;

   private String title;

   private String description;
   @ManyToOne
   private  UserEntity  userEntity;

    public ToDoEntity()
    {

    }


    public ToDoEntity(String title, String description, UserEntity userEntity) {
        this.title = title;
        this.description = description;
        this.userEntity = userEntity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Override
    public String toString() {
        return title+" "+description;

    }
}
