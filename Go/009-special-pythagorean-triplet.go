package main

import (
   "fmt"
)

var a, b, c, p int
var s int = 1000

func main(){
   for a := 1; a <= s; a++ {
      for b := 1; b <= s; b++ {
         for c :=1; c <= 1000; c++ {
            if(((a*a)+(b*b)==(c*c)) && ((a+b+c) == 1000)){
               fmt.Println("a=", a)
               fmt.Println("b=", b)
               fmt.Println("c=", c)
               p=a*b*c
               fmt.Println("the product of Pythagorean triplet abc is =", p)
               return
            }
         }
      }
   }
}