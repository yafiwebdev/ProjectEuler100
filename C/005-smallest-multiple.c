/*
    What the question is asking us to find is called Least Common Multiple (LCM)
    As per the definition of LCM, it is the smallest number which is perfectly
    divisible by some set of numbers.
    Information given in question is as follows:
    S1 = {1,2,3,4,5,6,7,8,9,10} (some set of numbers)
    LCM(S1) = 2520
    Question asks solution for:
    S2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
    LCM(S2) = ?
    
    We will take a different route because it is much easier to calculate Greatest
    Common Divisor (GCD) aka Highest Common Factor (HCF).
    Further we will use the mathematical properties:
    LCM({a,b}) * GCD({a,b}) = a*b where a,b belongs to set S.
    Also, LCM({LCM({a,b}),c}) = LCM({a,b,c}) and LCM({1,n}) = n
    
    We will use the above properties and calculate LCM of S.
    We will calculate as shown LCM({...LCM({LCM({1,start}), start+1})...}, end)
    The innermost LCM({1,start}) will be calculated first, then LCM({LCM({1,start}),start+1})
    and so on. Here, S = {start, start+1, ..., end} 
    start = first element
    end = last element
*/


#include <stdio.h>

// Euclidean Algorithm of calculating GCD of 2 numbers
int gcd(int a, int b){
    if(b == 0)
        return a;
    return gcd(b, a%b);
}

// lcm = a*b/gcd(a,b)
long long int lcm(long long int a, long long int b){
    return (a*b)/gcd(a,b);
}

int main() {
    
    long long int start, end;
    scanf("%lld%lld",&start,&end);
    
    
    long long int runningLCM = 1;
    long long int i; 
    for(i=start; i<=end; i++){
        runningLCM = lcm(runningLCM,i);
    }
    
    printf("%lld",runningLCM);
	
	return 0;
}
