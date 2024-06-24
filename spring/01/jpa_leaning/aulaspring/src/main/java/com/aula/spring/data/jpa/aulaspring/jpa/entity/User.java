package com.aula.spring.data.jpa.aulaspring.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "user_name", length = 50, nullable = false)
    private String name;

    @Column(name = "nm_user", length = 20, nullable = false)
    private String userName;

    @Column(name = "user_password", length = 100, nullable = false)
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "tb_user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role_id")
    private List<String> roles = new ArrayList<>();

    public User() {
        //
    }

    public String getName(){
        return this.name;
    }

    public void setName(final String name){
        this.name = name;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(final String userName){
        this.userName = userName;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(final String password){
        this.password = password;
    }

    public List<String> getRoles(){
        return this.roles;
    }

    public void setRoles(final List<String> roles){
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
        "id= " + id +
        ", name = '" + name + '\'' +   
        ", userName = '"  + userName + '\'' +
        ", PASSWORD = '" + password + '\'' +
        '}';
    }
}
