/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

#include <stdio.h>
#include <math.h>

void PythagorusTripletProduct(int);
void main () {
    PythagorusTripletProduct(1000);    
}

void PythagorusTripletProduct (int sum) {

    int a,b,c;
    for (a = 1; a < sum/3; a++) {
        for (b = a + 1; b < sum/2; b++) {
            // a + b + c = sum
            c = sum - b - a;
            // check if a^2 + b^2 = c^2
            if (pow(a, 2) + pow(b, 2) == pow(c, 2)) {
                printf("The Pythagorean triple is  %d, %d, %d and the sum is %d \n", a, b, c, sum);
                printf("The product abc is: %d", (a*b*c));
                break;
            }
        }
    }

}

