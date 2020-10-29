class SummationOfPrimes {

    public static void main(String[] args) {
        final int limit = 2000000;
        long sum = 0;
        boolean[] primes = listPrimality(limit);
        for (int k = 1; k < limit; k++) {
            if (primes[k]) {
                sum += k;
            }
        }
        System.out.println(sum);
    }

    // generates a boolean array which will indicate whether a number is a prime or not
    // ex: result[x] will indicate whether x is a prime or not
    // this is more faster than checking isPrime for each and every number (for big data sets)
    public static boolean[] listPrimality(int n) {
        boolean[] result = new boolean[n + 1];
        result[2] = true;   // 2 is a prime; all other even numbers are not primes; so we check only for odd numbers
        for (int i = 3; i <= n; i += 2)
            result[i] = true;
        // Sieve of Eratosthenes algo for generate primes
        for (int i = 3, end = (int) Math.sqrt(n); i <= end; i += 2) {
            if (result[i]) {
                // Note: i * i does not overflow
                for (int j = i * i, inc = i * 2; j <= n; j += inc)
                    result[j] = false;
            }
        }
        return result;
    }
}
