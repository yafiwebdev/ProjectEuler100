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
    int maxpal = 0;
    int dig = 3;
    int upbnd = pow(10, dig) - 1;
    int lobnd = pow(10, dig - 1);
    
    //loop through all 3 digit pair
    for(int i = upbnd; i >= lobnd; i--){
        for(int j = i; j >= lobnd; j--){

            //find max palindrome
            if(checkpalindrome(i*j)){
                maxpal = max(maxpal, i*j);
            }

        }
    }
    cout << maxpal << endl;
    return 0;
}