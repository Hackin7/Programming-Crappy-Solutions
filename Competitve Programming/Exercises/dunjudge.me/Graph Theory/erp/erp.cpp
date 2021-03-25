#include <bits/stdc++.h>
using namespace std;
int getVal(int n, int x, int y){
    return y*n + x;
}
/*dijkstra*/
//Have to use adjList, cannot adjMatrix
int main(){
    int N,M;cin>>N>>M;
    int n1,n2,w;vector<pair<int,int> > adjlist[N];
    for (int i=0;i<M;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }
    //int dist[N*N+2];memset(dist, -2, sizeof(dist));
    int K; cin>>K;
    for (int i=0; i<K; i++){
        int X,Y;cin>>X>>Y;
        int node=X;
        int iv = getVal(N,Y,node);//
        iv = Y;
        //if (dist[iv]==-2){
            //fill(dist+getVal(N,0,node), dist+getVal(N,N,node),-1);
            ////Dijkstra////////////
            bool vis[N];fill(vis,vis+N,false);
            priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > pq; // distance, node
            int dist[N];memset(dist, -1, sizeof(dist));
            int iv4 = getVal(N,node,node); //
            iv4=node;
            pq.push(make_pair(0, node)); dist[iv4] = 0;
            while(!pq.empty()){
                pair<int,int> c = pq.top();
                //cout << c.first << "_" << c.second<<" ";
                pq.pop();
                int iv2 = getVal(N,c.second,node);//
                iv2=c.second;
                if(c.first != dist[iv2]) continue;
                for(pair<int,int> i : adjlist[c.second]){
                    int iv3 = getVal(N,i.first,node); //
                    iv3=i.first;
                    if(dist[iv3] == -1 || dist[iv3] > c.first + i.second){
                        dist[iv3] = c.first + i.second;
                        pq.push(make_pair(dist[iv3], i.first));
                    }
                }
            }
        //}
        if (dist[iv]==-1)cout<<-1;
        else cout<<dist[iv]-1;
        if (i!=K-1)cout<<endl;
        ////////////////////////
    }
}
