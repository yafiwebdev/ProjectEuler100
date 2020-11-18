# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

# What is the 10 001st prime number?
# ---------------------------------------------------------------------------------------------------------
require 'prime'

def prime_at(prime_position)
  array_of_prime = []       # Maintain an array of prime numbers to keep track of length
  counter = 0               # Each index represents the position of the prime number
                            # The last element will be where we grab our prime number

  while(array_of_prime.length < prime_position)         # While we are not yet at the position we are looking for
    if (counter != 1) && (counter != prime_position)    # Keep finding the next prime  number
      if counter.prime?
        array_of_prime.push(counter)
      end
    end
    counter += 1
  end
  array_of_prime[-1]                                    # Return the final prime number
end

puts prime_at(10001)