#include <bits/stdc++.h>
using namespace std;
//48% Solution
const int V=1001;
vector<int > g[V];
bool colour[V];
bool visited[V];

int bfs(int x){
    deque<pair<int,int> > nodes;//node,dist
    nodes.push_back(make_pair(x,0));
    
    while (!nodes.empty()){
        pair<int,int> curr=nodes.front();
        nodes.pop_front();
        //cout<<curr.first<<"-"<<curr.second<<"\n";
        visited[curr.first] = true;
        if (colour[curr.first]){return curr.second;}
        for(auto i: g[curr.first]){
            if (!visited[i]){
                nodes.push_back(make_pair(i,1+curr.second));
            }
        }
    }
    return 0;
}
int main(){
    int n,m;cin>>n>>m;
    fill(colour,colour+n+1,0);//blue
    colour[1]=1;//Red
    
    int A, B;for(int i=0;i<n-1; i++){
        cin>>A>>B;
        g[A].push_back(B);
        g[B].push_back(A);
    }    
    n++;
    //cout<<"-----------";
    int t,v; for(int i=0;i<m;i++){
        cin>>t>>v;
        if (t==1){colour[v]=1;}
        else{
            fill(visited,visited+n,false);
            cout<<"\n";
            cout<<bfs(v);
        }
    }
    return 0;
}
