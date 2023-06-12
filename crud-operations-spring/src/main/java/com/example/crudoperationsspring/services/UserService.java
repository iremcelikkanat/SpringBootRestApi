package com.example.crudoperationsspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crudoperationsspring.entities.User;
import com.example.crudoperationsspring.repository.UserRepository;



@Service
public class UserService {

	UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();	}

	public User saveOneUSer(User newUser) {
		return userRepository.save(newUser);
	}

	public User getOneUser(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	public User updateOneUser(Long userId, User newUser) {
		Optional<User> user=userRepository.findById(userId);
		if(user.isPresent()) {
			User foundUser=user.get();
			foundUser.setUserName(newUser.getUserName());
			foundUser.setSurName(newUser.getSurName());
			userRepository.save(foundUser);
			return foundUser;
		}
		else {
			return null;
	}

}

	public void deleteById(Long userId) {
     userRepository.deleteById(userId);	
	}
}