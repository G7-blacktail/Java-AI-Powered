package dio.spring.jwt.leaning.leaning_jwt.dto;

public class Sessao {
    private String login;
    private String token;

    public Sessao() {
        //
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

}
