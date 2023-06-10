package org.wellsfargo.test.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wellsfargo.test.webapp.enitty.user;
import org.wellsfargo.test.webapp.repository.userRepository;

@Service
public class userService {
	@Autowired
	userRepository userRepository;

	public user createuser(user user) {
		return userRepository.save(user);
	}
}
