#include <bits/stdc++.h>
using namespace std;

//Some Notes
/*
Fenwick Tree, the array stores the buckets (sums)
Has to be 1 indexed
*/
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
////RUPQ//////////////////////////////////////////////////////
void fenwick_range_update(ll pos_a, ll pos_b, ll val){
    //TLE way
    //for (ll i=pos_a;i<=pos_b;i++){fenwick_update(i, val);}
    fenwick_update(pos_a, val);
    fenwick_update(pos_b+1, -val);
}
////PURQ////////////// ////////////////////////////////////////
ll fenwick_range_query(ll pos_a, ll pos_b) {
    return fenwick_query(pos_b) - fenwick_query(pos_a-1);
}


////RURQ//////////////////////////////////////////////////////
ll B1[100001];ll B2[100001];
void base_update(ll *ft, ll pos, ll value){
  //Add largest power of 2 dividing x / Last set bit in number x
  for (; pos <= N; pos += pos&(-pos))
    ft[pos] += value;
}
void rurq_range_update(ll a, ll b,ll v){
  base_update(B1, a, v);
  base_update(B1, b + 1, -v);
  base_update(B2, a, v * (a-1));     
  base_update(B2, b + 1, -v * b);     
}
void rurq_poll_update(ll a, ll v){
    rurq_range_update(a,a,v);
}
ll base_query(ll *ft,ll b){
  ll sum = 0; 
  for(; b > 0; b -= b&(-b))
    sum += ft[b];
  return sum;
}
// Return sum A[1...b]
ll rurq_query(ll b){
  return base_query(B1, b) * b - base_query(B2, b);
}

//Return sum A[a...b]
ll rurq_range_query(ll a,ll b){
  return rurq_query(b) - rurq_query(a-1);
}

int main(){
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL); 
    memset(ft, 0, sizeof(ft));
    memset(B1, 0, sizeof(ft));
    memset(B2, 0, sizeof(ft));
    
    cin>>N;
    //cout<<"Array"<<N<<endl;
    ll arr[N+1];for (ll i=1;i<=N;i++){cin>>arr[i];}
    
    //cout<<"Fenwick Updating"<<endl;
    for (ll i=1;i<=N;i++){
        rurq_poll_update(i,arr[i]);
    }
    
    //cout<<"Queries"<<endl;
    ll q; cin>>q;
    bool newlineFlag = false;
    for (ll i=0;i<q;i++){
        //cout<<"Query "<<i<<endl;
        char query; cin>>query;
        if (query == '0'){
            ll x,y; cin>>x>>y;
            ll val = rurq_range_query(x+1,y+1);
            if (newlineFlag){cout<<endl;}
            else{newlineFlag = true;}
            cout<<val;
        }else if (query == '1'){
            ll a,b,c; cin>>a>>b>>c;
            //for (ll j=a;j<=b; j++){arr[j]+=c;}
            rurq_range_update(a+1,b+1,c);
        }
    }
}

