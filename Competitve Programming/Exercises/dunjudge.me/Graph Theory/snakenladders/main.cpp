#include <bits/stdc++.h>
using namespace std;

//27% WA
int main() {
    int N,S;cin>>N>>S;
    int V=N+1;
    vector<int> g[V];
    for (int i = 0; i < S; i++) {
        int A,B;cin>>A>>B;//Start,End
        g[A].push_back(B);
    }
    //priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > q;
    queue<pair<int,int> > q;
    int dist[V];fill(dist, dist+V, -1);
    q.push(make_pair(1, 0));//Start from first square
    while (!q.empty()) {
        pair<int,int> c=q.front();
        int v = c.first; //Node
        int d = c.second; //Distance
        q.pop();

        if (dist[v] != -1) continue; //Visited
        dist[v] = d;

        //cout<<v<<"\n";

        if (v==N){break;}

        for (int next : g[v]) {
            q.push(make_pair(next,d));
        }
        if (g[v].size()==0){for(int i=1;i<=6;i++){
            int next=v+i;
            if (next>N){next = N-(next-N);}//bounce back
            q.push(make_pair(next,d+1));
        }}
    }
    cout<<dist[N];
}
/*
10 6
9 1
8 1
7 1
6 1
5 1
4 1
*/
