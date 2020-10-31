'''
	The sum of the squares of the first ten natural numbers is,
	1² + 2² + ... + 10² = 385

	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)² = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

	Find the difference between the sum of the squares of the first n natural numbers and the square of the sum.
'''

def sumSquareDifference(number):
	sumOfSquares = 0
	sums = 0

	for i in range(1, number + 1):

		sumOfSquares += i ** 2
		sums += i
	
	squareOfSums = sums ** 2

	return squareOfSums - sumOfSquares


result = sumSquareDifference(10)
print(result)