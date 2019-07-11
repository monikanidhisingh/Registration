package com.Banking.Registration.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banking.Registration.Entity.User;
import com.Banking.Registration.Repository.RegistrationRepository;

@Service
public class LoginService {
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	


}
