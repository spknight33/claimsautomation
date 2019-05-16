package com.big.automation.selenium_webdriver.common.config;

public class UserConfig {
	
	public String username;
	public String password;
	public String group;
	public String team;
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getGroup() {
		return group;
	}
	public String getTeam() {
		return team;
	}
	
	public UserConfig(String user, String passwd,String group,String team)
	{
		this.username = user;
		this.password = passwd;
		this.group = group;
		this.team  =team;
	}

}
