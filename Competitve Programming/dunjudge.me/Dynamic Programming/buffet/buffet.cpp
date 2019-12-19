#include <bits/stdc++.h>
using namespace std;

int main(){
    int N,K; cin>>N>>K;
    int P1[N]; for(int i=0;i<N;i++){cin>>P1[i];} //Satisfaction
    int P2[N]; for(int i=0;i<N;i++){cin>>P2[i];}
    
    int memo[N][2];//Table
    memo[0][0] = P1[0];memo[0][1] = P2[0];
    for (int i=1;i<N;i++){for (int j=0;j<2;j++){
        int choice=0;
        if (j==0){
            choice = max(memo[i-1][0]+P1[i],//Same Table
                         memo[i-1][1]+P2[i]-K); //Changed from 2
        }
        else if (j==1){
            choice = max(memo[i-1][0]+P1[i]-K,//Changed
                         memo[i-1][1]+P2[i]);
        }
        memo[i][j]=choice;
    }}
    cout<<max(memo[N-1][0], memo[N-1][1]);
    return 0;
}
