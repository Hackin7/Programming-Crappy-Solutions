#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define M 1000000007
typedef long long ll;

#define V 100000

//Reference: https://github.com/ranaldmiao/sg_noi_archive/blob/master/2020_prelim/tasks/mountains/solutions/mountains.cpp

////PUPQ//////////////////////////////////////////////////////
int ft[V], cnt=1;//indexed by height order
void fenwick_update(int pos, int value) {
    while (pos <= cnt) {
        //cout<<"Fenwick Updating: "<<pos<<","<<value<<endl;
        ft[pos] += value;

        pos += pos&-pos;
    }
}
int fenwick_query(int pos) {
    ll sum = 0;
    while (pos) { // while p > 0
        sum += ft[pos];
        pos -= pos&-pos;
    }
    return sum;
}


ll dp[V];
ll fac(ll x){
    if (x==0){return 1;}
    if (x<V && dp[x]!=0){return dp[x];}
    dp[x]=x*fac(x-1);
    return dp[x];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll N; cin>>N;
    memset(dp,0,sizeof(dp));
    ll A[N],B[N];
    for(ll i=0;i<N;i++){cin>>A[i];A[i]=B[i];}
    
    sort(B,B+N);
    map<int,int> lookup;for(int i=0;i<N;i++){lookup[B[i]]=i;}
    
    for(int i=0;i<N;i++){A[i]=lookup[A[i]]+1;}
    
    //for(auto i:A){cout<<i<<" ";}cout<<endl;
    memset(ft,0,sizeof(ft));
    for(int i=1;i<=N;){
        fenwick_update(i,1);//Every item exists
    }
    
    for(int i=0;i<=N;i++){cout<<ft[i]<<" ";}cout<<endl;
    
    int order=0 ;//Min is 1
    
    for(int i=0;i<N;i++){
        int pos = fenwick_query(A[i]);
        int rank = pos*fac(N-i-1); //Previous permutations
        
        fenwick_update(A[i],-1);//Remove item
        cout<<rank<<","<<order<<endl;
        order+=rank;
    }    
    cout<<order;
    return 0;
}
