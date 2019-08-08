#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("detectivein.txt"); 
    
    int N, M;
    infile >> N >> M;
    /*int A[M], B[M], St[M];
    for (int i=0; i<m; i++){
        infile >> A[i] >> B[i] >> St[i];
    }*/
    vector<pair<int, int> > adjList[n+1];
    for (int i=0;i<e;i++){
        int u,v,c; cin>>u>>v>>c;
        //Cost setting
        adjList[u].push_back(make_pair(v,c));
        adjList[v].push_back(make_pair(u,c));
    }
    infile.close();
    
    pair<int, int> stolen[N];
    
    int ans = 0;
    cout<<ans;
    
    ofstream outfile;
    outfile.open("detectiveout.txt");
    outfile << ans;
    outfile.close();
}
