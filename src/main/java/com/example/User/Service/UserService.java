package com.example.User.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User.Beans.User;
import com.example.User.Entity.UserEntity;
import com.example.User.Exceptions.UserNotFoundException;
import com.example.User.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public User findById(Integer id) {
		
	
	
		Optional<UserEntity> findById = repo.findById(id);
	
	if(!findById.isPresent()) {
		throw new  UserNotFoundException();
	}
	UserEntity ue = findById.get();
	return new User(ue.getUserId(),ue.getUserName(),ue.getUserAge(),ue.getUserPhone(),ue.getUserDob());
		
		
	}
	
	

}
