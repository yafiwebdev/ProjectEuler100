let sum;
let m;
let limit = 500;
for (let x = 1; x < Infinity; x++) {
  sum = 0;
  m = 0;
  sum += x * (x + 1) / 2;
  for (let z = 1; z <= Math.sqrt(sum); z++) {
    if (sum % z == 0) {
      m+=2;  
        if(z*z==sum){
          m--;
      }
      console.log(sum + " " + m);
    }
      
  }
  if (m > limit) {
    alert(sum);
    break;
  }

}
