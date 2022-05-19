package com.interswitch.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.interswitch.model.LeaveManagement;
import com.interswitch.model.Users;

@Repository
public interface leaveManagementDao {
	
	
	List<LeaveManagement> getRequest(Long userId);
	Boolean saveOrUpdate(LeaveManagement leaveManagement);

}
