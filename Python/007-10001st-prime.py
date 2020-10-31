# Project Euler  -  Question 7  -  10,001st prime
 
# Import math library to get sqrt
import math
 
# isPrime function - returns True or False
def isPrime(num):
    # Iterates from 2 to sqrt(num)+1 as discussed above
    for i in range(2,int(math.sqrt(num))+1):
        if (num % i == 0):
            return False
 
    return True


count = 1   # Number of primes
num = 2     # Prime number (count)
 
while (count<10001):
    num+=1
    if isPrime(num):
        count+=1
 
# Print answer
print('The 10001th prime is: ' + str(num))
