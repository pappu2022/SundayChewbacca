package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple date using index
		
		int age = 30;																//Variable
		
			
			int []ageChewbacca = new int[]{24,  45,  29,   35,   33,     28};
			//Array Index				  0	    1	 2	    3	  4	      5
			
			System.out.println("Student Age: " + ageChewbacca[5]);					//Array
			
			String []nameChewbacca = new String[]{"Joy",  "Faryian",  "Alex",   "Mamun",   "Jahid",  "Forhad"};
			//Array Index					 	    0	    1	       2	       3	      4	        5		
			
			System.out.println("Student name: " +  nameChewbacca [5]);
			
			
			System.out.println("Total Student : " +nameChewbacca.length);
			
			//Multi_Dimeentional Array
			
			int[][] ageChebacca2D = {{24,  45,  29,   35,   33,     28},	//[0][0]	[0][1][	[0][2]	[0][03]	[0][04]	[0][5]
									 {27,  45,	28}};
			
			System.out.println("Student Age 2D: " +  ageChewbacca [2]);
			
			
			//Hashmap store multiple data using Key-value pair, Implementation of Map interface
			HashMap<String,Integer> Student = new HashMap<String,Integer>();
			Student.put("Joy", 24);
			Student.put("Fariyan", 45);
			Student.put("Alex", 29);
			Student.put("Mamun", 35);
			Student.put("Jahid", 33);
			System.out.println("Student Age : " +  Student.get("Alex"));
			
			HashMap<String,String> Capital = new HashMap<String,String>();
	        Capital.put("BD", "Dhaka");
	        
	        Capital.put("USA", "Washington DC");
	        		
			System.out.println("Capital City:" + Capital.get("USA"));
			
			// Hashdet store unordered collection containing unique value, Implementation of Set interface
			
			HashSet<String> car = new HashSet<String>();
			car.add("BMW");
			car.add ("Audi");
			car.add ("Toyota");
			System.out.println("Car :" + car);
			
			// HashTable store multiple data using key-value pair, but is synchronize ( only one thread can be modified)
			
			Hashtable<String, String> Region = new Hashtable < String, String>();
			Region.put("BD", "Asia");
			Region.put("USA", "North America");
			System.out.println("Region :" + Region.get("USA"));
			
			
	}		
	}
			



	
