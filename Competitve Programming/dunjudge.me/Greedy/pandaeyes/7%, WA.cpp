#include <bits/stdc++.h>
using namespace std;

typedef int ll;
////RURQ//////////////////////////////////////////////////////
const int V=1000001; int N=V;
ll B1[V];ll B2[V];
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
///////////////////////////////////////
bool cmp(pair<int,int> a, pair<int,int> b){
    return (a.second-a.first) < (b.second-b.first);
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N;cin>>N;
    int S,E;vector<pair<int,int> >a;
    for(int i=0;i<N;i++){
        cin>>S>>E;
        a.push_back(make_pair(S,E));
    }
    memset(B1,0,sizeof(B1));memset(B2,0,sizeof(B2));
    sort(a.begin(),a.end(),cmp);
    int ans=0;
    for(auto i:a){
        //cout<<i.first<<' '<<i.second<<'\n';
        //Have to take into account the start time
        if (!rurq_range_query(i.first,max(i.first,i.second-1))){
            rurq_range_update(i.first,max(i.first,i.second-1),1);
            ans++;
            //cout<<";";
        }
    }
    cout<<ans;
    return 0;
}
