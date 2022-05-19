package com.interswitch.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.interswitch.model.LeaveRequest;

@Service
public class LeaveRequestService {
    private static List<LeaveRequest> leave_requests = new ArrayList<LeaveRequest>();
    private static int leaveRequestCount = 4;

    static {
    	leave_requests.add(new LeaveRequest(1, "interview", "Learn Spring MVC", new Date(), new Date(), false));
    	leave_requests.add(new LeaveRequest(2, "John", "Learn Struts", new Date(), new Date(), false));
    	leave_requests.add(new LeaveRequest(3, "Timothy", "Learn Hibernate", new Date(), new Date(), false));
    	leave_requests.add(new LeaveRequest(4, "Lambert", "Learn Hibernate", new Date(), new Date(), false));
    	
    }

    public List<LeaveRequest> retrieveLeaveRequests(String user) {
        List<LeaveRequest> filteredLeaveRequests = new ArrayList<LeaveRequest>();
        for (LeaveRequest leave_request : leave_requests) {
            if (leave_request.getUser().equals(user)) {
            	filteredLeaveRequests.add(leave_request);
            }
        }
        return filteredLeaveRequests;
    }
}