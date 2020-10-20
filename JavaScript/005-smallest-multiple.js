/*
	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to n?
*/

function smallestMultiple(n) {
	
	// The eventual result
	let currentNum = 1;

	// Keep going until the result is found and returned
	while(true) {

		// Only try dividing if the current number is greater than or equal to the argument, as it must also be divisible by it
		if(currentNum >= n) {

			// If the number couldn't be divisible by any number until the argument, then return it
			if(isDivisible(currentNum, n)) {
				return currentNum;
			}

		}

		currentNum++;
	}

}

function isDivisible(number, n) {

	for(let i = 1; i <= n; i++) {

		// If the number could be divisible by any number, then it's not the correct number, we break and don't have to check other numbers
		if(number % i !== 0) {
			return false;
		}

	}

	return true;
}

let result = smallestMultiple(10);
console.log(result);