using namespace std;
#include<iostream>
int main()
{
  int r, c;
  int a[10][10], b[10][10];
  std::cin>>r;
  std::cin>>c;
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      std::cin>>b[i][j];
    }
  }
  for(int i=0; i<r; i++)
  {
    for(int j=0; j<c; j++)
    {
      std::cout<<a[i][j] + b[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}