#include <bits/stdc++.h>
using namespace std;
bool f(int* t,int N,int M,int C,int x){
    int diff = INT_MAX,bus=M;
    for(int i=0;i<C;i++){
        int ldiff = t[i-1]-t[0];
        for(int j=i;j<N;j+=C){
            ldiff = max(ldiff,t[min(j+C-1,N-1)]-t[j]);
        }
        diff = min(diff,ldiff);
    }
    cout<<"diff"<<diff<<endl;
    if (bus<0)return false;
    return true;
}
int main(){
    int N,M,C; cin>>N>>M>>C;
    int t[N];for(int i=0;i<N;i++)cin>>t[i];
    sort(t,t+N);
    
    int ans = 0;
    /*int delayer = 0;
    for(int i=0;i<N;i+=C){
        if (i%C==0){
            delayer = t[min(N-1,i+C-1)];
        }
        ans=max(ans,delayer-t[i]);
    }
    */
    int L = 0; int R = t[N-1]; // starting range [L, R]
    while(L<R){
        int Mid=(L+R)/2;//cout<<"Mid"<<Mid<<endl;
        if (f(t,N,M,C,Mid))R=Mid;
        else L=Mid+1;
    }
    ans = L;
    cout<<ans;
    return 0;
}
