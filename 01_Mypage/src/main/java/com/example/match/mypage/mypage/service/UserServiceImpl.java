package com.example.match.mypage.mypage.service;

import com.example.match.mypage.database.User;
import com.example.match.mypage.database.UserRepository;
import com.example.match.mypage.mypage.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return new UserResponseDto(user.getId(), user.getUsername(), user.getEmail());
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserResponseDto(user.getId(), user.getUsername(), user.getEmail()))
                .collect(Collectors.toList());
    }

}
