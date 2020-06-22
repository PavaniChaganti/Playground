#include <iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  std::cout<<1<<"\n";
  for(int i=2; i<=n;i++)
  {
    for(int j=1; j<i; j++)
    {
      std::cout<<i<<"*";
    }
    std::cout<<i<<"\n";
  }
  for(int i=n; i>=2;i--)
  {
    for(int j=1; j<i; j++)
    {
      std::cout<<i<<"*";
    }
    std::cout<<i<<"\n";
  }
  std::cout<<"1";
}