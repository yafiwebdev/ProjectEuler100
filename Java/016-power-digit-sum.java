//The problem -
//2^15 = 32768 and the sum of its digit is 3 + 2 + 7 + 6 + 8 = 26
//What is the sum of the digits of the number 2^1000

import java.lang.Math;
import java.math.BigInteger;

class PowerDigitSum {

  public static void main(String[] args){
    findSum();
  }


  public static void findSum(){

    int b = 2;
    int exp = 1000;

    //Get 2^1000 value
    BigInteger base = new BigInteger(String.valueOf(b));
    BigInteger digit = base.pow(exp);


    int sum = 0;
    //Change large number into a string
    String digitStr = String.valueOf(digit);

    for (int i = 0; i < digitStr.length(); i++) {
      //Transfer back to int and add each position with loop
      sum += digitStr.charAt(i) - '0';
    }
    System.out.println("the sum is: " + sum);
  }

}
