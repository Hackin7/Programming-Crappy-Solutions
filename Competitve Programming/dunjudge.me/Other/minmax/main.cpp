#include <bits/stdc++.h>
using namespace std;

#define modval 998244353
int Aval[100000000];
int A,B,C;
int fA(int i){
    if(i==0)return A;
    if (Aval[i]!=-1){return Aval[i];}
    Aval[i]=(fA(i-1)*B+C)%modval;
    return Aval[i];
}

vector<pair<int,int>> adjlist[10000];
int dijkstra(int N, int node, int end){ 
    //int node=1;
    priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > pq; // distance, node
    
    int dist[N+1];
    memset(dist, -1, sizeof(dist));
    
    pq.push(make_pair(0, node)); dist[node] = 0;
    bool passedEnd = false;
    while(!pq.empty()){
        pair<int,int> c = pq.top();
        cout << c.first << "_" << c.second<<" ";
        pq.pop();
        if (c.second == end){passedEnd = true;}
        if(c.first != dist[c.second]) continue;
        for(auto i : adjlist[c.second]){ //all elements in vector
            if(dist[i.first] == -1 || dist[i.first] > max(c.first,i.second)){ // If distance not calculated or distance can be smaller
                cout<<")";
                dist[i.first] = max(dist[i.first],i.second);//c.first + i.second;
                pq.push(make_pair(dist[i.first], i.first));
            }
        }
    }
    if (!passedEnd)return -1;
    return dist[end];
    /*
    for (int i=1;i<N+1;i++){
        cout<<dist[i]<<" ";
    }*/
}

int main(){
    int N,M,Q;cin>>N>>M>>Q;
    memset(Aval,-1,sizeof(Aval));
    int n1,n2,w;
    for (int i=0;i<M;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }    
    cin>>A>>B>>C;
    int ans=0;
    for(int i=0;i<Q;i++){
        int S=fA(2*i)%N, D=fA(2*i+1)%N;
        int dist=dijkstra(N,S,D)%modval;
        cout<<"["<<S<<","<<D<<":"<<dist<<
        "]"<<endl;
        if (S==D){continue;}
        else{ans+=dist;}
    }
    cout<<ans;
}
