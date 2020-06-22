#include<iostream>
using namespace std;
int main()
{
  int n, i=1;
  std::cin>>n;
  do
  {
    if(i%2==1)
      std::cout<<i*i-1<<" ";
    else
      std::cout<<i*i-2<<" ";
    i++;
  }while(i<=n);
}