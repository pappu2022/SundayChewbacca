package com.upskill.java_4;

public class Ploymorphism {
	private static int hourlyIncome;

	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car();
		car(4);
		car(2, 4);
		car("Pink");
		//changed color from red to blue
		weeklyIncomeStatic();
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public static void weeklyIncomeStatic(){
		int weeklyIncome = hourlyIncome * 40 +3000;
		System.out.println("My Weekly Income = " + weeklyIncome);	
	}

	
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Audi ! ");
	}
	
	public static void car(int door){
		System.out.println("My car is Audi, it has door : " + door);
	}
	
	public static void car(int door, int wheel){
		System.out.println("My car is Audi, it has door : " + door + " it has wheel : " + wheel);
	}
	
	public static void car(String color){
		System.out.println("My car is Audi, it has color : " + color);
	}

}

