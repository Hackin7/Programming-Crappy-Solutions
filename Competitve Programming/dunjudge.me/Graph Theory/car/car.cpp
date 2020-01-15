#include <bits/stdc++.h>
using namespace std;


typedef pair<int,int> iPair;
vector<pair<int,int> > adjList[10000]; // node, weight
  
void primMST(int V, int src) 
{ 
    // Create a priority queue to store vertices that 
    // are being preinMST. This is weird syntax in C++. 
    // Refer below link for details of this syntax 
    // http://geeksquiz.com/implement-min-heap-using-stl/ 
    int INF = INT_MAX;
    // Create a vector for keys and initialize all 
    // keys as infinite (INF) 
    vector<int> key(V, INF); 
    // To store parent array which in turn store MST 
    vector<iPair> parent(V, make_pair(-1,0)); 
    // To keep track of vertices included in MST 
    vector<bool> inMST(V, false); 
  
    priority_queue< iPair, vector <iPair> , greater<iPair> > pq;   
    pq.push(make_pair(0, src)); 
    key[src] = 0; 
  
    /* Looping till priority queue becomes empty */
    while (!pq.empty()) 
    { 
        // The first vertex in pair is the minimum key 
        // vertex, extract it from priority queue. 
        // vertex label is stored in second of pair (it 
        // has to be done this way to keep the vertices 
        // sorted key (key must be first item 
        // in pair) 
        int u = pq.top().second; 
        pq.pop(); 
  
        inMST[u] = true;  // Include vertex in MST 
  
        // 'i' is used to get all adjacent vertices of a vertex 
        list< pair<int, int> >::iterator i; 
        for (auto i:adjList[u]) 
        { 
            int v = (i).first, weight = (i).second;   
            //  If v is not in MST and weight of (u,v) is smaller 
            // than current key of v 
            if (inMST[v] == false && key[v] > weight) 
            { 
                // Updating key of v 
                key[v] = weight; 
                pq.push(make_pair(key[v], v)); 
                parent[v] = make_pair(u,weight); 
            } 
        } 
    } 
  
    // Print edges of MST using parent array 
    int ans=0;
    for (int i = 1; i < V; ++i){
        printf("%d - %d\n", parent[i].second, i);
        ans = max(ans,parent[i].second);
    }
    cout<<ans;
} 
  
int main(){
    int n,e;cin>>n>>e;


    int a,b,d;
    for (int i=0;i<e;i++){
        cin>>a>>b>>d;
        adjList[a].push_back(make_pair(b,d));
        adjList[b].push_back(make_pair(a,d));
    }
    int source = 1;
    primMST(n+1,source);

}
