# If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
# The sum of these multiples is 23.

# Find the sum of all the multiples of 3 or 5 below the provided parameter value number.


def multiplesOf3and5(number) 
	sum = 0
	num = 1

	while num < number do 

		if num % 3 === 0 || num % 5 === 0
			sum += num;
		end
		num += 1
	end
	sum
end

puts multiplesOf3and5(1000);

