package com.app.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.app.entity.NewApplication;
import com.app.service.Interfaces.ICustomerService;



@SpringBootTest
public class NewApplicationTest {

	@Autowired
	 ICustomerService customerService;
	
    @MockBean
    NewApplicationRepository repo;
    
    @Test
    public void saveTest() {
    	 NewApplication accountopen = new NewApplication();
    	 accountopen.setAadhar("3456234567fgfdsfvfvf643"); 
    	 accountopen.setEmail("abc@gmail.com");
    	 accountopen.setFullname("abc");
    	 accountopen.setMobile("99999999");
    	 accountopen.setPan("AGd45J");
    	 accountopen.setTitle("mr");
    	
    	when(repo.save(accountopen)).thenReturn(accountopen);
    	
    	assertEquals(accountopen, customerService.save(accountopen));
    	
    }
	

}