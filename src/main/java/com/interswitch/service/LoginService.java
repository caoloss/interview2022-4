package com.interswitch.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userid, String password, String institution_code) {
        // interview, interview
        return userid.equalsIgnoreCase("interview")
                && password.equalsIgnoreCase("interview")
                && institution_code.equalsIgnoreCase("cbs");
    }

}