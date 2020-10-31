# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

# Find the sum of all the primes below two million.
def sum_primes_to(top)
  prime_sum = 0
  # "sieve of eratosthenes"
  sieve = Array.new(top, false) # true when not prime
  n = 2
  while n < top do
    # we marked this as a nonprime from a previous factor - not a prime
    if sieve[n]
      n += 1
      next
    end

    # we know it's a prime - add to our running total
    prime_sum += n
    nonprime = n * n
    
    # mark all multiples of this prime as non primes (divisible by this prime)
    while nonprime < top do
      sieve[nonprime] = true
      nonprime += n
    end
    n += 1
  end
  prime_sum
end

puts sum_primes_to(2000000)