package com.proj.projectdetails.services.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.proj.projectdetails.services.ProjectsWebService;

@RunWith(MockitoJUnitRunner.class)
public class BudgetTests {
	
	@InjectMocks
	ProjectsWebService projectsWebService;
	
	@Test
	public void testForGERDAndDevelopment() {
		
		String result = projectsWebService.returnBudget("GERD", "Development");
		String expected = "12345$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForGERDAndTesting() {
		
		String result = projectsWebService.returnBudget("GERD", "Testing");
		String expected = "12343$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForGERDAndBusiness() {
		
		String result = projectsWebService.returnBudget("GERD", "Business");
		String expected = "123456$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForAODAndDevelopment() {
		
		String result = projectsWebService.returnBudget("AOD", "Development");
		String expected = "12345$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForAODAndTesting() {
		
		String result = projectsWebService.returnBudget("AOD", "Testing");
		String expected = "12343$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForAODAndBusiness() {
		
		String result = projectsWebService.returnBudget("AOD", "Business");
		String expected = "123456$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForNGSAndBusiness() {
		
		String result = projectsWebService.returnBudget("NGS", "Business");
		String expected = "64566$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForNGSAndTesting() {
		
		String result = projectsWebService.returnBudget("NGS", "Testing");
		String expected = "10988$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForNGSAndDevelopment() {
		
		String result = projectsWebService.returnBudget("NGS", "Development");
		String expected = "20255$";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForHCPAndDevelopment() {
		
		String result = projectsWebService.returnBudget("HCP", "Development");
		String expected = "Classified";
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForProjectXAndDevelopment() {
		
		String result = projectsWebService.returnBudget("ProjectX", "Development");
		String expected = "456789$";
		
		assertEquals(expected, result);
		
	}

}
