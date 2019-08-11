package com.jatin.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: "+fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff(){
		System.out.println("app starts here");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("app stops here");
	}
}
