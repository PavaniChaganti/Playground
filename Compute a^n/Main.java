#include<iostream>
using namespace std;
long int powers(int, int);
int main()
{
  int a,n;
  std::cout<<"Enter the value of a\n";
  std::cin>>a;
  std::cout<<"Enter the value of n\n";
  std::cin>>n;
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<powers(a,n);
}
long int powers(int a, int n)
{
  if(n==0)
    return 1;
  else if(n==1)
    return a;
  else
    return a*powers(a,n-1);
}