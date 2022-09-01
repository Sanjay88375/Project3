
public class Pattern_L {   
	public static void main(String args[])   
	{   
	//i for rows and j for columns      
	//row denotes the number of rows you want to print  
	int i, j, row=5;   
	//outer loop for rows  
	for(i=0; i<row-1; i++)   
	{ 
		//prints stars
		System.out.println("* ");   
	} 
	for(i=4; i<row; i++)   
	{   
	//inner loop for columns  
	for(j=0; j<=i; j++)   
	{   
	//prints stars   
	System.out.print("* ");   
	}  
	}
	}

}
