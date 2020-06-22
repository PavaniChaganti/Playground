#include<iostream>
using namespace std;
int swap(int &, int &);
int swap(int &a,int &b)
{
  int temp;
  temp = a;
  a = b;
  b = temp;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
}