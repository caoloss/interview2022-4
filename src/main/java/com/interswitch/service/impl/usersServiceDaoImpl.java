package com.interswitch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interswitch.model.Users;
import com.interswitch.service.usersServiceDao;
import com.interswitch.dao.usersDao;;

@Service
public class usersServiceDaoImpl implements usersServiceDao {

	@Autowired
	private usersDao usersDao;
	
	@Override
	public List<Users> getUser(String username, String password, String institution_code) {
		// TODO Auto-generated method stub
		return usersDao.getUser(username, password, institution_code);
	}

}
