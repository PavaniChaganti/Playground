#include<iostream>
using namespace std;
int digit_root(int);
int main()
{
  int n;
  std::cin>>n;
  std::cout<<digit_root(n);
}
int digit_root(int n)
{
  int sum = 0;
  if(n==0)
    return 0;
  else
    return (n%9==0)?9:(n%9); 
}