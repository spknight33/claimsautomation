package com.big.automation.selenium_webdriver.common.config;

public class UserConfig {
	
	public String username;
	public String password;
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public UserConfig(String user, String passwd)
	{
		this.username = user;
		this.password = passwd;
	}

}
