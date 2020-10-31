# The sum of the squares of the first ten natural numbers is,
# 1² + 2² + ... + 10² = 385

# The square of the sum of the first ten natural numbers is,
# (1 + 2 + ... + 10)^2 = 55^2 = 3025

# Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
# 3025 - 385 = 2640

# Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

# ----------------------------------------------------------------------------------------------------

def sum_square_difference(num)
  sum_squares = 0  # create a variable to keep track of the sum of squares.
  sum = 0          # create a variable to keep track of the sum which we will square to get our squared sum.

  1.upto(num) do |i|        # iterate up to the number.
    sum_squares += i ** 2   # add the square value of {i} to sum_squares.
    sum += i                # add the value of {i} to the sum.
  end
  
  sum ** 2 - sum_squares    # Subtract the sum_of_squares from the square of the sum.
end

puts sum_square_difference(100) # => 25164150
