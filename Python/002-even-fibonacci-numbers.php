'''
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed n, find the sum of the even-valued terms. 
'''

def fiboEvenSum(number):
	''' Set the last and current numbers to the first two Fibonacci numbers'''
	lastNum = 1
	currentNum = 2
	total = 0
	while currentNum <= number:
		if currentNum % 2 == 0:
			total += currentNum
		'''Store the current Fibonacci number before updating it as it's needed below for lastNumber in the next iteration'''
		tempCurrentNum = currentNum
		'''Update numbers for next iteration'''
		currentNum += lastNum
		lastNum = tempCurrentNum
	return total

print(fiboEvenSum(10))
