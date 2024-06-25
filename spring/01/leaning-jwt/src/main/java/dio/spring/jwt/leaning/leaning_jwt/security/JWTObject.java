package dio.spring.jwt.leaning.leaning_jwt.security;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class JWTObject {

    private String subject; //nome do usuario

    private Date issuedAt; //data de criação do token

    private Date expiration; // data de expiração do token

    private List<String> roles; //perfis de acesso

    public JWTObject() {
        //
    }
    
    public String getSubject(){
        return this.subject;
    }

    public void setSubject(final String subject){
        this.subject = subject;
    }

    public Date getIssuedAt(){
        return this.issuedAt;
    }

    public void setIssuedAt(final Date issuedAt){
        this.issuedAt = issuedAt;
    }

    public Date getExpiration(){
        return this.expiration;
    }

    public void setExpiration(final Date expiration){
        this.expiration = expiration;
    }

    public List<String> getRoles(){
        return roles;
    }

    public void setRoles(String... roles){
        this.roles = Arrays.asList(roles);
    }
}
