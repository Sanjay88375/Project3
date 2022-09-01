
public class FindPrimeNumber { 
	public static void main (String[] args)
	   {		
	       int i =100;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";
	     //outer loop
	       for (i = 100; i <= 200; i++)         
	       { 		  	  
	          int counter=0; 	
	        //inner loop
	          for(num =i; num>=1; num--)
		  {
	        	  // Check conditions
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }
	       //Printing numbers
	       System.out.println("Prime numbers from 100 to 200 are :");
	       System.out.println(primeNumbers);
	   }
	}