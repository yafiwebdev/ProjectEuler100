=begin
https://projecteuler.net/problem=3
=end

def largestPrimeFactor(n)
    for j in 2..Math.sqrt(n).floor()
        if n % j == 0
            $counter = 0
            while n % j == 0 do
                n = n / j
                $counter += 1
            end
            puts "#{j}^#{$counter}"
        end
    end
    if n != 1
        puts "#{n}^#{1}"
    end
end

largestPrimeFactor(600851475143)
