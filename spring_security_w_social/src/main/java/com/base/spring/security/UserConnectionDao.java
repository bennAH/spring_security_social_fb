package com.base.spring.security;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserConnectionDao extends JpaRepository<UserConnection, Long> {

	public UserConnection findByUser(User user);
	
	public List<UserConnection> findByProviderIdAndProviderUserId (String providerId, String providerUserId);
}
