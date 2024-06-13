package com.minab.service;


import com.minab.entity.User;
import com.minab.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(Long id, String email) {
        User user = User.builder()
                .authId(id)
                .email(email)
                .build();

        userRepository.save(user);
    }
}
