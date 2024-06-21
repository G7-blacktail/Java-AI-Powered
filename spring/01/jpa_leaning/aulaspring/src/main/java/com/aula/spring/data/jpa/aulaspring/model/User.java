package com.aula.spring.data.jpa.aulaspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
