# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
# a**2 + b**2 = c**2

# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.

def pythagorean_triple?(a, b, c) 
  a**2 + b**2 == c**2
end

def special_triplet(sum)
  a = 1
  matches = []
  # if a + b + c === sum and a < b < c, a can't be > sum / 3
  while a < sum / 3 do
    b = a + 1
    # same reasoning, b can't be > sum / 2 if b < c
    while b < sum / 2 do
      c = sum - b - a
      matches.push(a*b*c) if pythagorean_triple?(a, b, c)
      b += 1
    end
    a += 1
  end
  matches
end

puts "special triplet product(s): #{special_triplet(1000).join(', ')}"
