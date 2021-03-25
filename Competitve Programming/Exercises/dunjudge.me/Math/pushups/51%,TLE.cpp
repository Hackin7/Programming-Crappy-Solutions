#include <bits/stdc++.h>
using namespace std;

const int NN = 1000000;
int pushupMemo[NN+1];//1-indexed

int main(){
    memset(pushupMemo,0,sizeof(pushupMemo));
    for(int i=1;i<=NN;i++){
        for(int j=1;i*j<=NN;j++){//<Multiple
            pushupMemo[i*j]+=i;
        }
    }
    
    int T; cin>>T;
    for(int i=0;i<T;i++){
        int N;cin>>N;
        if (i!=0)cout<<"\n";
        int ans=0;
        //for(int p=1;p<=N;p++){ans=max(ans,noPushups(p));}
        ans = *(max_element(pushupMemo,pushupMemo+N+1));
        cout<<ans;
    }
    return 0;
}
