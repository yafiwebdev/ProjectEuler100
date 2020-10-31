#include <stdio.h>
#define LIMIT 2000000


static int numArray[LIMIT] = { 0 }; // Zero output array created


int main(void)
{
	int i;
	long long result = 2;
	int last_prime = 2;
	int prime_found = 1;


	for (i = 1; i < LIMIT; i += 2) // leave out even numbers
		numArray[i] = i; // Fill each position in  array 


	  /* Find the next prime, then delete all multiples of it (set to 0) */


	while (prime_found) // Go until there are no more primes
	{
		int j;
		prime_found = 0;


		for (i = last_prime + 1; i < LIMIT; i++)
		{
			if (numArray[i] != 0) // If not 0, then it is prime. 
			{
				last_prime = i;
				result += i;
				prime_found = 1;
				break;
			}
		}


		if (prime_found) // Found prime, delete its multiples
		{
			for (j = 2; j < LIMIT; j++)
			{
				if (j * last_prime > LIMIT)
					break;


				numArray[j * last_prime] = 0;
			}
		}
	}


	printf("Sum of all primes below %d is %lld \n\n", LIMIT, result);

	return 1;
}
