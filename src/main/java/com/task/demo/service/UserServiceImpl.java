package com.task.demo.service;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.demo.entity.User;
import com.task.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
		
	}

	@Override
	public List<User> fetchUserList() {
		// TODO Auto-generated method stub
		return (List<User>)userRepository.findAll();
	}
	@Override
	public Optional<User> findById(int uId) {

        return userRepository.findById(uId);
    }

	@Override
	public String userAuthenticate(User u) {
		Optional<User> userdata=userRepository.findById(u.getuId());
		if(userdata.isPresent()) {
			User u1=userdata.get();
			if(u1.getPass().equals(u.getPass())&& u1.getuName().equalsIgnoreCase(u.getuName()))
			{
				return "logIn Successfull";
			}
			else{
					return "LogIn Unsuccessfull";
					
				}
		}
		return "Invalid user";
	}
	

	
	
	

}
