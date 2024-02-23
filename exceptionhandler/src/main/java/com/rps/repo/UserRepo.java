package com.rps.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rps.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
