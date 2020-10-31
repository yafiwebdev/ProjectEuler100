#include<bits/stdc++.h>

using namespace std;

bool checkpalindrome(int x){
    int fwd = x, rev = 0;

    //reverse digits
    while(fwd > 0){
        rev *= 10;
        rev += fwd%10;
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
    int max_palindrome = 0;
    int digit = 3;
    int upper_bound = pow(10, digit) - 1;
    int lower_bound = pow(10, digit - 1);

    //loop through all 3 digit pair
    for(int i = upper_bound; i >= lower_bound; i--){
        for(int j = i; j >= lower_bound; j--){

            //find max palindrome
            if(checkpalindrome(i*j)){
                max_palindrome = max(max_palindrome, i*j);
            }

        }
    }
    cout << max_palindrome << endl;
    return 0;
}