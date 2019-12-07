#include <bits/stdc++.h>
using namespace std;

vector<pair<int,int> > adjlist[100000];
bool visited[100000];
void dfs(int x, int end, int val){
    if (visited[x])return;
    visited[x] = true;
    if (x == end){cout<<":"<<val<<":";return;}
    for (int i=0;i<adjlist[x].size();i++){
        cout<<adjlist[x][i].first<<",";
        dfs(adjlist[x][i].first,end,val+adjlist[x][i].second);
    }cout<<endl;
}
int main(){
    fill(visited, visited+sizeof(visited), false);
    int N;cin>>N;
    int n1,n2,w;
    for (int i=0;i<N-1;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }
    cout<<"h";
    int q; cin>>q;
    for (int i=0;i<q;i++){
        fill(visited, visited+sizeof(visited), false);
        int x,y; cin>>x>>y;
        if (i!=0){cout<<endl;}
        dfs(x,y,0);
    }
}
