#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

/*
	https://projecteuler.net/problem=4
	Largest palindrome product
	Problem 4
	A palindromic number reads the same both ways. 
	The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	Find the largest palindrome made from the product of two 3-digit numbers.
*/

/*
 * Function: isPalindrome
 * ----------------------------
 *   Determines if the passed in integer is a palindrome by first converting into a string
 *   and comparing both the characters at the ends of the string to each other
 *   num: The specified integer 
 *
 *   returns: boolean variable
 */
bool isPalindrome(int num){
    //Fits any int 
    char str[12];
    sprintf(str, "%d", num);
    int startIdx = 0; 
    int endIdx = strlen(str) - 1;
    bool retVal = true;
    while(endIdx > startIdx){
        char left = str[startIdx];
        char right = str[endIdx];
        endIdx--;
        startIdx++;
        //Not a palindrome
        if(left != right){
            retVal = false;
            break;
        }
    }
    return retVal;
}

/*
 * Function: getLargestNthDigitPalindromeProduct
 * ----------------------------
 *   Calculates the largest palindrome made from the product of two n-digit numbers.
 *   n: To how many digits do you want to calculate the palindrome. 
 *   (e.g  n = 2 max is 99 min is 10, n = 3 max is 999 min is 100)
 *
 *   returns: largestPalidrome number that is a product of n-digit numbers 
 */

int getLargestNthDigitPalindromeProduct(int n){
    // Use n to calculate the nth digit max num and min num
    char* max = (char*)malloc((n+1) * sizeof(char));
    int largestFound = -1;
    int minNum = pow(10,n - 1);
    int counter = n;
    while(counter){
        strcat(max, "9");
        counter--;
    }
    int maxNum = atoi(max);
    for (int i = maxNum; i >= minNum; i--){
        for (int j = maxNum; j >= minNum; j--){
            int prod = i * j;
            if( largestFound < prod && isPalindrome(prod)){
                largestFound = prod;
            }
        }
    }
    printf("Largest found palindrome product for %d digit numbers is [%d].", n, largestFound);
    return largestFound;
}

int main(){   
    int result = getLargestNthDigitPalindromeProduct(3);
    return 0;
}

