# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

def smallestMultiple(maxFactor) # maxFactor - max positive factor that use to check the divisible from 1 to maxFactor
  lcm = 1 # least common multiple - the smallest positive integer that is divisible by two integers
  (2..maxFactor).each do |factor| # Iterate from 2 to maxFactor. No need to consider 1 here since it's a factor of all integers.
    lcm *= factor / greatestCommonDivisor(lcm, factor)
  end

  lcm
end

# Find the largest positive integer that divides each of the integers
# Ex:
#   <factor>  -->  <greatestCommonDivisor>
#       2     -->     1
#       3     -->     1
#       4     -->     2
#       5     -->     1
#       6     -->     6
#       7     -->     1
#       8     -->     4
#       ...............
#       ...............
def greatestCommonDivisor(lcm, factor)
  while factor > 0
    lcm %= factor
    return factor if lcm == 0
    factor %= lcm
  end

  lcm
end

puts smallestMultiple(20) # put 20 here to solve problem 5
