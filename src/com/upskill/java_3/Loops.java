package com.upskill.java_3;

public class Loops {
	
	/*
	 Type of Loops
	 1. For Loop
	 2. While Loop
	 3. Do While
	 4. Infinite Loop
	 5. Nested Loop
	 */
	
	public static void main(String[] args) {        
		//practiceForLoop();							
		//practiceWhileLoop();		
		//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		//practiceNestedLoop();
		WhileLoop();
	}												
	
	public static void practiceForLoop(){						//For Loop- Do again and again up to upper limit
		int i;													//Initialize the variable 
		for (i=1; i<=20; i++){									//Setting Lower limit, Upper limit, Increment or decrement
			System.out.println("For Loops Number="+i);			// Statement
		}
	}

		
	public static void practiceWhileLoop(){							//While Loop-Do again and again up to condition match
		int i=1;													//Initializing variables
		while(i<10){												//Setting condition
			System.out.println("While Loops Number="+i);			//Statement
			i++;													//Increment of decrement
		}
	}
	public static void practiceDoWhileLoop(){						//Do While Loop- Do action then match condition
		int i=1;													//Initialize the variable
		do{
			System.out.println("Do While Loops Number="+i);			//Statement
			i++;													//Increment or decrement
		} while (i<=10);											//Checking Condition
}
	
	public static void practiceInfiniteLoop(){						//Infinite Loop - Never ending loop
		int i;														//Initialize the variable 
		for (i=1;  ;i++){											//Setting Lower limit, Upper limit
			System.out.println("For Loops Number="+i);				//Statement
		}
	}

	public static void practiceNestedLoop(){                        // Nested loop = loop inside another loop
		int i;														//Initialize the variable i
		int j;														//Setting upper limit j
		for(i =1; i <=10; i++){										//First loop for i
			for(j=1; j<=10; j++){									//First loop for j
				int multipicationTable= i*j;						//Statement for j loop
				System.out.print(multipicationTable +" ");
			}
			System.out.println(" ");
		}
		
	}


public static void WhileLoop(){
	int i=1;
while(i<20){
System.out.println("While Loops Numer="+i);
i++;
}
}}
