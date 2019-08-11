package com.jatin.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		//Coach theCoachObj = new BaseballCoach();  //use interface
		Coach theCoachObj = new TrackCoach();
		
		//use the object
		System.out.println(theCoachObj.getDailyWorkout()); //can work with any coach implementation

	}

}
