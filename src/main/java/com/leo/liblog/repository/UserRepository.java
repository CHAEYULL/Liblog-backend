package com.leo.liblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.liblog.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
