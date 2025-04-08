package com.patterncode;

public class other_triangle {
	
	public static void main(String[] args) 
    {
	//i for rows and j for columns      
	//row denotes the number of rows you want to print  
	int i, j;       
	//Outer loop work for rows  
	for (i=0; i<6; i++)   
	{  
		//inner loop work for space      
		for (j=2*(6-i); j>=0; j--)         
		{  
			//prints space between two stars      
			System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
			//prints star      
			System.out.print("* ");   
		}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   
}
}
