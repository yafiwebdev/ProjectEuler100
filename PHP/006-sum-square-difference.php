<?php

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