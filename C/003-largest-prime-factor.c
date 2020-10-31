
/* 
    The prime factors of 13195 are 5, 7, 13 and 29.
    The largest among them is 29
    Write a program to find the largest prime factor of a number?
*/

#include<stdio.h>
#include<math.h>

int main(){
    long limit, maxPrimeFactor, i;
    scanf("%ld", &limit);
    /*
    First divide the number by 2 for highest possible times in order to reduce it.
    */
    while(limit % 2 == 0){
        limit /= 2;
        maxPrimeFactor = 2;
    }
    /* 
    It is a convention that the prime factor would always be less than or equal to square root of the number 
    */
    for(i=3; i <= sqrt(limit); i = i+2){  //Increment by 2 for getting only odd numbers
        while(limit % i == 0){
            maxPrimeFactor = i;
            limit /= i;
        }
    }
    if(limit > 2){
        maxPrimeFactor = limit;
    }
    printf("%ld", maxPrimeFactor);
    return 0;
}