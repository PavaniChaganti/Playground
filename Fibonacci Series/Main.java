#include<iostream>
using namespace std;
int fibonacci(int);
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fibonacci(n);
}
int fibonacci(int n)
{
  int fib1=0, fib2=1;
  if(n==1)
    return fib1;
  else if(n==2)
    return fib2;
  else
    return fibonacci(n-1)+fibonacci(n-2);
}