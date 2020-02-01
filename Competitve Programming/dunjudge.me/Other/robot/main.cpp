#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int main(){
    ll n;cin>>n;
    string ops;cin>>ops;
    ll x,y;cin>>x>>y;
    
    if (n < x+y){cout<<-1;return 0;}
    
    int tx=0,ty=0;
    for (auto c:ops){
        if (c=='R')tx++;
        else if(c=='L')tx--;
        else if (c=='U')ty++;
        else if(c=='D')ty--;
    }
    if (tx==x&&ty==y){cout<<0;return 0;}
    
    int Rc=tx>0?tx:0,Lc=tx<0?tx:0,Uc=ty>0?ty:0,Dc=ty<0?ty:0;
    
    return 0;
}
