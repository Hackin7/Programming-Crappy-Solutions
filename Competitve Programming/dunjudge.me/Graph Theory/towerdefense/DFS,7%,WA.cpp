#include <bits/stdc++.h>
#include <fstream>
using namespace std;

const int V=100005;
typedef priority_queue<int> pq;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    set<pair<int, int> > g[V];
    int count[V];fill(count,count+V,0);
    int dist[V];fill(dist, dist+V, -1);
    
    ///Adjacency List//////////////////////
    int N, E, A, B, C;
    cin >> N >> E;
    for (int i = 0; i < E; i++) {
        cin >> A >> B >> C;
        C=0;
        g[A].insert(make_pair(B, C));
        //g[B].insert(make_pair(A, C));
    }
    queue<pair<int, int> > q;
    q.push(make_pair(0,0));count[0]=1;dist[0]=0;
    while (!q.empty()) {
        int v = q.front().first;
        //int d = q.front().second;
        //cout<<v<<" "<<count[v]<<endl;
        q.pop();

        count[v] %= 1000000007;
        
        for (auto i: g[v]) {
            if (dist[i.first]==-1){
                dist[i.first] = 0;//d+i.second;
                q.push(make_pair(i.first,dist[i.first]));
                count[i.first]=count[v];//same number of paths
            }else{
                count[i.first]++;//another path to it
            }
        }
        //q.push(make_pair(g[v].top().first, d+1));
    }
    cout<<count[N-1];
}

/*
5 5
0 1 10
1 2 2
1 3 3
2 4 3
3 4 2
*/
