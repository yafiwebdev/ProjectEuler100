# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the given number? 

def largest_prime_factor(number)
  # divide by the smallest prime number (2) until
  # number is no longer divisble by the given prime number

  # iterate to the next (prime) number
  # divide and repeat
  # the forumula will return the largest prime factor

  prime_number = 2
  counter = 0

  while prime_number != number
    if number % prime_number == 0
      number /= prime_number
    else
      prime_number += 1
    end
   
  end
  prime_number
end

puts largest_prime_factor(600851475143)