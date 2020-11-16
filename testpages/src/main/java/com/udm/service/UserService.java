package com.udm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udm.domain.User;
import com.udm.repo.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	    private UserRepository repo;
	 
	 public List<User> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(User std) {
	        repo.save(std);
	    }
	     
	    public User get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
}
