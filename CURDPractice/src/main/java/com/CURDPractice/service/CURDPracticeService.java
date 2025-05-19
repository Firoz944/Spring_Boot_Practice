package com.CURDPractice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CURDPractice.DAO.CURDRepository;
import com.CURDPractice.entity.User;

@Service
public class CURDPracticeService {

	@Autowired
	CURDRepository curdRepository;
	
	public User saveUser(User user)
	{
		return curdRepository.save(user);
	}
	
	public List<User> getUser(){
		return curdRepository.findAll();
	}
	
	public Optional<User> getUserById(long id) {
		return curdRepository.findById(id);
	}
	
	public void deleteUser(long id) {
		curdRepository.deleteById(id);
	}
}

