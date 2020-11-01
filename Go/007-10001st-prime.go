package main

import "fmt"
import "math"

func checkIfPrime(num int) bool {
	if num == 2 {
		return true
	}
	for i := 2; i <= int(math.Floor(float64(num)/2)); i++ {
		if num%i == 0 {
			return false
		}
	}
	return num > 1
}

func main() {
	i := 3
	nPrimes := 1
	for {
		if checkIfPrime(i) {
			nPrimes++
		}
		if nPrimes == 10001 {
			fmt.Println(i)
			break
		}
		i += 2
	}
}
