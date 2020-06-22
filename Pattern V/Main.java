#include <iostream>
using namespace std;
int main()
{
  int n, left, right;
  std::cin>>n;
  left = 1;
  right = n*n+1;
  for(int i=n; i>=1; i--)
  {
    for(int j=n; j>i; j--)
    {
      std::cout<<"--";
    }
    for(int j=1; j<=i; j++)
    {
      std::cout<<left;
      std::cout<<"*";
      left++;
    }
    for(int j=1; j<=i; j++)
    {
      std::cout<<right;
      if(j<i)
        std::cout<<"*";
      right++;
    }
    right = right-(i-1)*2-1;
    std::cout<<"\n";
  }
}