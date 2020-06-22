#include<iostream>
using namespace std;
int main()
{
  int n, a=11;
  std::cin>>n;
  for(int i; i<n; i++)
  {
    std::cout<<a*a<<" ";
    a+=4;
  }
}