#include <iostream>
#include <math.h>
using namespace std;

int main()
{
   //Function prototype
   bool isPrime(unsigned int num);

   //local variables
   unsigned long long int sum = 2;  //start with sum include 2
   unsigned int limit = 2000000;

   for (unsigned int i = 3; i < limit; i += 2)    //skip even number
   {
      if (isPrime(i))
      {
         sum += i;
      }
   }
   cout << sum << endl;
   return 0;
}

// Function definition
bool isPrime(unsigned int num)
{
   if (num < 2) 
      return false;
   if (num == 2)   //only even number that is prime
      return true;
   if (!(num % 2))  //other even numbers: reject
      return false;
   //check modulo operation for odd numbers less than sqrt of num
   for (int i = 3; i <= sqrt(num); i += 2) 
      if (!(num % i))
         return false;
   return true;
}