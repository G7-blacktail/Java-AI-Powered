package dio.spring.jwt.leaning.leaning_jwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {

    public static String PREFIX;

    public static String KEY;

    public static Long EXPIRATION;

    public String getPrefix(){
        return PREFIX;
    }

    public void setPrefix(String prefix){
        PREFIX = prefix;
    }

    public String getKey(){
        return KEY;
    }

    public void setKey(String key){
        KEY = key;
    }

    public Long getExpiration(){
        return EXPIRATION;
    }

    public void setExpiration(Long expiration){
        EXPIRATION = expiration;
    }
    
}
