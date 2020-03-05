#include <bits/stdc++.h>
using namespace std;

bool cmp(pair<int,int> a, pair<int,int> b){
    if (a.first==b.first){
        return (a.second-a.first) < (b.second-b.first);
    }else{return a.first<b.first;}
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
    sort(a.begin(),a.end(),cmp);
    int ans=0, end=1;
    for(auto i:a){
        //cout<<i.first<<' '<<i.second<<'\n';
        //Have to take into account the start time
        if (end <= i.first){
            end = i.second;
            ans++;
            //cout<<";";
        }
    }
    cout<<ans;
    return 0;
}
