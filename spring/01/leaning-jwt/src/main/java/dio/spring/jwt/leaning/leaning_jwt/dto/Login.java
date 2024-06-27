package dio.spring.jwt.leaning.leaning_jwt.dto;

public class Login {
    private String username;
    private String password;

    public Login() {
        //
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}
