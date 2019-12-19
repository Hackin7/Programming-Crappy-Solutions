#include <bits/stdc++.h>
using namespace std;

int main(){
    int N; cin>>N;
    string S; cin>>S;
    int val[N];for(int i=0;i<N;i++){
        if (S[i]=='M'){val[i] = -2;}
        else{val[i] = S[i]-'0';}
    }
    
    int memo[N];//State
    memo[0] = val[0];
    for (int i=1;i<N;i++){
        //Transition
        memo[i] = max(memo[i-1]+val[i],val[i]);
    }
    cout<<*max_element(memo,memo+N)<<endl;
    return 0;
}
