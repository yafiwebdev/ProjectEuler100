// Problem number 5 | Solution by Mrityunjaya Tripathi
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

package main

import (
	"fmt"
)
// greatest common divisor (GCD)
func GCD(result, j int) int {
	for j != 0 {
		t := j
		j = result % j
		result = t
	}
	return result
}

// Least Common Multiple (LCM)
func LCM(result, j int) int {
	return result * j / GCD(result, j)
  
}

//The bruteforce approach >> simply checking each number from 1 to infinity and break loop when number is divisible by all numbers from 1 to N(i.e. 20 in our case),
//We can more optimise number by incrementing loop by 20 , It will little bit faster (T/20) than previous one , where T=O(T) for previous approach . 
//Assume what happens when input will too long , previous all approache will take long time , so We can more optimise soln by LCM approach

// Main function
func main() {
	result := 1

//user custom input
  fmt.Print("Please enter number : ")   
        
        var num int    
        fmt.Scanln(&num) 
	// Or set custom value for testing
	// num = 20
	
	for j := 2; j <= num; j++ {
		result = LCM(result, j)
	}
// Output printing.....
	fmt.Print("The smallest positive number that is evenly divisible by all of the numbers from 1 to ")
        fmt.Print(num)
        fmt.Print(" is : ")
	fmt.Println(result)
}
