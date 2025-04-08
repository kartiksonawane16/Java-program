package com.patterncode;



public class Diamond {
	
	public static void main(String args[])  
	{  
	int i, j, space = 1;  

	space = 6 - 1;  
	for (j = 1; j<= 6; j++)  
	{  
	for (i = 1; i<= space; i++)  
	{  
	System.out.print(" ");  
	}  
	space--;  
	for (i = 1; i <= 2 * j - 1; i++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");  
	}  
	space = 1;  
	for (j = 1; j<= 6 - 1; j++)  
	{  
	for (i = 1; i<= space; i++)  
	{  
	System.out.print(" ");  
	}  
	space++;  
	for (i = 1; i<= 2 * (6 - j) - 1; i++)  
	{  
	System.out.print("*");  
	}  
	System.out.println("");  
	}  
	}  

}
