package com.mkj.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mkj.app.beans.Account;
import com.mkj.app.beans.CarPolicy;
import com.mkj.app.beans.Policy;

@Configuration
public class MySpringConfig {

	@Bean
	public Account getAccount()
	{
		Account a =  new Account(77, "Summit", 100, null, null, null);
		a.setPolicy(getPolicy());
		
		return a;
	}
	
	@Bean
	public Policy getPolicy()
	{
		return new CarPolicy();
	}
}
