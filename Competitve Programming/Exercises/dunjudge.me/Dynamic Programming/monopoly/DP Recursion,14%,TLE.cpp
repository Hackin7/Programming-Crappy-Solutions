#include <bits/stdc++.h>
using namespace std;

int M=1000000007;

int pos(int N,char S,int X){
    int m=0;
    switch(S){
        case 'A':m=0;break;
        case 'B':m=1;break;
        case 'C':m=2;break;
        case 'D':m=3;break;
    }
    //Mod by maxpos
    int maxpos = (N-1)*4;
    return (m*(N-1)+X)%maxpos;
}

int dp[400000];
int ways(int pos){
    ////Base Case///////////////
    //1 way to reach start
    if (pos==0){return 1;}
    //No way to go back
    if (pos<0){return 0;}
    //Initialised
    if (dp[pos]>0){return dp[pos];}
    ////Recursion///////////////
    dp[pos]=0;
    for(int i=1;i<=6;i++){
        dp[pos]+=ways(pos-i)%M;
    }
    //cout<<dp[pos];
    return dp[pos];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int TC; cin>>TC;
    memset(dp,0,sizeof(dp));
    for(int t=0;t<TC;t++){
        int N,X;char S;cin>>N>>S>>X;
        int p = pos(N,S,X);
        //cout<<p<<endl;
        
        if(t!=0)cout<<"\n";
        cout<<ways(p);
    }
    return 0;
}
