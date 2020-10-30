
/*
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: As 1! = 1 and 2! = 2 are not sums they are not included.
*/

#include<stdio.h>

//Program to find factorial of a specific number passed from the while loop in main function
int fact(int number){
    int factorial=1;
    for (int i=2; i<=number; i++){
        factorial *= i;
    }
    return factorial;
}

int main(){
    int input, currentNum, total=0;
    scanf("%d", &input);
    int value = input;  //Taking a copy before passing it into while loop.
    while(value>0){
        currentNum = value%10;  //Get every single digits from the input value
        total += fact(currentNum);  //Calculates factorial of seperate digits of a number and sums it up
        value /= 10;  //Update value in order to get every single digits from the input value
    }
    if(total == input)  //Checking whether the factorial of each number is equal to 
        printf("It is a digit factorial");
    else
        printf("It is not a digit factorial");
}