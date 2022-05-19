package com.interswitch.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.interswitch.dao.usersDao;
import com.interswitch.model.Users;


@Repository
@Transactional
public class usersDaoImpl implements usersDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Users> getUser(String username, String password, String institution_code) {
		// TODO Auto-generated method stub
		
		String query = "FROM Users as user WHERE username=?1 AND password=?2 AND institutionId.institutionCode=?3";
		
		
		
		return (List<Users>) entityManager.createQuery(query).setParameter(1, username).setParameter(2, password).setParameter(3, institution_code).getResultList();
	}

}
