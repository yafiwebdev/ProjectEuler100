/* 
	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
*/

function multiplesOf3and5(number) {
	let sum = 0;

	for (let num = 1; num < number; num++) {

		if (
			num % 3 === 0 ||
			num % 5 === 0
		) {
			sum += num;
		}

	}

	return sum;
}

multiplesOf3and5(1000);

