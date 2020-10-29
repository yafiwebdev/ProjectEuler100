//Complexity analysis : Time complexity O(n);
//Since the range 0 to N is traversed only once, the time complexity of this algorithm is O(n).
/*
Logic Explanation:
	A number, x, is said to be a multiple of another number, y, if the remainder of x/y is 0. Similarly, a number, n,
	will be a multiple of 3 and 5 if the remainder of n/3 and n/5 is equal to 0.

    In order to find all the numbers from 0 to N that are multiples of 3 and 5, each number needs to be considered separately, 
	and the remainders of both n/3 and n/5 should be compared to 0.*/


#include<bits/stdc++.h> //Standard library for Competitive programming used in c++. 
using namespace std;
int find_multiple(int n){
	int sum=0;  //initializing a variable which stores sum of numbers which is dividible by 3 , 5 or 3 and 5.
	for(int i=0;i<n;i++){
		if(i%3 == 0)    //if i%3 == 0 , it means number is fully divided by 3 and we got remainder 0.
			sum += i;   // sum += i means sum = sum + i , if number is fully divisible by 3 then number is added to  sum.
		else if(i%5 ==0)    // if i%5 == 0 , it shows number is fullt divided by 5 and we got remainder 0.
			sum += i;   // sum += i means sum = sum + i , if number is fully divisible by 5 then number is added to sum.
	}
	return sum; //here value of sum is returned.
}

int main(){
	int n;
	cin >> n;  //input provided by user.
	cout << find_multiple(n) << endl; //function calling. 
	return 0;
}
