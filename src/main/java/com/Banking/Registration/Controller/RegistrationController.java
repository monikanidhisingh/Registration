package com.Banking.Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Banking.Registration.Entity.User;
import com.Banking.Registration.Services.RegistrationService;

@RestController
@RequestMapping("/reg")
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	@GetMapping("/{id}")
		public User getUserById(@PathVariable Long id) throws Exception{
		return  registrationService.getUserById(id);
	}
	
	@PostMapping("/add")
	public void addUser(@RequestBody User user) throws Exception{
		if(user.getUserName()==null||user.getPassword()==null||
				user.getEmail()==null||user.getDob()==null||user.getGender()==null||
				user.getPhone()==null||user.getPan()==null) {
			throw new Exception ("Please fill the value");
		}else
		registrationService.addUser(user);
	} 
	
}
