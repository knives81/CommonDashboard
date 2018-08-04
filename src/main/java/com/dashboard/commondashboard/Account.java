package com.dashboard.commondashboard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class Account {
	  

	@Getter
	private String username;
	@Getter
	private String password;
	@Getter
	private String role;
	@Getter
	private String pushoverKey;
}
