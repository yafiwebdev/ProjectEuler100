#include <stdio.h>

int main(){
int counter = 1;
int number = 3;
int divide = 2;
while(1){

  if (number%divide==0){
    number+=1;
    divide=2;
    }
  
  else{
    divide+=1;
    if(divide >= (number/2)){
      counter+=1;
      if (counter == 10001){
        printf("%d\n",number);
        break;
      }
      
      number+=1;
      divide=2;    
    }
}
}
}
