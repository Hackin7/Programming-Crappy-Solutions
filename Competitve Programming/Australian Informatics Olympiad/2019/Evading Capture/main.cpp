#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int N, E, X, K;

int ans = 0;
vector<int> g[100005];
bool vis[100005];
void dfs(int x, int depth){
    cout<<x<<","<<depth<<endl;
    if (depth == K){
        cout<<"Escaped";
        if (vis[x]) return; //Already an Ending city
        else{
            cout<<"Done";
            vis[x] = true;
            ans++;
        }
        return;
    }else if (depth > K)return;
    
    for (int a=0; a<(int)g[x].size(); ++a){cout<<"_"<<g[x][a];}cout<<endl;
    for (int a=0; a<(int)g[x].size(); ++a){
        dfs(g[x][a], depth+1);
    }
}


int main(){
    memset(vis, false, sizeof(vis));
    ifstream infile; 
    infile.open("evadingin.txt"); 
    ofstream outfile;
    outfile.open("evadingout.txt");
    
    infile >> N >> E >> X >> K;
    for (int i=0; i<E; i++){
        int A, B;infile >> A >> B;
        g[A].push_back(B);
        g[B].push_back(A);
    }

    dfs(X, 0);
    
    cout<<endl<<ans;outfile<<ans;
    infile.close();
    outfile.close();
    return 0;
}
