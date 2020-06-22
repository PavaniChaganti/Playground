#include<iostream>
#include<cmath>
using namespace std;
int arm(int);
int arm(int n)
{
  int temp1, temp2, count=0, sum=0;
  temp1 = n;
  temp2 = n;
  while(temp1>0)
  {
    temp1=temp1/10;
    count++;
  }
  temp1 = n;
  while(n>0)
  {
    temp1 = n%10;
    n = n/10;
    sum = sum + pow(temp1,count);
  }
  if(sum==temp2)
    return 1;
  else
    return 0;
}
int main()
{
  int n;
  std::cin>>n;
  if(arm(n)==1)
      std::cout<<"Kindly proceed with encrypting";
  else
      std::cout<<"It is not an Armstrong number"; 
}