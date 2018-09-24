package com.proj.projectdetails.model;



public class ProjectsObj {
	
	private String Company;
	private String Project;
	private String ProjectCode;
	private String Budget;
	private String Team;
	
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getProject() {
		return Project;
	}
	public void setProject(String project) {
		Project = project;
	}
	public String getProjectCode() {
		return ProjectCode;
	}
	public void setProjectCode(String projectCode) {
		ProjectCode = projectCode;
	}
	public String getBudget() {
		return Budget;
	}
	public void setBudget(String budget) {
		Budget = budget;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	
	public ProjectsObj() {
		
	}
	
	
	public ProjectsObj(String Company, String Project, String ProjectCode, String Budget, String Team) {
		super();
		this.Company = Company;
		this.Project = Project;
		this.ProjectCode = ProjectCode;
		this.Budget = Budget;
		this.Team = Team;
		
	}
	

	

}
