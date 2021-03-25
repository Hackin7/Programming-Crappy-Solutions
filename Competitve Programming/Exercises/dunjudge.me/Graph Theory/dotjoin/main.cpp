#include <bits/stdc++.h>
using namespace std;

typedef tuple<double,int,int> tdii;
//I still don't get the question
#define V 1000000
//UFDS
int parent[V];
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

//Potential error: x or y <=1000000
double pydist(int x1, int y1, int x2, int y2){return pow(pow(x1-x2,2)+pow(y1-y2,2),0.5);}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    //Generate Graph on runtime
    int N;cin>>N;
    int X[N],Y[N];vector<tdii> edges;
    for(int i=0;i<N;i++){
        cin>>X[i]>>Y[i];
        for(int j=0;j<i;j++){
            edges.push_back(make_tuple(
                pydist(X[i],Y[i],X[j],Y[j]),
                i,j));
        }
    }
    
    int visited[N];memset(visited,0,sizeof(visited));
    memset(parent,-1,sizeof(parent));
    sort(edges.begin(),edges.end());
    double total_weight = 0;
    for (auto e : edges) {
        double weight;int a,b;tie (weight,a,b) = e ;//Tuple Unpacking
        if (root(a) == root(b)) // taking this edge wiint cause a cycle
            continue;
        total_weight += weight ; // take this edge
        visited[a]++;visited[b]++;
        connect(a,b); // connect them in the UFDS
    }
    for(int i=0;i<N;i++){cout<<visited[i]<<" ";}cout<<endl;
    //cout<<total_weight<<endl;
    cout<<*(max_element(visited,visited+N));
    return 0;
}
/*4
0 0
0 2
2 0
1 1
*/
