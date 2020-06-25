package com.epam.ticket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//@AutoConfigureMockMvc
class TicketServiceApplicationTests extends AbstractTest {

	/*
	 * @Autowired private MockMvc mvc;
	 */
	
	   @Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }
	   
	   
	   
	   @Test
	   public void getTicketId1() throws Exception {
	      String uri = "/tickets/1";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      Ticket ticket = super.mapFromJson(content, Ticket.class);
	      assertTrue(ticket.getTicketId() == 1);
	   }
	   
	   @Test
	   public void createNewTicketWith2Tasks() throws Exception {
	      String uri = "/tickets/";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      Ticket ticket = super.mapFromJson(content, Ticket.class);
	      assertTrue(ticket.getTicketId() == 1);
	   }
	   
	   
}
