#include<iostream>
using namespace std;
int gcd(int, int);
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}
int gcd(int a, int b)
{
  if(b==0)
    return a;
  else
    return gcd(b,a%b);
}