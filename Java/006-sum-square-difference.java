//Project Euler Problem 6
/*
	The sum of the squares of the first ten natural numbers is,
	1² + 2² + ... + 10² = 385
	The square of the sum of the first ten natural numbers is,
	(1 + 2 + ... + 10)² = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
	Find the difference between the sum of the squares of the first n natural numbers and the square of the sum.
*/

public class Problem_6_Sum_Square_Difference {

  static void Calc_Diff(int n) {
    int sumSquares = 0, sum = 0, difference = 0;

  for (int i = 1; i <= n; i++) {
      sum += i;
      sumSquares += (int)Math.pow(i, 2);
  }

  difference = (int)Math.pow(sum, 2) - sumSquares;
  System.out.println(difference);

}

    public static void main (String[] args) {

        Calc_Diff(100);

    }
}
