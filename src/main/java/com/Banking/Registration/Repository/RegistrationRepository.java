package com.Banking.Registration.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Banking.Registration.Entity.User;

@Repository
public interface RegistrationRepository extends JpaRepository<User, Long>{
	
	

}
