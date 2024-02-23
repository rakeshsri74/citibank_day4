package com.rps.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rps.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
