package com.onlineexam.system.online_exam_system.Repository;

import com.onlineexam.system.online_exam_system.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom query methods here if needed
    // Example: List<User> findByName(String name);
    List<User> findByName(String name);
}