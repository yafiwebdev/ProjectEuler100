/**
 * @param current starting number for the recursive method
 * @param max     end of the number sequence
 * @param sum     accumulated sum of numbers divisible of 3 and 5
 * @return  accumulated sum of numbers divisible of 3 and 5
 */

def sum_multiples_recursive(current: Int, max: Int, sum: Int): Int = {
  if (current < max) {  // when it reaches the max accumulated sum will be returned
    if (current % 3 == 0 || current % 5 == 0) { // if current number is divisible by 3 or 5 -> add the value to sum and call the method for next integer
      sum_multiples_recursive(current + 1, max, current + sum)
    } else {  // if current number is not divisible by 3 or 5 -> call the method for next integer
      sum_multiples_recursive(current + 1, max, sum)
    }
  } else {
    sum // return accumulated sum
  }
}

println(sum_multiples_recursive(1, 1000, 0))
