package com.example.match.mypage.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // 데이터 삽입
//        userRepository.save(new User(null,"alice", "alice@example.com"));
//        userRepository.save(new User(null,"bob", "bob@example.com"));

        // 데이터 조회
        System.out.println("=== 모든 사용자 조회 ===");
        userRepository.findAll().forEach(user ->
                System.out.println(user.getId() + " | " + user.getUsername() + " | " + user.getEmail())
        );
    }
}