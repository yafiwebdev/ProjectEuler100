# -*- coding: utf-8 -*-
"""
Created on Sat Oct 31 00:03:39 2020

@author: Meet Patel
"""

one = [ "", "one ", "two ", "three ", "four ", 
        "five ", "six ", "seven ", "eight ", 
        "nine ", "ten ", "eleven ", "twelve ", 
        "thirteen ", "fourteen ", "fifteen ", 
        "sixteen ", "seventeen ", "eighteen ", 
        "nineteen "]; 
  

ten = [ "", "", "twenty ", "thirty ", "forty ", 
        "fifty ", "sixty ", "seventy ", "eighty ", 
        "ninety "]; 
  
# n is 1- or 2-digit number 
def numToWords(n, s): 
  
    str = ""; 
      
    
    if (n > 19): 
        str += ten[n // 10] + one[n % 10]; 
    else: 
        str += one[n]; 
  
    
    if (n): 
        str += s; 
  
    return str; 
  
# Function to print a given number in words 
def convertToWords(n): 
  
    
    out = ""; 
  
    
    out += numToWords((n // 10000000),  
                            "crore "); 
  
     
    out += numToWords(((n // 100000) % 100), 
                                   "lakh "); 
  
     
    out += numToWords(((n // 1000) % 100),  
                             "thousand "); 
  
    
    out += numToWords(((n // 100) % 10),  
                            "hundred "); 
  
    if (n > 100 and n % 100): 
        out += "and "; 
  
    
    out += numToWords((n % 100), ""); 
  
    return out; 
#first create two lists
l=[]
l2=[]

#assign a as 0
a=0

#First for loop for convert numbers into words
for i in range(1, 1001):
    l.append(convertToWords(i))

#Second for loop for find the length of each single word and total all we get
for i in range(len(l)):
    l2.append(len(l[i]) - l[i].count(" "))
    a += l2[i]

#Finally print what we want...!!
print(a)