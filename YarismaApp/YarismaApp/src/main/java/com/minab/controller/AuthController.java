package com.minab.controller;

import static com.minab.constant.EndPoints.*;

import com.minab.dto.request.RegisterRequestDto;
import com.minab.entity.Auth;
import com.minab.service.AuthService;
import com.minab.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final UserService userService;

    // 1. Register (Eğer username aynı gelirse hata Fırlat)
    // Auth için username ve password, User için email alacağız.
    // Dto içinde Valid ekleyin.
    // username için @NotNull, @Size 3,32
    // email -> @Email,@NotNull
    // password -> @NotNull,@Size min=8


    @PostMapping(REGISTER)
    public ResponseEntity<Boolean> register(@RequestBody @Valid RegisterRequestDto dto){
        Auth savedAuth = authService.save(dto);
        userService.save(savedAuth.getId(),dto.getEmail());
        return ResponseEntity.ok(true);
    }



    //2.Login
    //Eğer giriş başarısız ise hata fırlatın.
    //username ve password alarak


}
