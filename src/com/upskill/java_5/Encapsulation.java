package com.upskill.java_5;

public class Encapsulation {
	
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name ="upskill";				//write & read
	private int ssn = 512456125;				//write only
	private String username = "upskill";		//read only
	
	
	//Setter Method - name
	public void setName(String value){          //Set the data
	name = value;
	}
	
	
	
	//Getter Method-name
	public String getName(){					//get the data, read
		return name;
	}
	
	
	
	//Setter Method - ssn
	public void setSSN(int value){            //Set the data, write
	ssn = value;
	}

	
	
		public String getUsername(){
			return username;		
		}
		
	 public static void main(String[] args){
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(452153523);
		System.out.println(obj.getUsername());
		
	}

	}


