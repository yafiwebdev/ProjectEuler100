//Problem no 6 | Solution by Mrityunjaya Tripathi
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
package main

import (
	"fmt"
)

//Main function
func main() {
// declration of variables
	var sumsq = uint64(1)
	var sqnum = uint64(1)
//for loop >> for calculating sum and squares
	for i := uint64(2); i <= 100; i++ {
		sqnum += i
		sumsq += i * i
	}
	sqnum = sqnum * sqnum
//print function
	fmt.Print("difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is : ")
	fmt.Print(sqnum - sumsq)
}
