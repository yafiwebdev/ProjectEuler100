# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
# a**2 + b**2 = c**2

# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.

def pythagorean_triple?(a, b, c) 
  a**2 + b**2 == c**2
end

def special_triplet
  a = 1
  while a < 332 do
    b = a + 1
    while b < 499 do
      c = 1000 - b - a
      return [a,b,c] if pythagorean_triple?(a, b, c)
      b += 1
    end
    a += 1
  end
end

puts "special triplet is #{special_triplet}"