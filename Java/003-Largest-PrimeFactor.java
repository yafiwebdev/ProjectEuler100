
/* 
Problem 3: 
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
Solution: 
--->Check only until the square root of the number.  
---> see the code 
*/
public class LargestPrimeFactor
{
	public static void main(String[] args) {
	    largestPrimeFactor(600851475143);
		
	}
	public static void largestPrimeFactor(long num)
	{
	     long duplicate=num;
	    long temp=2;
	    long LargestFactor=1;
	    while(temp*temp<duplicate)
	    {
	        if(duplicate%temp==0)
	        {
	            duplicate=duplicate/temp;
	            //System.out.println("number after reduction"+duplicate);
	            LargestFactor=temp;
	        }
	        else
	        temp+=1;
	    }
	
	    if(duplicate>LargestFactor)
	    LargestFactor=duplicate;
	    System.out.println("The largest factor:"+LargestFactor);
	}
}
