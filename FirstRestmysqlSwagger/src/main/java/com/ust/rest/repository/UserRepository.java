package com.ust.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.rest.resources.User;

public interface UserRepository extends JpaRepository<User,Long> { // Persist one resource they are tighthly coupled.

}
