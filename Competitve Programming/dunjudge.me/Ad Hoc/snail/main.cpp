#include <bits/stdc++.h>
using namespace std;

//TLE
typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll H,N;cin>>H>>N;
    ll P[N];for(ll i=0;i<N;i++){cin>>P[i];}
    
    ll local=0, lmin=INT_MAX,lmax=-INT_MAX;
    
    bool subtask2=true;
    for(ll i=0;i<N;i++){
        local+=P[i];
        lmin=min(lmin,local);
        lmax=max(lmax,local);
        if (i>0 && P[i]!=P[i-1]){
            subtask2=false;}
    }
    
    ll h=0,d=-1,p=-1;
    if (N==1 && local > 0){
        d=H/local;p=0;
        if (d*local==H){d--;}
    }else if (subtask2 && local > 0){
        ll turns = H/P[0];
        d=turns/N;p=turns%N;
        if (turns*P[0]>=H && p>0){p--;}
        else if (turns*P[0]>=H){d--;p=N-1;}
    }
    else if (local > 0){//Cannot Make it past first day
        ll turns=0;
        for (;;turns++){
            //Speed Up 
            if (turns%N==0 && h+lmax<H){
                h+=local;turns+=N-1;continue;}
            h+=P[turns%N];
            if (h>=H)break;
        }
        d=turns/N;p=turns%N;
    }else if (lmax>0&&h+lmax>=H){
        ll turns=0;
        for(;turns<N;turns++){
            h+=P[turns];
            if (h>=H)break;
        }
        d=0;p=turns;
    }
    cout<<d<<" "<<p;
    return 0;
}
