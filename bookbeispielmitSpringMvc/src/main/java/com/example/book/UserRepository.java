package com.example.book;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
