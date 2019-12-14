#include <bits/stdc++.h>
using namespace std;

int INF = 1000000000;

int adjM[100000000];
int val(int x,int y){
    return y*10000+x;
}

int main(){
    //Input
    int n, e; cin>>n>>e;
    n++;
    //long adjM[10000][10000];
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            adjM[val(i,j)] = INF;//Null value
        }
        //adjM[i][i] = 0;
    }
    for (int i=0;i<e;i++){
        int x,y, t; cin>>x>>y>>t;
        //Cost setting
        adjM[val(x,y)] = t;
        adjM[val(y,x)] = t;
    }
    //Floyd Warshall
    for (int k=0; k<n; k++){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                adjM[val(i,j)] = min(adjM[val(i,j)], adjM[val(i,k)] + adjM[val(k,j)]);
            }
        }
    }
    for (int i=2; i<n; i++){
        cout<<adjM[val(1,i)];
        if (i!=n-1){cout<<" ";}
    }
}
