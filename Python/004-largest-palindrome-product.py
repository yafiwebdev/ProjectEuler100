def isPalin(num):
    '''Checks if a number is a palindrome'''
    num = list(str(num))
    if num == num[::-1]:
        return True
    return False

def maxPalin(n):
    '''Largest product of two numbers that's a palindrome of length n''' 
    smallest = 10**(n-1) if n > 1 else 0 #each n digit number starts here, 1 dig nums start at 0, 2 dig nums start at 10^(2-1), 3 digs at 10^(3-1)
    biggest =  10**(n) #last n length number to check for, for 3 digs, 1000-1 = 999, loop goes from smallest to biggest-1
    maxNum = 0

    for i in range(smallest, biggest):
        for j in range(smallest, biggest):
            if isPalin(i*j) and (i*j) > maxNum:
                maxNum = i*j
    return maxNum

print(maxPalin(2)) #should return 9009 
print(maxPalin(3)) #returns 906609