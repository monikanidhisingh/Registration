package com.Banking.Registration.Services;

import java.security.SecureRandom;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banking.Registration.Entity.Account;
import com.Banking.Registration.Entity.User;
import com.Banking.Registration.Repository.AccountRepository;
import com.Banking.Registration.Repository.RegistrationRepository;

@Service	
public class RegistrationService {
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	@Autowired
	AccountRepository accountRepository;
	
	private Random random = new SecureRandom();
	
	public User getUserById(Long id) 
	{
		Optional<User> opt =registrationRepository.findById(id);
		if(opt.isPresent()) {
		return opt.get() ;}
		else {
			return null;
		}
		
		
		
	}
	public void addUser(User user) throws Exception
	
	{
		registrationRepository.save(user);
		
		
		Account acc= new Account();
		Long acc_number= random.nextLong()*1000000 +100000000L;
		acc.setAccountNumber(acc_number);
		acc.setAccBal(10000l);
		acc.setUserName(user.getUserName());
		
		accountRepository.save(acc);
		
	}

}
