package com.proj.projectdetails.services;


import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.proj.projectdetails.model.ProjectsObj;


@Service
public class ProjectsWebService {
	
	List<ProjectsObj>  projectsList = new ArrayList<ProjectsObj>();
	List<ProjectsObj>  result;
	HashMap<String, String> hmap = new HashMap<String, String>();
	
	
	HashSet<String> projCodeSet = new HashSet<String>();
	HashSet<String> AOD = new HashSet<String>();
	HashSet<String> NGS = new HashSet<String>();
	HashSet<String> GERD = new HashSet<String>();
	HashSet<String> HCP = new HashSet<String>();
	HashSet<String> ProjectX = new HashSet<String>();
	
	// Returns all Data
	public List<ProjectsObj> getAllTeamsInfo() {
		
		result = initializeCSV();
		return result;
	}
	
	// Returns Number of Teams for given company and project
	public String getNoOfTeams(String givenCompany, String givenProject) {
		
		int noOfTeams = returnNoOfTeams(givenCompany, givenProject);

		
		return "Total number of teams in " + givenCompany + " working on " + givenProject + " : " + noOfTeams;
	}
	
	public int returnNoOfTeams(String givenCompany, String givenProject) {
		result = initializeCSV();
		
		int teamNumber = 0;
		for(ProjectsObj proj: result) {
			if(proj.getCompany().equals(givenCompany) && proj.getProject().equals(givenProject)) {
				teamNumber++;
			}
		}
		return teamNumber;
	}
	
	// Returns the budget for given project code and team
	public String getBudget(String givenProjectCode, String givenTeam) {
		
		String budget = returnBudget(givenProjectCode, givenTeam);
		
		return givenTeam + " team's budget for " + givenProjectCode + " is : " + budget;
	}
	
	public String returnBudget(String givenProjectCode, String givenTeam) {
		result = initializeCSV();
		String budg = "";
		for(ProjectsObj proj: result) {
			if(proj.getProjectCode().equals(givenProjectCode) && proj.getTeam().equals(givenTeam)) {
				budg = proj.getBudget();
			}
		}
		return budg;
	}
	
	// Reads CSV files and returns an Unique List of Project Objects
	public List<ProjectsObj> initializeCSV(){
		
		try {			
			
			String fileName = "csv/test.csv.txt";
			
			ClassLoader classLoader = ClassLoader.getSystemClassLoader();
			
			File file = new File(classLoader.getResource(fileName).getFile());
			
			//FileReader filereader = new FileReader("/Users/akashgoled/Documents/springworkspace/CompaniesAndProjects/src/main/resources/csv/test.csv.txt"); 
			FileReader filereader = new FileReader(file.getPath());
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord; 
	        
	        // To ignore 1st header in csv
	        csvReader.readNext();
	        
	        while ((nextRecord = csvReader.readNext()) != null) { 

					ProjectsObj projects = new ProjectsObj(nextRecord[0], nextRecord[1], nextRecord[2], nextRecord[3], nextRecord[4]);
					
					
					switch(projects.getProjectCode()) {
					case "AOD":
						if(!AOD.contains(projects.getTeam())) {
							projCodeSet.add(projects.getProjectCode());
							AOD.add(projects.getTeam());
							projectsList.add(projects);
							break;
						}else {
							break;
						}
					case "NGS":
						if(!NGS.contains(projects.getTeam())) {
							projCodeSet.add(projects.getProjectCode());
							NGS.add(projects.getTeam());
							projectsList.add(projects);
							break;
						}else {
							break;
						}
					case "GERD":
						if(!GERD.contains(projects.getTeam())) {
							projCodeSet.add(projects.getProjectCode());
							GERD.add(projects.getTeam());
							projectsList.add(projects);
							break;
						}else {
							break;
						}
					case "HCP":
						if(!HCP.contains(projects.getTeam())) {
							projCodeSet.add(projects.getProjectCode());
							HCP.add(projects.getTeam());
							projectsList.add(projects);
							break;
						}else {
							break;
						}
					case "ProjectX":
						if(!ProjectX.contains(projects.getTeam())) {
							projCodeSet.add(projects.getProjectCode());
							ProjectX.add(projects.getTeam());
							projectsList.add(projects);
							break;
						}else {
							break;
						}
					}
					
	        } 
	        
	        csvReader.close();
			
		}catch(Exception e) {
			e.getMessage();
		}
		

		
		return projectsList;
		
	}
	
	
}
;