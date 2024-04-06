package com.jetbrains.cristi.notite.criptate.repository;

import com.jetbrains.cristi.notite.criptate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
