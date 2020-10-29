// https://projecteuler.net/problem=5

#include <stdio.h>
#include <math.h>

int main()
{
    //Support for bool variables
    typedef enum {false, true } bool;    
    int i=1, limit=20, result = 0;
    bool conditional = true;
    while(conditional){
        for(int j = 1; j <= limit; j++) {
            //break the loop if the value is not divisible by other number
            if(i%j!=0){
                break;
            }
            //if you reach the limit, save the value and break loop while
            if(j==limit){
                result=i;
                conditional=false;
            }
        }
        i++;
    }
	printf("Resultado = %d\n", result);

    return 0;
}
