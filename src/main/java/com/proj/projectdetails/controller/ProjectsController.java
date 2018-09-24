package com.proj.projectdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.projectdetails.model.ProjectsObj;
import com.proj.projectdetails.services.ProjectsWebService;

@RestController 
@RequestMapping("/api/stats")
public class ProjectsController {
	
	@Autowired
	ProjectsWebService projectsWebService;
	
	@GetMapping("/hi")
	public String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/allTeams")
	public List<ProjectsObj> getAllTeamsInformation() {
		return projectsWebService.getAllTeamsInfo();
	}
	
	@GetMapping("noOfTeams/company={givenCompany}/project={givenProject}")
	public String getNoOfTeamsForGivenProject(@PathVariable final String givenCompany, @PathVariable final String givenProject) {
		return projectsWebService.getNoOfTeams(givenCompany, givenProject);
	}
	
	@GetMapping("budget/projectCode={givenProjectCode}/team={givenTeam}")
	public String getBudgetForGivenProjectAndTeam(@PathVariable final String givenProjectCode, @PathVariable final String givenTeam) {
		return projectsWebService.getBudget(givenProjectCode, givenTeam);
	}
	
	
}
