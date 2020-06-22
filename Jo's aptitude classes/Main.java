#include<iostream>
using namespace std;
int gcd(int, int, int);
int gcd(int a, int b, int c)
{
  int num = 1, i=1;
  while(i<=a && i<=b && i<=c)
  {
    if(a%i==0 && b%i==0 & c%i==0)
    {
      num = i;
    }
    i++;
  }
  return num;
}
int main()
{
  int a, b, c, ans;
  std::cin>>a>>b>>c>>ans;
  if(gcd(a,b,c) == ans)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}