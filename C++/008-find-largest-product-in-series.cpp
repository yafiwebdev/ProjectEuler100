# include <iostream>
using namespace std;


int main() { 
    int t;
    cin>>t;
    while(t--)
    {
        int n,k;
        cin>>n>>k;
        string s;
        cin>>s;
        int long long sum=1,max=0,count=0,x=1;
           for(int i=0;i<s.size();i++)
           {
               if(s[i]=='0')
                s[i]--;
           }
        for(int i=0;i<s.size();i++)
        {
            if(i<k)
            {

                if((int)s[i]==(int)('0'-1))
                {
                    count++;
                }
                    x*=(int)(s[i]-'0');
            }
            else
            {   if(i==k && count==0)
                  { max=x;
                  }

                if((int)s[i-k]==(int)('0'-1))
                {
                    count--;
                }
                if((int)s[i]==(int)('0'-1))
                {
                    count++;
                }

                    x*=(int)(s[i]-'0');
                    x/=(int)(s[i-k]-'0');

                if(x>max && count==0)
                  {
                      max=x;
                
                  }
            }
        }
        cout<<max<<endl;
    }
    return 0;
}