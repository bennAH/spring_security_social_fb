Basic login & logout functionality including:
-	in-memory auth store
-	access decision manager config
-	decision voters config
-	custom login & logout pages
-	remember me
-	change & forgot password

--------------------
Basic Role Config

	<http auto-config="true" access-decision-manager-ref="unanimousBased">
		<intercept-url pattern="/*" access="ROLE_USER" />
	</http>
		
	<!-- intercepts requests -->
	<authentication-manager alias="authenticationManager">
		<authentication-provider>
			<user-service>
				<user authorities="ROLE_USER" name="guest" password="guest" />
			</user-service>
		</authentication-provider>
	</authentication-manager>
	
	<beans:bean class="org.springframework.security.access.vote.UnanimousBased" id="unanimousBased">
		<beans:property name="decisionVoters">
			<beans:list>
				<beans:ref bean="roleVoter" />
				<beans:ref bean="authenticatedVoter" />
			</beans:list>
		</beans:property>
	</beans:bean>
	
	<beans:bean class="org.springframework.security.access.vote.RoleVoter" id="roleVoter" />
	<beans:bean class="org.springframework.security.access.vote.AuthenticatedVoter" id="authenticatedVoter" />
--------------------

Logout URL config

<http auto-config="true" use-expressions="true">
		<intercept-url pattern="/login*" access="permitAll" />
		<intercept-url pattern="/*" access="hasRole('ROLE_USER')" />
		
		<form-login login-page="/login" />
		
		<logout invalidate-session="true"
			logout-success-url="/"
			logout-url="/logout" />
	</http>
--------------------

Logout success handler config

	<http auto-config="true" use-expressions="true">
		<intercept-url pattern="/login*" access="permitAll" />
		<intercept-url pattern="/*" access="hasRole('ROLE_USER')" />
		
		<form-login login-page="/login" />
		
		<remember-me key="spring_sec_base" />
		
		<logout invalidate-session="true"
			logout-url="/logout"
			success-handler-ref="logoutSuccessHandler"/>
	</http>
	
	<beans:bean id="logoutSuccessHandler" class="com.base.spring.security.LogoutSuccessHandler" >
    	<beans:constructor-arg value="/" />
	</beans:bean>
		
	<!-- intercepts requests -->
	<authentication-manager alias="authenticationManager">
		<authentication-provider>
			<user-service>
				<user authorities="ROLE_USER" name="guest" password="guest" />
			</user-service>
		</authentication-provider>
	</authentication-manager>
	
	
--------------------

Authentication manager config

	<!-- intercepts requests -->
	<authentication-manager alias="authenticationManager">
		<authentication-provider user-service-ref="userAuthProvider" />
	</authentication-manager>
	
	<beans:bean id="userAuthProvider" class="com.base.spring.security.UserAuthProvider" />