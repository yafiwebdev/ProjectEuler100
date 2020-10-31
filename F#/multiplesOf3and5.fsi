(*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below the provided parameter value number. IN F#*)

(*int -> int*)

module theFunction =
let multiplesOf3and5 number =
	let sum = 0
	let num = 1
	while num < number do
		if num % 3 = 0 or num % 5 = 0
			then sum = sum + num
        else sum = sum + 0
		num = num + 1
return sum

let result = multiplesOf3and5(1000)

printfn(result)