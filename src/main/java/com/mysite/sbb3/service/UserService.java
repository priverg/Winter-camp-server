package com.mysite.sbb3.service;

import com.mysite.sbb3.domain.SiteUser;
import com.mysite.sbb3.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public SiteUser create(String username, String email, String password){
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
        //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //password 암호화 모듈
        //그러나 이 모듈을 자주 사용하므로 securityConfig에서 미리 생성자 생성.
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
        return user;

    }
}
