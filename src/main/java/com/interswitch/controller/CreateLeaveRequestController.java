package com.interswitch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.interswitch.service.LoginService;
import com.interswitch.service.LeaveRequestService;

@Controller
@SessionAttributes("name")
public class CreateLeaveRequestController {

    @Autowired
    LeaveRequestService service;

    @RequestMapping(value="/create-leave-request", method = RequestMethod.GET)
    public String showTodos(ModelMap model){
        String name = (String) model.get("name");
        model.put("leave-requests", service.retrieveLeaveRequests(name));
        return "create-leave-request";
    }
}