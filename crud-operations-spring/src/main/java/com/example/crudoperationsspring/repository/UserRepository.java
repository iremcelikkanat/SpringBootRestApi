package com.example.crudoperationsspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudoperationsspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
