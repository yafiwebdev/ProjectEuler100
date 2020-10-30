//Java Script

let i = 0;
let k = 0;
let j = 0;
let limit=1000000;
let z

function collatz(x) {
  if (x == 1) {
      k++;
    return k;
  }
  if (x % 2 == 0) {
    x = x / 2;
    k++;
    return collatz(x);
  } else {
    x = 3 * x + 1;
    k++
    return collatz(x);
  }
}
for (let x = 13; x <= limit; x++) {
    k=0;
  z = collatz(x);
  if (i < z) {
    i = z;
    j = x;
  }
}
alert(j);
