package main

import (
	"fmt"
)

//Main function
func main() {
	const top = 2000000
	total := uint64(0)
	// "sieve of eratosthenes"
	sieve := [top]bool{} // true when not prime
	for n := 2; n < top; n++ {
		if sieve[n] {
			// we marked this as a nonprime from a previous factor - not a prime
			continue
		}
		// we know it's a prime - add to our running total
		total += uint64(n)
		for nonprime := n * n; nonprime < top; nonprime += n {
			// mark all multiples of this prime as non primes (divisible by this prime)
			sieve[nonprime] = true
		}
	}

	fmt.Printf("the value is: %v\n", total)
}
