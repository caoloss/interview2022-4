package com.interswitch.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.interswitch.dao.leaveManagementDao;
import com.interswitch.dao.usersDao;
import com.interswitch.model.LeaveManagement;
import com.interswitch.model.Users;


@Repository
@Transactional
public class leaveManagementDaoImpl implements leaveManagementDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<LeaveManagement> getRequest(Long userId) {
		// TODO Auto-generated method stub
		
		String query = "FROM LeaveManagement as leave_management WHERE userId=?1";
		
		
		
		return (List<LeaveManagement>) entityManager.createQuery(query).setParameter(1, userId).getResultList();
	}


	@Override
	public Boolean saveOrUpdate(LeaveManagement leaveManagement) {
		// TODO Auto-generated method stub
		
		LeaveManagement saveLeave = entityManager.merge(leaveManagement);
		if(saveLeave!=null) {
			
			return true;
			
		}else {
			
			return false;
		}
		
	}

}
