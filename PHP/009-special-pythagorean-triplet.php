<?php

/*
	A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

	a2 + b2 = c2
	For example, 3 + 42 = 9 + 16 = 25 = 52.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc such that a + b + c = n.
*/

function specialPythagoreanTriplet($n) {
	// Prepare an array in case of multiple solutions
	$result = [];

	$a = 1;
	// Leave room for b and c, since a < b < c
	while ($a < $n - 2) {
		$b = $a + 1;

		// Leave room for c which is larger than b
		while ($b < $n - 1) {
			$c = $n - $a - $b; // a + b + c = n

			// Check if the numbers pass the test
			if($a**2 + $b**2 === $c**2) {
				$abc = $a * $b * $c;
				// If they pass the test, add them to the results array, with their product
				array_push($result, "$a, $b, $c => $abc");
			}

			$b++;
		}

		$a++;
	}

	return $result;
}
   
$triplets = specialPythagoreanTriplet(120);

// Note that you have to use DOUBLE QUOTES for the \n to produce a new line!
echo implode("\n", $triplets);