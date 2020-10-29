using System;

namespace LargestPrimeFactor
{
    class Program {

        public static void Main(string[] args)
        {
            Console.WriteLine(MaxPrimeFactor(600851475143));
        }

        // return the largest prime factor
        static private long MaxPrimeFactor (long n)
        {
            // n = x * y
            // so we start x = 1; then y is the largest facor
            // if y is also a prime that is the ans (largest prime factor)
            // this is the fastest way to get the ans
            for (long k = 1; k <= n/2; k++)
            {
                if (n % k == 0 && IsPrime(n/k)) // if k is a factor of n, then n/k is also a facor; and n/k is larger than k
                {
                    return n/k;
                }
            }
            return n;
        }

        // checks whether this number is a prime or not
        static private bool IsPrime(long x)
        {
            for (long i = 2; i < Math.Sqrt(x); i++)
            {
                if (x % i == 0) // if there are any divisibles other than 1 and itself this is not a prime
                {
                    return false;
                }
            }
            return true;
        }
    }
}
