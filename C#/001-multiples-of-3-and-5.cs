using System;

namespace ProjectEuler
{
    class Program
    {
        static void Main(string[] args)
        {
            var limit = 1000;
            var sum = SumMultipleThreeOrFive(limit);

            Console.WriteLine($"The sum of multiples below {limit} is {sum}");
        }

        static long SumMultipleThreeOrFive(int limit)
        {
            long sum = 0;

            for (int i = 0; i < limit; i++)
            {
                if (i % 3 == 0 || i % 5 == 0)
                    sum += i;
            }

            return sum;
        }
    }
}
