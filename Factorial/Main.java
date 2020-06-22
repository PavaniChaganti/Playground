#include<iostream>
using namespace std;
long int factorial(int);
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<factorial(n);
}
long int factorial(int n)
{
  if(n==1) 
    return 1;
  else 
    return n*factorial(n-1);
}