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
               fmt.Println(a, b, c)
               p=a*b*c
               fmt.Println(p)
               return
            }
         }
      }
   }
}