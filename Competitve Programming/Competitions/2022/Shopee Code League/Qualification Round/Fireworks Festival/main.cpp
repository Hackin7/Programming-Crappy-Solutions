#include <bits/stdc++.h>
using namespace std;

// Goal: Receive highest amount of Shopee coins
typedef long long ll;

int main(){
    int n, m, d; cin>>n>>m>>d;
    int a[m], b[m],t[m]; // Road, val, timing
    for (int i=0;i<m;i++){
        cin>>a[i]>>b[i]>>t[i];
        // Change from 1 to 0 indexed
        a[i]-=1; 
        //t[i]-=1;
    }
    
    cout<<"---"<<endl;
    int maxt = *max_element(t,t+m)+1;
    
    int currbase=1,prevbase=0;
    int dp[2][n]; // No. or roads, optimal value
    
    
    for (int i=0;i<n;i++){
        for (int t=0;t<maxt;t++){
            dp[t][i]=0;
        }
    }
    //for (int i=0;i<n;i++){cout<<dp[i]<<" ";} cout<<endl;
    
    for(int T=1;T<maxt;T++){ // For aint units of time ////////////////
        
        currbase = prevbase;
        prevbase = (prevbase == 0) ? 1 : 0;
        
        for(int y=0;y<n;y++){ // start from anywhere 
            for(int x=0;x<n;x++){ // end
                if (abs(x-y) > d){continue;} // Cannot travel too far
                // Fireworks ////////////////////////////////////////
                int newdp = dp[prevbase][x];
                for(int i=0;i<m;i++){ // Firework
                    cout<<y<<" "<<x<<" "<<T<<":"<<i<<" "<<endl;
                    if (T == t[i]){
                        int coins = b[i] - abs(a[i] - x);
                        //cout<<coins<<endl;
                        newdp += coins;
                    }
                }
                dp[currbase][x] = max(dp[currbase][x], newdp);
                for (int i=0;i<n;i++){cout<<dp[currbase][i]<<" ";} cout<<endl;
            }
        }
    }
    
    int ans=0;
    for (int i=0;i<n;i++){
        ans = max(ans,dp[maxt-1][i]);
    }
    cout<<ans;
}
