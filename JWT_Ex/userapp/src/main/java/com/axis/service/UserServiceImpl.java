package com.axis.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.exception.IncorrectPasswordException;
import com.axis.exception.UserExistsException;
import com.axis.exception.UserNotFoundException;
import com.axis.model.User;
import com.axis.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) throws UserExistsException {
		final boolean existById = this.userRepository.existsById(user.getUserId());
		if(existById) {
			throw new UserExistsException("User Already Exists");
		}
		return this.userRepository.save(user);
	}

	@Override
	public User authenticateUser(String email, String password)
			throws UserNotFoundException, IncorrectPasswordException {
		final Optional<User> optionalUser = this.userRepository.findByEmailAndPassword(email, password);
		if(optionalUser.isEmpty()) {
			throw new UserNotFoundException("User Not Found");
		}
		return optionalUser.get();
	}
	
	

}
