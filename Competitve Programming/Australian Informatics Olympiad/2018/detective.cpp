#include <bits/stdc++.h>
#include <fstream>
using namespace std;
/* Some Logic Guidelines
1 Honest + 1 Lie == 0 
*/
vector<int> coordinates;
deque<int> queue;
bool visited[10000];
void neighbours(int node){
}
void bfs(int node){
    for (int i=0; i<10000; i++){
        visited[i] = false;
    }
    ::coordinates.clear();
    ::queue.push_back(node);
    ::coordinates.push_back(node);
    while (!::queue.empty()){
        int current = ::queue.front();
        visited[current] = true;
        ::queue.pop_front();
        neighbours(node);
    }
}
int main(){
    ifstream infile; 
    infile.open("detectivein.txt"); 
    
    int N, M;
    infile >> N >> M;
    /*int A[M], B[M], St[M];
    for (int i=0; i<m; i++){
        infile >> A[i] >> B[i] >> St[i];
    }*/
    vector<pair<int, int> > adjList[N+1];
    for (int i=0;i<M;i++){
        int u,v,c; cin>>u>>v>>c;
        //Cost setting
        adjList[u].push_back(make_pair(v,c));
        //adjList[v].push_back(make_pair(u,c));
    }
    infile.close();
    
    int stolen[N]; // 0 is null, -1 is liar, 1 is honest
    
    int ans = 0;
    cout<<ans;
    
    ofstream outfile;
    outfile.open("detectiveout.txt");
    outfile << ans;
    outfile.close();
}
