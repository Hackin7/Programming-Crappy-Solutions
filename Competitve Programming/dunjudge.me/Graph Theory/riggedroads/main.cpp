#include <bits/stdc++.h>
using namespace std;

#define V 1000010

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

int priority[V];
bool cmp(tuple<int,int,int> a,tuple<int,int,int> b){
    return priority[get<2>(a)]>priority[get<2>(b)];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N, E, A, B;
    cin >> N >> E;

    memset(parent,-1,sizeof(parent));
    vector <tuple<int,int,int> > edges ; // weight,node A,node B
    for (int i=0;i<E;i++) {
        cin >> A >> B;//connections
        edges.push_back(make_tuple(A,B,i));//order
    }
    
    int R;for(int i=0;i<N-1;i++){
        cin>>R;priority[R-1]=1;
    }
    sort(edges.begin(),edges.end(),cmp);
    int matchup[E];
    int i=0;for(auto e:edges){
        //cout<<get<2>(e)<<endl;
        i++;matchup[get<2>(e)]=i;
    }
    for(int i=0;i<E;i++){
        if (i!=0){cout<<" ";}
        cout<<matchup[i];
    }
    
    /*
    //Kruskal
    sort(edges.begin(),edges.end()); //Sort by ascending weights
    for (auto e : edges) {
        int weight,a,b;tie (weight,a,b) = e ;//Tuple Unpacking
        if (root(a) == root(b)) // taking this edge wiint cause a cycle
            continue;
        //cout<<weight<<":"<<a<<" "<<b<<endl;
        // take this edge
        adjlist[a].push_back(make_pair(weight,b));
        adjlist[b].push_back(make_pair(weight,a));
        connect(a,b); // connect them in the UFDS
    }
    dfs(N,1,0);
    cout<<ans;*/
    return 0;
}
