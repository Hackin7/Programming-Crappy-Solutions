#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef pair<int,int> ipair;
bool cmp(pair<int,int> a, pair<int,int> b){
    if (a.first==b.first){
        return (a.second-a.first) > (b.second-b.first);
    }else{return a.first>b.first;}
}
#define V 10000000
int N;int s[V],e[V],n[V];

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin>>N;
    for(int i=0;i<N;i++){cin>>s[i]>>e[i]>>n[i];}
    
    //Subtask 1: n==100, Greedy solution
    vector<ipair> a;
    for(int i=0;i<N;i++){a.push_back(make_pair(s[i],e[i]));}
    sort(a.begin(),a.end(),cmp);
    
    int prev=0;
    int ans=1;//First activity always gets selected
    for(int i=1;i<(int)a.size();i++){
        //cout<<a[i].first<<' '<<a[i].second<<'\n';
        
        // If this activity has start time greater than or 
        // equal to the finish time of previously selected 
        // activity, then select it 
        
        if (a[i].second <= a[prev].first){
            //cout<<i<<endl;
            ans++;
            prev=i;
        }
    }
    cout<<ans*100;
    return 0;
}
/*
3
4 10 200
1 3 100
2 9 600
*/

