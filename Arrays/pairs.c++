#include <bits/stdc++.h>
  using namespace std;
  int n,m;
  int l[300001],r[300001],c[300001];
  int check(int x)
  {
    memset(c,0,sizeof c);
    int i,cnt=0;
    for(i=0;i<m;i++)
      if(x==l[i] || x==r[i])
        cnt++;
        else{
          c[l[i]]++;
          c[r[i]]++;
        }
        for(i=1;i<=n;i++)
          if(cnt+c[i]==m)
          return 1;
        return 0;
  }
  
  int main()
  {
    int i;
    cin>>n>>m;
    for(i=0;i<m;i++)
     cin>>l[i]>>r[i];
    if(check(l[0]) || check(r[0]))
      cout<<"YES\n";
    else
      cout<<"NO\n";
  }