package com.example.match.mypage.database;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor   // JPA 기본 생성자
@AllArgsConstructor  // 모든 필드 생성자 (편의용)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}