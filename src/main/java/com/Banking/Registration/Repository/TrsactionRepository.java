package com.Banking.Registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Banking.Registration.Entity.Transaction;



@Repository

public interface TrsactionRepository extends JpaRepository<Transaction, Long>{

}