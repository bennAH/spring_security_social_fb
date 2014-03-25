package com.base.spring.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	public User findByUsername(String username);
	public User findByUserId(Long userId);
}
