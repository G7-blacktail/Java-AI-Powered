package dio.spring.jwt.leaning.leaning_jwt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import dio.spring.jwt.leaning.leaning_jwt.model.User;
import dio.spring.jwt.leaning.leaning_jwt.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //Por algum motivo o encoder só funcinou sem o a injeção Autowired
    private PasswordEncoder encoder;

    public void createUser(User user){
        String pass = user.getPassword();
        // criptografando antes de salvar no banco
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }
    
}