/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below the provided parameter value number. IN KOTLIN
*/

fun multiplesOf3and5(number: Int) {
    var sum: Int = 0
    var num: Int = 1
	while (num < number){
		if ((num % 3 == 0) or (num % 5 == 0)){
			sum = sum + num
        else 
                sum = sum + 0
        }
    num+=1
    }
	return sum
}

print(multiplesOf3and5(1000))