#include <iostream>
using namespace std;
int main()
{
  int n, j, k=0;
  std::cin>>n;
  for(int i=1; i<=n; i++)
  {
    if(i%2==1)
    {
      for(j=k+1; j<k+i; j++)
      {
        std::cout<<j<<"*";
      }
      std::cout<<(j++)<<"\n";
      k = j;
    }
    else
    {
      k = k+i-1;
      for(j=k; j>k-i+1; j--)
      {
        std::cout<<j<<"*";
      }
      std::cout<<j<<"\n";
    }
  }
}