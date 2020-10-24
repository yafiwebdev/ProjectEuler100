/* 
	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the nth prime number?
*/

function nthPrime(input) {

	// Set the first number to the first prime factor and add it to the list of primes
	let num = 2,
		primes = [2];

	// Keep going until we have an amount of primes equal to the input
	while(primes.length < input) {
		// Make a copy of the original number to manipulate it by dividing it by prime factors
		let currentNum = num;
		let i = 2;

		// Keep going until the number has been divided by all factors and is 1
		while(currentNum > 1) {

			// Check whether the number is divisible by the current "i" value, if yes, then "i" is a prime factor
			if(currentNum % i === 0) {

				currentNum /= i; // Update the current number by dividing it by the current factor "i"

				if(!primes.includes(i)) primes.push(i); // Add this prime factor to the list if it doesn't already exist
				// Don't change the counter, because the new number could also be divisible by it
			} else {
				i++; // Increment if the current number isn't divisible by the factor any more (or if it's not even a prime factor)
			}

		}

		num++;
	}
	// Return the last prime in the list, which will be the nth prime
	return primes.pop();

}
  
nthPrime(10001);
  