package com.interswitch.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.interswitch.model.Users;

@Repository
public interface usersDao {
	
	
	List<Users> getUser(String username, String password, String institution_code);
	

}
