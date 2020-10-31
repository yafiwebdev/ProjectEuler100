// Problem 5

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

// We can find smallest multiple in each iteration by finding least common multiple between current number and previous smallest multiple.
// We can find least common multiple (lcm) of a number by computing greatest common divisor (gcd) since gcd(a, b)*lcm(a, b) = a * b.

#include<bits/stdc++.h>
using namespace std;
long long gcd(long long x, long long y){
    if(x > y)   swap(x, y);             // ensures x < y
    if(x == 0)  return y;               
    return gcd(y%x, x);
}
int main(){
    int fin = 20;
    long long num = 1;
    for(int i = 2; i <= fin; i++){
        num = i*(num/gcd(i, num));      // finding lcm
    }
    cout << num << endl;
    return 0;
}