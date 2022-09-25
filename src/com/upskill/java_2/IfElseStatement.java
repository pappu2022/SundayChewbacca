package com.upskill.java_2;

public class IfElseStatement {
	
	public static int age=10;
		
	public static void main(String[] args) {
	conditionalStatement();
	}

public static void conditionalStatement(){
	
	if(age<13){
	  System.out.println ("You are a children");
	} else if (age>13 && age<18){
		System.out.println ("You are Teenage}r");
	} else if(age>65){
		//nested If Else Statement 
		if (age >100){
			System.out.println ("You are Hero");
		}else
		  System.out.println ("You are sinior citizen");
	} else{
		System.out.println ("You are adult");
}
}
}


		
			
		
	





