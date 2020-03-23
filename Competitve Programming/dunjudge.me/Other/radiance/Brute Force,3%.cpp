#include <bits/stdc++.h>
using namespace std;

/*
typedef long long ll;
ll N = 100000;

//Below here can mix & match
ll ft[100001]; // note: this fenwick tree is 1-indexed.
////PUPQ//////////////////////////////////////////////////////
void fenwick_update(ll pos, ll value) {
    while (pos <= N) {
        //cout<<"Fenwick Updating: "<<pos<<","<<value<<endl;
        ft[pos] += value;
        
        pos += pos&-pos;
    }
}
ll fenwick_query(ll pos) {
    ll sum = 0;
    while (pos) { // while p > 0
        sum += ft[pos];
        pos -= pos&-pos;
    }
    return sum;
}

////PURQ////////////// ////////////////////////////////////////
ll fenwick_range_query(ll pos_a, ll pos_b) {
    return fenwick_query(pos_b) - fenwick_query(pos_a-1);
}
*/

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N,Q;cin>>N>>Q;
    int A[N];for(int i=0;i<N;i++){
        cin>>A[i];//fenwick_update(i,A[i]);
    }
    int count[N];
    for(int i=0;i<Q;i++){
        int L,R;cin>>L>>R;
        if(i!=0)cout<<"\n";
        int tribe=0,val=0;
        memset(count,0,sizeof(count));
        for(int j=L;j<=R;j++){
            count[A[j]]++;
            if(count[A[j]]>val && count[A[j]]){
                tribe=A[j];val=count[A[j]];
            }
        }
        //cout<<"("<<val<<","<<(R-L+1)*8<<endl;
        if(R-L>0 && 10*val<(R-L+1)*8){tribe=-1;}
        cout<<tribe;
    }
    return 0;
}
