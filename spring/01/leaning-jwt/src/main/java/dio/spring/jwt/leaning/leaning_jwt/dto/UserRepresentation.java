package dio.spring.jwt.leaning.leaning_jwt.dto;

import java.util.List;

public class UserRepresentation {
    
    private Integer id;

    private String name;

    private String username;

    private String password;

    private List<String> roles;

    public UserRepresentation() {
        //
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(final Integer id){
        this.id = id;
    }

    public String getNome(){
        return this.name;
    }

    public void setNome(final String name){
        this.name = name;
    }

    public String getUserName(){
        return this.username;
    }

    public void setUserName(final String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
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
}
