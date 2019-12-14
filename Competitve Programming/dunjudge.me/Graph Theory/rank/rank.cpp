#include <bits/stdc++.h>
using namespace std;

int par[10001];
vector<int> adjlist[10001];

void roottree(int x, int p) { // x=current node, p=parent
    par[x] = p; // store parent
    for (int i : adj[x]) {
        if (i == p) continue;
        roottree(i, x); // only continue dfs for children
    }
}

int main(){
    int k,n; cin>>k>>n;

    fill(par,par+k,-1); //undefined

    for (int i=0;i<n;i++){
        int p1,p2,p3;char c1,c2;
        cin>>p1>>c1>>p2>>c2>>p3;
        if (c1==',' && c2=='>'){}
        else if (c1=='>' && c2==','){}
    }
}
