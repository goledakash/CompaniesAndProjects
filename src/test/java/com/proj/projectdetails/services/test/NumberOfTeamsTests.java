package com.proj.projectdetails.services.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.proj.projectdetails.services.ProjectsWebService;

@RunWith(MockitoJUnitRunner.class)
public class NumberOfTeamsTests {
	
	@InjectMocks
	ProjectsWebService projectsWebService;
	
	@Test
	public void testForAcmeAndOffshore() {
		
		int result = projectsWebService.returnNoOfTeams("Acme", "Offshoredrilling");
		int expected = 3;
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testForAcmeAndNaturalGas() {
		
		int result = projectsWebService.returnNoOfTeams("Acme", "NaturalGasSupply");
		int expected = 3;
		
		assertEquals(expected, result);
		
	}
	@Test
	public void testForAcmeAndGreenEnergy() {
		
		int result = projectsWebService.returnNoOfTeams("Acme", "GreenEnergyR&D");
		int expected = 3;
		
		assertEquals(expected, result);
		
	}
	@Test
	public void testForABCAndHealthcare() {
		
		int result = projectsWebService.returnNoOfTeams("AbcTechnologies", "HealthcarePortal");
		int expected = 1;
		
		assertEquals(expected, result);
		
	}
	@Test
	public void testForABCAndSmartPhone() {
		
		int result = projectsWebService.returnNoOfTeams("AbcTechnologies", "SmartPhonePrototype");
		int expected = 1;
		
		assertEquals(expected, result);
		
	}
	
	

}
