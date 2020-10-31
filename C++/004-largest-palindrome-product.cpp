#include<bits/stdc++.h>

using namespace std;

bool checkpalindrome(long long x){
    long long fwd = x, rev = 0;

    //reverse digits
    while(fwd > 0){
        rev *= 10;
        rev += fwd % 10;
        fwd /= 10;
    }
    fwd = x;

    //check if reverse = forward
    while(fwd > 0){
        if(fwd % 10 != rev % 10)    return false;
        fwd /= 10;
        rev /= 10;
    }

    return true;
}

int main(){
    long long max_palindrome = 0;
    int digit = 3;
    long long upper_bound = pow(10, digit) - 1;
    long long lower_bound = pow(10, digit - 1);

    //loop through all 3 digit pairs
    for(long long i = upper_bound; i >= lower_bound; i--){
        if(i * i < max_palindrome)    break;
        for(long long j = i; j >= lower_bound; j--){
            if(i * j < max_palindrome)  break;

            //find max palindrome
            if(checkpalindrome(i * j)){
                max_palindrome = max(max_palindrome, i * j);
            }
        }
    }
    cout << max_palindrome << endl;
    return 0;
}