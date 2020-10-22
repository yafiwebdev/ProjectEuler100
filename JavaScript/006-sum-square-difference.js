function sumSquareDifference(number) {

	let sumOfSquares = sum = 0;

	for(let i = 1; i <= number; i++) {
		sumOfSquares += i ** 2;
		sum += i;
	}

	let squareOfSums = sum ** 2;

	return squareOfSums - sumOfSquares;
}
  
sumSquareDifference(10);
  