#include <iostream>
#include <map>
#include <math.h>

int main()
{
	int tn;
	int c = 1;
	while (true)
	{
		c++;
		tn = c*(c+1)/2;
		int n = tn;
		// find prime factors of number
		
		std::map<std::string, int> factor_map;
		while (n % 2 == 0)  
    		{
			if (factor_map.find("2") == factor_map.end())
				factor_map["2"] = 1;
			else
				factor_map["2"] = factor_map["2"] + 1;
        		n = n/2;
    		}

		for (int i = 3; i <= sqrt(n); i = i + 2)
		{
			while (n % i == 0)
			{
				if (factor_map.find(std::to_string(i)) == factor_map.end())
                                	factor_map[std::to_string(i)] = 1;
                        	else
                                	factor_map[std::to_string(i)] = factor_map[std::to_string(i)] + 1;
				n = n/i;
			}
		}

		if (n > 2)
		{
			if (factor_map.find(std::to_string(n)) == factor_map.end())
                                factor_map[std::to_string(n)] = 1;
                        else
                        	factor_map[std::to_string(n)] = factor_map[std::to_string(n)] + 1;
		}

		int divisors = 1;
		std::map<std::string, int>::iterator it;
		for (it = factor_map.begin(); it != factor_map.end(); it++)
		{
			divisors *= it->second + 1;
		}

		if (divisors > 500)
			break;
	}
	std::cout << "found: " << tn << std::endl;
}
