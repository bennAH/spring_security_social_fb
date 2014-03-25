package com.base.spring.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserConnection")
public class UserConnection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_connection_id")
	private Long userConnectionId;
	
	@OneToOne(optional=false)
    @JoinColumn(name = "userId")
	private User user;
	
	@Column(name = "providerId")
	private String providerId;
	
	@Column(name = "providerUserId")
	private String providerUserId;
	
	@Column(name = "rank")
	private Long rank;
	
	@Column(name = "displayName")
	private String displayName;
	
	@Column(name = "profileUrl")
	private String profileUrl;
	
	@Column(name = "imageUrl")
	private String imageUrl;
	
	@Column(name = "accessToken")
	private String accessToken;
	
	@Column(name = "secret")
	private String secret;
	
	@Column(name = "refreshToken")
	private String refreshToken;
	
	@Column(name = "expireTime")
	private Long expireTime;

	public UserConnection() {
		super();
	}

	public Long getUserConnectionId() {
		return userConnectionId;
	}

	public void setUserConnectionId(Long userConnectionId) {
		this.userConnectionId = userConnectionId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProviderUserId() {
		return providerUserId;
	}

	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Long getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}
	
}
