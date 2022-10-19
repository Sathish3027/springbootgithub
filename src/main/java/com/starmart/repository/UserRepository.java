package com.starmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starmart.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
