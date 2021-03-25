#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
    bool t6=true,t7 = true;
    ll n,q;cin>>n>>q;
    ll h[n];for (ll i=0;i<n;i++){cin>>h[i];
        if (i>0&&h[i]<h[i-1])t7=false;
        if (h[i] != i+1)t6=false;}
    ll y[q];for (ll i=0;i<q;i++){cin>>y[i];}
    
    if (t6){
        //cout<<"6 ";
        for (ll j=0;j<q;j++){
            ll ans = min(y[j],n);//index where it exceeds
            //out<<ans<<" ";
            ans = ans*(ans+1)/2;
            if (j!=0){cout<<endl;}cout<<ans;
        }
    }
    else if(t7){
        //cout<<"i";
        for (ll j=0;j<q;j++){
            ll ans = upper_bound(h,h+n,y[j])-h;
            //int ans = 0;
            //for(;ans<n && h[ans]<=y[j];ans++){}
            if (h[ans]<=y[j]){ans++;}
            ans = ans*(ans+1)/2;
            if (j!=0){cout<<endl;}cout<<ans;
        }
    }
    else{// if (n<1000&&q<1000){
        for (ll j=0;j<q;j++){
            ll ans = 0;
            int counter=0;
            for(ll a=0;a<n;){//start position
                while (counter < n && h[counter]<=y[j]){
                    counter++;
                }
                //cout<<ans<<"->"<<counter<<endl;
                
                ll choices = (counter-a)*(counter-a+1)/2;
                //cout<<"Choice"<<choices<<endl;
                ans+=choices;
                a = ++counter;
            }
            if (j!=0){cout<<endl;}cout<<ans;
        }
    }
}
/*
Test Data for Subtask 6
6 1
1 2 3 4 5 6
6
*/
