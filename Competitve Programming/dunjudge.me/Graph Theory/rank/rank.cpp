#include <bits/stdc++.h>
using namespace std;

int visited[10001];
vector<int> adjlist[10001];

bool cycle=false;//Fail when there is a cycle
vector<int> topo;
void dfs(int start,int vertex_id){
    //cout<<"dfs "<<vertex_id<<endl;
    if(visited[vertex_id]==1){//Visiting
        //Cycle
        cycle=true;
        return;
    }else if(visited[vertex_id]==2){return;}//Visited
    visited[vertex_id]=1;//Mark as visiting
    //sort(adjlist[vertex_id].begin(),adjlist[vertex_id].end());
    for(auto i:adjlist[vertex_id]){
        dfs(vertex_id,i);
    }
    topo.push_back(vertex_id);
    visited[vertex_id]=2;//Mark as visited
}

int main(){
    int k,n; cin>>k>>n;

    //fill(par,par+k,-1); //undefined
    for (int i=0;i<n;i++){
        int p1,p2,p3;char c1,c2;
        cin>>p1>>c1>>p2>>c2>>p3;
        if (c1==',' && c2=='>'){
            adjlist[p1].push_back(p3);
            adjlist[p2].push_back(p3);
        }
        else if (c1=='>' && c2==','){
            adjlist[p1].push_back(p2);
            adjlist[p1].push_back(p3);
        }
    }
    
    fill(visited,visited+k,false);
    for(int i=1;i<k;i++){
        if(!visited[i]){dfs(0,i);}
    }reverse(topo.begin(),topo.end());
    
    if (cycle)cout<<0;
    else{
        bool flag=false;
        for(auto i:topo){
            if(flag){cout<<" ";}else{flag=true;}
            cout<<i;
        }
    }
}
