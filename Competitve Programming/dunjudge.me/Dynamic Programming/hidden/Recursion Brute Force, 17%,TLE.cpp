#include <bits/stdc++.h>
using namespace std;

int N,M;string S,T;

int times(int posS,int posT){
    ////Base Case/////////////////////
    if (posT<0){return 1;}//Match
    else if (posS<0){return 0;}//Out of bounds
    ////Recursion Case////////////////
    int ans=0;
    //If it matches with the appropriate position
    if (S[posS]==T[posT]){
        ans += times(posS-1,posT-1);
    }
    //Move on to next letter
    ans += times(posS-1,posT);
    return ans;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin>>N>>M>>S>>T;
    cout<<times(N-1,M-1);
    return 0;
}
