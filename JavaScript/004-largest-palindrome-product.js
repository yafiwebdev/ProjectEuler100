/*
	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two n-digit numbers. 
*/

function largestPalindromeProduct(number) {

	// Set the largest possible 'number'-digit number, simply repeat the nines 'number' times, since the largest number consists only of nines
	let largestStartingNum = parseInt("9".repeat(number))

	const palindromes = [];

	// Loop through the first number to 2
	for(let i = largestStartingNum; i > 1; i--) {

		// Loop through the second number to multiply each number with the current number in the outer loop
		for(let j = largestStartingNum; j > 1; j--) {

			let multiple = i * j;
			multiple = multiple.toString();

			let reversedMultiple = multiple.split("").reverse().join("");

			if(multiple === reversedMultiple) {

				palindromes.push(multiple);

			}

		}

	}

	// Get the palindrome with the highest value from the palindromes found
	return Math.max(...palindromes);

}
  
largestPalindromeProduct(3);
  