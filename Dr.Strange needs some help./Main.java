#include <iostream>
#include <cmath>
using namespace std;
int exp(int, int);
int main()
{
  int m, n, req;
  int a;
  std::cin>>m>>n>>req;
  a = exp(m, n);
  if(a<req)
    std::cout<<"Sorry Doctor! You need more bacteria.";
  else
    std::cout<<"Doctor, you can proceed with your experiment.";
}
int exp(int m, int n)
{
  int a;
  a = pow(m,n);
  return a;
}