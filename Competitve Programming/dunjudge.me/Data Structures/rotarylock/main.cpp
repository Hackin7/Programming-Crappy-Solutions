#include <bits/stdc++.h>
using namespace std;

//100%
typedef unsigned long long ull;
typedef long long ll;
ull modes=INT_MAX;
ull N = 1000000;
//Below here can mix & match
ull ft[1000001]; // note: this fenwick tree is 1-indexed.
////PUPQ//////////////////////////////////////////////////////
void fenwick_update(ull pos, ll value) {
    while (pos <= N) {
        //cout<<"Fenwick Updating: "<<pos<<","<<value<<endl;
        ft[pos] += value;
        ft[pos] = ft[pos]%modes;
        
        pos += pos&-pos;
    }
}
ull fenwick_query(ull pos) {
    ull sum = 0;
    while (pos) { // while p > 0
        sum += ft[pos];
        pos -= pos&-pos;
        sum %= modes;
    }
    return sum;
}
////RUPQ//////////////////////////////////////////////////////
void fenwick_range_update(ull pos_a, ull pos_b, ll val){
    //TLE way
    //for (int i=pos_a;i<=pos_b;i++){fenwick_update(i, val);}
    fenwick_update(pos_a, val);
    fenwick_update(pos_b+1, -val);
}
int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    memset(ft,0,sizeof(ft));
    ull Q,K;cin>>N>>Q>>K;
    modes = pow(2,K);
    bool flag=false;
    for(ull i=0;i<Q;i++){
        ull a,d,s;cin>>a>>d;
        if (a==0){
            cin>>s;
            fenwick_range_update(d,N,s);
        }
        else if(a==1){
            if (flag){cout<<"\n";}
            else flag=true;
            cout<<fenwick_query(d);
        }
    //cout<<endl;for (int i=1;i<=N;i++){cout<<fenwick_query(i)<<",";}cout<<endl;
    }
    return 0;
}
/*
4 6 2
0 3 2
1 2
1 4
0 2 1
1 2
1 3
*/
