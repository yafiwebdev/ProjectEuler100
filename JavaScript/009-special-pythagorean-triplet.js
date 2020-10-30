// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
// a**2 + b**2 = c**2

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

function isPythagoreanTriple(a, b, c) {
  return a**2 + b**2 === c**2
}

function specialTriplet() {
  for (let a=1; a<332; a++) {
    for (let b=a+1; b<333; b++) {
      const c = 1000 - b - a
      if (isPythagoreanTriple(a, b, c)) { return a*b*c }
      // optimization - w/ this a, if this b already makes c too small,
      //  it'll just keep getting smaller as b gets bigger
      //  so we can skip to the next a early
      if (a**2 + b**2 > c**2) {break} 
    }
  }
}

console.log(specialTriplet)