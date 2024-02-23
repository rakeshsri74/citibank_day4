package com.axis.service;

import com.axis.exception.IncorrectPasswordException;
import com.axis.exception.UserExistsException;
import com.axis.exception.UserNotFoundException;
import com.axis.model.User;

public interface UserService {
	User registerUser(User user) throws UserExistsException;
	User authenticateUser(String email,String password)throws UserNotFoundException,IncorrectPasswordException;

}
