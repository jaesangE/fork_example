package com.example.match.mypage.mypage.controller;

import com.example.match.mypage.mypage.dto.UserResponseDto;
import com.example.match.mypage.mypage.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class Controller {
    private final UserService userService;

    // 전체 유저 조회
    @GetMapping
    public List<UserResponseDto> getAllUsers() {
        return userService.getAllUsers();
    }

    // 특정 유저 조회
    @GetMapping("/{id}")
    public UserResponseDto getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
