package com.aula.spring.data.jpa.aulaspring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aula.spring.data.jpa.aulaspring.jpa.entity.User;
import com.aula.spring.data.jpa.aulaspring.jpa.repository.UserJpaRepository;

import java.util.HashSet;
import java.util.Set;
@Service
public class SecurityDatabaseService  implements UserDetailsService {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User userEntity = userJpaRepository.findByUsernameNew(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException(username);
        }
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        userEntity.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        });
        UserDetails user = new org.springframework.security.core.userdetails.User(userEntity.getUserName(),
                userEntity.getPassword(),
                authorities);
        return user;
    }
}
