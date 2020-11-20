package com.subr.cmps.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.subr.cmps.dao.UserDao;
import com.subr.cmps.dto.UserDto;
import com.subr.cmps.repository.UserRepository;
import com.subr.cmps.util.ErrorResponse;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin

public class AuthenicationController {

	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/login")
	public String  login(@RequestBody UserDto user) {
		
		UserDao userDao=userRepository.findByUserName(user.getUserName());
		Gson json =new Gson();
		if(userDao != null && user.getPassword().equals(userDao.getPassword())) {
			return json.toJson(userDao);
		}
		ErrorResponse errorResponse =new ErrorResponse();
		errorResponse.setErrorResponse("FAIL");
		return json.toJson(errorResponse);
		
	}
	@PostMapping("/register")
	public String register(@RequestBody UserDto user) {
		UserDao dao=new UserDao();
		user.setToken("emp");
		BeanUtils.copyProperties(user, dao);
		UserDao save = userRepository.save(dao);
		Gson json =new Gson();
		if(save != null) {
			return json.toJson(save);
		}
		ErrorResponse errorResponse =new ErrorResponse();
		errorResponse.setErrorResponse("FAIL");
		return json.toJson(errorResponse);
		
	}
}
