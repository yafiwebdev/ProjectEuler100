def largestPrimeFactor(number):
	# Make a copy of the original number to manipulate it by dividing it by prime factors
	currentNum = number
	i = 2
	result = None

	# Keep going until the number has been divided by all factors and is 1
	while currentNum > 1:

		# Check whether the number is divisible by the current "i" value
		if currentNum % i == 0:

			currentNum /= i # Update the current number by dividing it by the current factor "i"
			result = i # Set to the current prime factor, which is until now the largest, but could be overwritten by the next, larger, factor
			# Don't change the counter, because the new number could also be divisible by it
		else:
			# Increment if the current number isn't divisible by the factor any more (or if it's not even a prime factor)
			i += 1

	return result


largestPrimeFactor(13195)
