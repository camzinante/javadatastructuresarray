package dataStructuresArray;

public class Main {
	public static void main(String[] args) {
	
		     int[] Array = {3, 54, 78, 22, 9}; 
	
		         int sum = 0;  
		         int i;  
		        
		        
		         for (i = 0; i < Array.length; i++) 
		         { 
		            sum += Array[i]; 
		         }   
		            	System.out.println("Hey guys! The sum of the array is:");
		         	System.out.print(sum);
		
			double [ ] ArrayAgain = {3, 54, 78, 22, 9};
		        double maximum = Array[0];
		        int index = 0;
		         	
		         	for (int i1 = 1; i1<ArrayAgain.length; i1++) 
				{
		         		if (ArrayAgain[ i1 ] > maximum) 
					{
		         			maximum = ArrayAgain [ i1 ];
		         			index = i1;
		         		}
		         	}
		         // Am I doing something wrong here? I thought when I ran it, I'd get the sum, and then right below it the index? Is it where my system out is positioned? 	
		         System.out.println(index);
	
	}

}
