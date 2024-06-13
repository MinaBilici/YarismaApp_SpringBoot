package com.minab.service;

import com.minab.dto.request.RegisterRequestDto;
import com.minab.entity.Auth;
import com.minab.exception.ErrorType;
import com.minab.exception.YarismaAppException;
import com.minab.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class AuthService  {
    private final AuthRepository authRepository;

    public Auth save(RegisterRequestDto dto) {
        if(authRepository.existsByUsername(dto.getUsername()))
            throw new YarismaAppException(ErrorType.USERNAME_ALREADY_TAKEN);
        Auth auth = Auth.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .build();
        return authRepository.save(auth);
    }
}
