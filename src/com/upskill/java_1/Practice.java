package com.upskill.java_1;

public class Practice {
	public static int hourlyincome = 55;
	
	public static void main(String[]args){
		weeklyIncomeStatic();
		
		int annualIncome = hourlyincome * 100;
		System.out.println("My Annual Income =" + annualIncome);
		
}
	
	public static void weeklyIncomeStatic (){
   int weeklyIncome = hourlyincome *20;
   
	}
}