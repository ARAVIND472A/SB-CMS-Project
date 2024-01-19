package com.cms;
import static org.testng.Assert.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Order;


import com.cms.bean.Customer;
import com.cms.controller.CMSController;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class SbCmsApplicationTests {
	
	 @Autowired
	    CMSController controller;
	    String insert;
	    String update;
	    String delete;
	    String result;
	    String result1;
	    
	    List<Customer> list = new ArrayList<Customer>();
	    List<Customer> list1 = new ArrayList<Customer>();
	    
	    
	    Customer mv= new Customer(13,"jeban","jaban@gmail.com","8923456789","Madurai");
	    Customer mv1= new Customer(13,"Dom","Dom@gmail.com","9456789345","Chennai");
        Customer mv2;
        Customer mv3;
        
        
 
	@Test
	@Order(1)
	void contextLoads() {
	}
	
	@Test
    @Order(2)    
    public void testPerformInsert() {
        insert="Inserted";
        result=controller.performInsert(mv);
       assertEquals(insert, result);
    }
	
	@Test
    @Order(3)
    public void testPerformUpdate() {
        update="Updated";
        result=controller.performUpdate(mv1);
        assertEquals(update,result);
    }
	
	
	 @Test
	    @Order(4)
	    public void testPerformDelete() {
	        delete="Deleted";
	        result=controller.performDelete(13);
	        
	        assertEquals(delete,result);
	    }
	 
	 @Test
	    @Order(5)
	    public void testGetAllMovieDetails() {
	        list1=controller.viewAllPatient();
	    	mv2=new Customer(101,"samsumg","kumar@gmail.com","8907654345","Madurai");
	    	mv3=new Customer(102,"purush","purush@gmail.com","8906789056","madurai");
	        list.add(mv2);
	        list.add(mv3);
	        
	        
	        list.equals(list1);
	    }
    

}
