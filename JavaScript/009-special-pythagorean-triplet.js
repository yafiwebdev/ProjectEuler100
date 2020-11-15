/*
	A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

	a² + b² = c²
	For example, 3² + 4² = 9 + 16 = 25 = 5².

	There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc such that a + b + c = n.
*/

function specialPythagoreanTriplet(n) {
	// Prepare an array in case of multiple solutions
	const result = [];

	let a = 1;
	// Leave room for b and c, since a < b < c
	while (a < n - 2) {
		let b = a + 1;

		// Leave room for c which is larger than b
		while (b < n - 1) {
			let c = n - a - b; // a + b + c = n

			// Check if the numbers pass the test
			if(a**2 + b**2 === c**2) {
				let abc = a * b * c;
				// If they pass the test, add them to the results array, with their product
				result.push(`${a}, ${b}, ${c} => ${abc}`);
			}

			b++;
		}

		a++;
	}

	return result;
}
   
let triplets = specialPythagoreanTriplet(120);
console.log(triplets.join('\n')); // Show all results separated by line breaks