// Function objective: Calculate the sum of even terms in the fibonacci sequence that don't surpass parameter, limit.

def even_fib_nums(limit: Long): BigInt = {
  // Solves problem imperatively and dynamically by building upon sub-problems
  // Initializes variables to hold n-1 and n-2
  var n1 = 1
  var n2 = 1
  var fib_term = 0
  var result = 0

  // Sets condition to continue calculating until fib_term is limit
  while ( fib_term <= limit ) {
    //There exists a sequence of numbers called fibonacci sequence for each term,
    //term n is the sum of term n-1 and term n-2 
    fib_term = n1 + n2
    // Sets condition to only consume value if term is even
    if (fib_term % 2 == 0) {
      result += fib_term
    }
    n1 = n2
    n2 = fib_term
  }
  return result
}

println(even_fib_nums(4000000))
