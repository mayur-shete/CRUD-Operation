package com.task.demo.service;
import com.task.demo.entity.*;

import com.task.demo.repository.UserRepository;
import java.util.List;
import java.util.Optional;
public interface UserService {
	User saveUser(User u);
	
	List<User> fetchUserList();
	
	Optional<User> findById(int uId);
	String userAuthenticate(User u);

	

	

}
