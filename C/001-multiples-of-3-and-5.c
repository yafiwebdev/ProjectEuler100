
/* 
	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
*/

#include<stdio.h>

int main(){
    int num, sum=0;
    scanf("%d", &num);
    for(int i=3; i<=num; i++){  //Interating from 3 to specified number
        if (i%3 == 0 || i%5 == 0)  //checking whether the value stored in i is a multiple of three or( '||' )five
            sum += i;   //Equivalent for sum = sum + i;
    }
    printf("%d", sum);    //Prints the sum
    return 0;
}