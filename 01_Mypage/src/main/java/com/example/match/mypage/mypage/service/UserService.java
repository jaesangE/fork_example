package com.example.match.mypage.mypage.service;

import com.example.match.mypage.mypage.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto getUserById(Long id);
    List<UserResponseDto> getAllUsers();
}
