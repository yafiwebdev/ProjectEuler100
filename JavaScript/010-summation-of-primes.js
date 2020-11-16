/*
	The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

	Find the sum of all the primes below n.
*/

function primeSummation(n) {

	let sum = 0; // Set initial sum to zero, in case a number less than 2 is passed in

	// Check all numbers from 2 up to but not including 'n'
	// If 'n' is less than 2, the loop is never entered and the initial sum '0' is returned
	for(let num = 2; num < n; num++) {

		if(isPrime(num)) sum += num;

	}

	return sum;
}

function isPrime(num) {

	const numSqrt = Math.floor(Math.sqrt(num)); // We only have to check up to the square root to know whether a number is prime

	for(let i = 2; i <= numSqrt; i++) {

		if(num % i === 0) return false; // If it's divisible by any number, then it's not a prime factor

	}

	return true; // It is a prime as it couldn't be divided by any number
}
  
let sumOfPrimes = primeSummation(2000000);
console.log('sumOfPrimes:', sumOfPrimes)