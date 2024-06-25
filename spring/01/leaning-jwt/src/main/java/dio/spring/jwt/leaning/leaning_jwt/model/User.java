package dio.spring.jwt.leaning.leaning_jwt.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(length = 50, nullable =false)
    private String name;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="tab_user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role_id")
    private List<String> roles = new ArrayList<>();

    public User() {
        // Construtor vazio
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(final Integer id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(final String name){
        this.name = name;
    }

    public String getUserName(){
        return this.username;
    }

    public void setUserName(final String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(final String password){
        this.password = password;
    }

    public List<String> getRoles(){
        return roles;
    }

    public void setRoles(final List<String> roles){
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
            "login= '" + username + '\'' + 
            ", password= '" + password + '\'' +
            ", roles - '" + roles + '\'' +
            '}';
    }
}
