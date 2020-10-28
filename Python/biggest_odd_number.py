# Larget odd number program

n = int(input("Enter the number upto which we need to have the larget odd number: "))
a = n
# suppose we have number 20 so  the biggest odd number will be 19

if(n % 2 == 0):
    n = n-1
    # we have n=20 and we decrease it by 1 so 19 will be an odd number and not divisible by 2
if(n % 2 != 0):
    print("The biggest odd number upto "+str(a)+" will be "+str(n))
    
