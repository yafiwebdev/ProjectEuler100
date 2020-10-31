
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int n=100, sumSqr=0, sqrSum = 0, sum=0;
   if(n<=0){
      cout<<"Invalid value of n";
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
        cout<<"Result is: "<<result;
   }
}
