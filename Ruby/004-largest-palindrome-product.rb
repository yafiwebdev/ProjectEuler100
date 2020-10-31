# A palindromic number reads the same both ways. 
# The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

# Find the largest palindrome made from the product of two 3-digit numbers.

def is_palindrome(number) 
  number_string = number.to_s
  len = number_string.length
  character_matches_mirror = -> (i) { number_string[i] === number_string[len - i - 1]}
  for i in 0...(len / 2)
    return false unless character_matches_mirror.(i)
  end
  true
end

def largest_palindrome_product(top = 1000)
  best = 0
  # check each combination of two numbers 
  for i in 100...(top)
    for j in i...(top)
      k = i*j
      best = k if k > best && is_palindrome(k)
    end
  end
  best
end

puts largest_palindrome_product