<?php

/*
	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two n-digit numbers. 
*/

function largestPalindromeProduct($number) {

	// Set the largest possible 'number'-digit number, simply repeat the nines 'number' times, since the largest number consists only of nines
	$largestStartingNum = (int)str_repeat("9", $number);

	$palindromes = [];

	// Loop through the first number to 2
	for($i = $largestStartingNum; $i > 1; $i--) {

		// Loop through the second number to multiply each number with the current number in the outer loop
		for($j = $largestStartingNum; $j > 1; $j--) {

			$multiple = $i * $j;
			$multiple = (string)$multiple;

			$reversedMultiple = strrev($multiple);

			if($multiple === $reversedMultiple) {

				array_push($palindromes, $multiple);

			}

		}

	}

	// Get the palindrome with the highest value from the palindromes found
	return max($palindromes);

}
  
largestPalindromeProduct(3);
  