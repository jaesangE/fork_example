package com.example.match.mypage.database;

import com.example.match.mypage.database.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 기본 CRUD는 JpaRepository가 제공
}