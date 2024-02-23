package com.axis.service;

import java.util.Map;

import com.axis.model.User;

public interface TokenGeneratorService {
	Map<String,String> generateToken(User user);

}
