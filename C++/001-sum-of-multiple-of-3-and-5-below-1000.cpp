#include <iostream>
using namespace std;
int main()
{
    int S=0, i;
    for(i=0; i<1000; i++){
       if(i%3==0 || i%5==0)
        S=S+i;
      }
    cout<<S;
    return 0;
}
