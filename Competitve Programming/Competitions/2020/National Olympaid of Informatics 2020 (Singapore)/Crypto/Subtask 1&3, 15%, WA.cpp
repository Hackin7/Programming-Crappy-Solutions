#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define M 1000000007
typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll N; cin>>N;
    ll A[N]; for(ll i=0;i<N;i++){cin>>A[i];}
    
    if (N==1){cout<<1;}
    else if (N==2){    //Subtask 1
        cout<< (A[0]>A[1]?2:1);
    }else{ //Subtask 3
        bool inc=1,dec=1;
        for(ll i=1;i<N;i++){
            if(A[i-1]<A[i]){dec=0;}
            else if (A[i-1]>A[i]){inc=0;}
            else{dec=0;inc=0;}
        }
        if (inc){
            cout<<1;
        }else if(dec){
            //ans = N!
            ll ans = 1;
            for(ll i=2;i<=N;i++){
                ans=(ans*i)%M;}
            cout<<ans;
        }
    }
    
    return 0;
}
