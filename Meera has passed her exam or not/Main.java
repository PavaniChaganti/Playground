#include<iostream>
int main()
{
  int n, reg_num, count=0;
  std::cin>>n;
  int a[n];
  for(int i=0; i<n; i++)
  {
    std::cin>>a[i];
  }
  std::cin>>reg_num;
  for(int i=0; i<n; i++)
  {
    if(a[i] == reg_num)
      break;
    else
      count++;
  }
  if(count==n)
    std::cout<<"She failed";
  else 
    std::cout<<"She passed her exam";
}