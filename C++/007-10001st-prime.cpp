/*
 
 
  Find the 10001st prime.
 
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
  we can see that the 6th prime is 13.
  What is the 10001st prime number?
 
 */

#include <iostream>

using namespace std;

int main()
{
    const int max = 10001;
    int count = 0;
    int i, j;

    for (i = 2; ; i++) {
            for (j = 2; j < i; j++)
                    if (i % j == 0)
                            break;
            if (i == j) {
                    count++;
                    if (count == max)
                            break;
            }
    }
    cout << max << "st prime number is: " << i;
}
