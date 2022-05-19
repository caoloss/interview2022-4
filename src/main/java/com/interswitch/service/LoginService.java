package com.interswitch.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Service;

import com.interswitch.model.Users;
import com.interswitch.service.impl.usersServiceDaoImpl;

@Service
public class LoginService {

	@Autowired
	private usersServiceDaoImpl usersService;
	
    public boolean validateUser(String username, String password, String institution_code) {
        // username, password, institution_code
    	
    	
    	List<Users> user = usersService.getUser(username, password, institution_code);
    	if(user==null) {
    		System.out.println("List is Empty");
    		return false;
    	}
    	else if(user!=null) {
    		

    		if(user.size()>0) {
    			
    			return true;
    			
    		}else
    		{
    			return false;
    		}
    			
    		
    	}
    	else {
    		System.out.println("No result");
    		
    		return false;
    	}
    	
    	
    }

}