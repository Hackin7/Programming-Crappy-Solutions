#include <bits/stdc++.h>
using namespace std;


#define V 1000000
int N,D;
int X[V],A[V],B[V];
int dp[V];

//returns fuel left?
int minF(int i,int f){ //i is distance, f is fuel
    
    if (i==0){dp[i]=f;return f;}//remaining fuel left
    if (dp[i]!=-1){return dp[i];}
    dp[i]= minF(i-1,f+1)+1;//travel 1 distance
    
    //Shortcuts
    for (int i=0;i<N;i++){
        if (X[i]+A[i] == i){
            for(int dd=X[i]+A[i]-1;dd>=X[i];dd--){
                //Want to make sure as much fuel left
                dp[i] = max(dp[i], minF(dd, f+(X[i]+A[i]-1-dd) ) );
            }
        }
    }
    return dp[i];
    
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin>>N>>D;
    
    for(int i=0;i<N;i++){cin>>X[i]>>A[i]>>B[i];}
    
    memset(dp,-1,sizeof(dp));
    cout<<minF(D,0);
    
    for(int i=0;i<=D;i++){cout<<dp[i]<<" ";}cout<<endl;
    
    //simulate driving
    return 0;
}
/*
1 10
4 8 6
*/
