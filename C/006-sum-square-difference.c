#include <stdio.h>
#include <math.h>

int main()
{
    int n=100, sumSqr=0, sqrSum = 0, sum=0;
    if(n<=0){
    printf("Invalid value of n");
    }
       else{
          // Use pow to raise the initial value
            for(int i = 1; i <= n; i++) {
                //The sum of the squares 
                sumSqr = sumSqr + pow(i,2);
                sum=sum+i; 
            }
            //The square of the sum 
            sqrSum = pow(sum,2);
            int result = sqrSum-sumSqr;

	    printf("Result = %d\n", result);
       }

    return 0;
}
