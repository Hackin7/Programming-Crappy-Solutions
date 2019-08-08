#include <bits/stdc++.h>
using namespace std;

/*UDFS*/
int parent[1000000];
int root(int x) {
    if (parent[x]==-1) return x;
    return parent[x] = root(parent[x]);
}
bool isConnected(int x, int y) {
    return root(x) == root(y);
}
void connect(int x, int y) {
    int rootX = root(x);
    int rootY = root(y);
    if(rootX != rootY)
        parent[rootX] = rootY;
}

/*subgraphs

int main(){
    
    int N,M;cin>>N>>M;
    int n1,n2,w=1;
    fill(parent,parent+N,-1);
    int groups = N;

    for (int i=0;i<M;i++){
        cin>>n1>>n2;//>>w;
        
        if(not isConnected(n1,n2))groups--;
        connect(n1,n2);
    }    
    cout<<groups;
}
*/

/*general

int main(){
    int N,M;cin>>N>>M;
    
    int power[N+1];
    for (int i=1;i<=N;i++)cin >> power[i];
    int n1,n2;
    fill(parent,parent+N+1,-1);

    for (int i=0;i<M;i++){
        cin>>n1>>n2;//>>w;
        //cout<<endl<<n1<<":"<<n2<<","<<
        //root(n1)<<"_"<<root(n2)<<","<<
        //power[root(n1)]<<"_"<<power[root(n2)]<<","<<
        //(power[root(n1)]<power[root(n2)])<<"="<<
        //(power[root(n1)] > power[root(n2)])<<endl;
        if (isConnected(n1,n2)){
            cout<<-1<<endl;
            continue;
        }
        
        if (power[root(n1)]<power[root(n2)]){
            cout<<root(n2)<<endl;
            connect(n1,n2);
        }
        else if (power[root(n1)] > power[root(n2)]){
            cout<<root(n1)<<endl;
            connect(n2,n1);
        }
        
    }
    //for (int i=0;i<=N;i++)cout<<power[i]<<" ";
    //cout<<endl;
    //for (int i=0;i<N;i++)cout<<parent[i]<<" ";
}
*/

/*cars
int main(){
    int N,M;cin>>N>>M;
    fill(parent,parent+N,-1);
    int n1,n2,w;
    //vector<pair<int,int>> adjlist[N+1];
    vector<pair<int,pair<int,int> > > edges;
    // weight,nodeA,nodeB
    for (int i=0;i<M;i++){
        cin>>n1>>n2>>w;
        //adjlist[n1].push_back(make_pair(n2,w));
        //adjlist[n2].push_back(make_pair(n1,w));
        edges.push_back( make_pair(w, make_pair(n1,n2)) );
        //connect(n1,n2);
    }  
    int maxWeight=0;
    sort(edges.begin(), edges.end());
    int totalWeights = 0;
    for (auto e:edges){
        int a = e.second.first;//node1
        int b = e.second.second;//node2
        int weight = e.first;
        if (root(a) == root(b)) continue; //taking this edge will cause a cycle
        totalWeights += weight; //take this edge
        connect(a,b);//parent[root(a)] = root(b); //connect them in the UFDS
        //cout<<a<<":"<<b<<":"<<weight<<"_"<<isConnected(1,N)<<endl;
        if (isConnected(1,N)){
            //if (weight > maxWeight)
            maxWeight=weight;
            break;
        }
    }
    //max(arr,arr+n);
    //cout<<totalWeights<<"_";
    cout<<maxWeight;                                
}
*/

/*sightseeing2*/
int main(){
    long V,E,Q;cin>>V>>E>>Q;
    //graph
    vector<pair<int,pair<int,int> > > edges;
    long n1,n2,w;
    vector<pair<long,long>> adjlist[V+1];
    for (long i=0;i<E;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
        edges.push_back( make_pair(w, make_pair(n1,n2)) );
    }    
    long M;
    for (long i=0;i<Q;i++){
        cin>>M;
        int maxWeight=0;int size=0;
        
    sort(edges.begin(), edges.end());/*
    int totalWeights = 0;
    for (auto e:edges){
        int a = e.second.first;//node1
        int b = e.second.second;//node2
        int weight = e.first;
        if (root(a) == root(b)) continue; //taking this edge will cause a cycle
        totalWeights += weight; //take this edge
        connect(a,b);//parent[root(a)] = root(b); //connect them in the UFDS
        size++;
        //cout<<a<<":"<<b<<":"<<weight<<"_"<<isConnected(1,N)<<endl;
        if (size>M){
            //if (weight > maxWeight)
            maxWeight=weight;
            break;
        }
    }*/
    cout<<edges[0].first<<endl;
    }
    
}
