/* Problem -
  The following iterative sequence is defined for the set of positive integers:
  n -> n/2 (n is even)
  b -> 3n + 1 (n is odd)
  Using the rule above and starting with 13, we genereate the following sequence:
  13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
  It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
  Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
  Which starting number, under one million, produces the longest chain?
  NOTE: Once the chain starts the terms are allowed to go above one million. */

import java.util.*;

class LongestCollatz {

  public static void main(String[] args){

    long begin = System.currentTimeMillis();

    long longest = 0;
    int res = 0;

    LinkedList<Long> list = new LinkedList<Long>();
    
    long input = 1000000
    
    for(int j = 10; j < input; j++){
      long i = j;
      while(i != 1){
        if(i % 2 == 0){
          i /=2;
          list.add(i);
        } else {
          i = (3 * i) + 1;
          list.add(i);
        }
      }
      if (list.size() > longest) {
        longest = list.size();
        res = j;
      }
      list.clear();
    }

    long end = System.currentTimeMillis();
    System.out.println("Result: " + res);
    System.out.println("Chain size: " + longest);
    System.out.println(end-begin + "ms");

  }

}
