#include <bits/stdc++.h>
using namespace std;

bool cmp(pair<int,int> a, pair<int,int> b){
    if (a.first==b.first){
        return (a.second-a.first) > (b.second-b.first);
    }else{return a.first>b.first;}
}
//https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/
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
    
    int prev=0;
    
    int ans=1;//First activity always gets selected
    for(int i=1;i<(int)a.size();i++){
        //cout<<a[i].first<<' '<<a[i].second<<'\n';
        
        // If this activity has start time greater than or 
        // equal to the finish time of previously selected 
        // activity, then select it 
        
        if (a[prev].first >= a[i].second){
            //cout<<i<<endl;
            ans++;
            prev=i;
        }
    }
    cout<<ans;
    return 0;
}
