'''
	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to n?
'''

def smallestMultiple(n):
    # The eventual result
    currentNum = 1

    # Keep going until the result is found and returned
    while True:
        # Only try dividing if the current number is greater than or equal to the argument, as it must also be divisible by it
        if currentNum >= n:

            # If the number couldn't be divisible by any number until the argument, then return it
            if isDivisible(currentNum, n):
                return currentNum
        
        currentNum += 1


def isDivisible(number, n):

    for i in range(1, n + 1):
        # If the number could be divisible by any number, then it's not the correct number, we break and don't have to check other numbers
        if number % i != 0:
            return False

    return True

result = smallestMultiple(8)
print(result)