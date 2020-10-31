// From: https://projecteuler.net/problem=1
// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

fn sum_of_multiples(limit: u32) -> u32 {
    let mut sum = 0;
    for n in 1..limit {
        if n % 3 == 0 {
            sum += n;
        } else if n % 5 == 0 {
            sum += n;
        }
    }
    return sum;
}

fn main() {
    // Just to check the provided example, the result of the following must be 23.
    // let desired = 10;
    // println!("Sum of all multiples of 3 or 5 below {} is: {}", desired, sum_of_multiples(desired));

    let desired = 1000;
    println!("Sum of all multiples of 3 or 5 below {} is: {}", desired, sum_of_multiples(desired));
}
