#include <bits/stdc++.h>
using namespace std;

int N,M;string S,T;

int memo[3000000][10];
int times(int posS,int posT){
    ////Base Case/////////////////////
    if (posT<0){return 1;}//Match
    else if (posS<0){return 0;}//Out of bounds
    ////Recursion Case////////////////
    if (memo[posS][posT]!=-1){return memo[posS][posT];}
    memo[posS][posT]=0;
    //If it matches with the appropriate position
    if (S[posS]==T[posT]){
        memo[posS][posT] += times(posS-1,posT-1);
    }
    //Move on to next letter
    memo[posS][posT] += times(posS-1,posT);
    return memo[posS][posT];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    memset(memo,-1,sizeof(memo));
    cin>>N>>M>>S>>T;
    cout<<times(N-1,M-1);
    return 0;
}
