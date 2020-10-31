/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

#include <iostream>
using namespace std;

int main()
{
    int a;
    int b;
    int c;
    for (a=1; a<=500; a++)
    {
      for (b=1; b<=500; b++)
      {
      c=1000-b-a;
      if (a*a+b*b-c*c == 0 && a<b )
      {
      cout<<a<<" "<<b<<" "<<" "<<c<<" "<<a*b*c<<endl;
      }
    }
  }
  return 0;
}
