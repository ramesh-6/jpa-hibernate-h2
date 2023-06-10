package org.wellsfargo.test.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wellsfargo.test.webapp.enitty.user;
import org.wellsfargo.test.webapp.service.userService;

@RestController
public class usercontroller {
	@Autowired
	userService Userservice;

	@PostMapping("/user")
	public user adduser(@RequestBody user user) {
		return Userservice.createuser(user);
	}

}
