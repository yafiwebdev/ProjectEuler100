#include <iostream> 
using namespace std;
int main(){
	char input[20][51];
	int N[1013];
	N[1000] = 0;
	long long answer = -1;
	for (int i = 0; i < 20; i++){
		cin >> input[i];
		for (int j = 0; j < 50; j++)
			N[50 * i + j] = input[i][j] - '0';
	}
	for (int i = 0; i < 1000; i++){
		long long prod = 1;
		for (int j = 0; j < 13; j++){
			prod = prod * N[i + j];
		}
		if (prod > answer)
			answer = prod;
	}
	cout << answer;
	return 0;
}
