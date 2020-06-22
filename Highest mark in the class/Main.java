#include<iostream>
int main()
{
  int n, max;
  std::cin>>n;
  int a[n];
  for(int i=0; i<n; i++)
  {
    std::cin>>a[i];
  }
  max = a[0];
  for(int i=1; i<n; i++)
  {
    if(a[i]>max)
      max = a[i];
  }
  std::cout<<max;
}