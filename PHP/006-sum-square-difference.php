<?php

/* 
	The sum of the squares of the first ten natural numbers is,
	1² + 2² + ... + 10² = 385

	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)² = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

	Find the difference between the sum of the squares of the first n natural numbers and the square of the sum.
*/

function sumSquareDifference($number) {

	$sumOfSquares = $sum = 0;

	for($i = 1; $i <= $number; $i++) {
		$sumOfSquares += $i ** 2;
		$sum += $i;
	}

	$squareOfSums = $sum ** 2;

	return $squareOfSums - $sumOfSquares;
}
  
echo sumSquareDifference(10);