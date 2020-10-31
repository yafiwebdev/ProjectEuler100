//It is based on coprime numbers properties. The triangle number is equal to n*(n+1)/2 where n and n+1 are coprimes => n and (n+1)/2 are coprimes 
//or n/2 and n+1 are coprimes ( it depends if n is even or odd )
//I used an integer as argument for getTriangle() method to be easier to improve this method. 
//You can decide to start from a value that is bigger than 1 for this particular case. 
//In this case, you can reduce the time at least 3 times

public class P12 {

    final static int THRESHOLD_DIVISORS = 500;    

    public static void main(String[] args) {
        System.out.println(getTriangle(1));
    }

    public static long getTriangle(int n) {
        long numberOfDivisors = 0;
        long firstCoprime, secondCoprime;
        while (true) {
            if ( n % 2 == 0 ) {
                firstCoprime = getNumberOfDivisors(n/2);
                secondCoprime = getNumberOfDivisors(n+1);

            } else {
                firstCoprime = getNumberOfDivisors(n);
                secondCoprime = getNumberOfDivisors((n+1)/2);
            }           
            numberOfDivisors = firstCoprime * secondCoprime;
            if ( numberOfDivisors > THRESHOLD_DIVISORS ) {
                return n*(n+1)/2;
            }       
            n++;
        }
    }

    private static long getNumberOfDivisors(long nr) {
        int divisors = 0;
        int i;
        int sqrt = (int) Math.sqrt(nr);
        for ( i = 1 ; i <= sqrt ; i++ ) {
            if ( nr % i == 0 ) {
                divisors+=2;           // E.g.: (2, n/2), (3, n/3)
            }
        }
        if ( sqrt*sqrt == nr ){        // it was counted twice
            divisors--;
        }
        return divisors;
    }

}
