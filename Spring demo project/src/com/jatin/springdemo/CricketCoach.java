package com.jatin.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach: inside setter method - setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket coach: inside no-arg argument");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
