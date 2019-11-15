#include <bits/stdc++.h>
using namespace std;

int INF = 1100000000;


int main(){
    //Input
    int n, e, Q; cin>>n>>e>>Q;
    
    long adjM[n][n];
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            adjM[i][j] = INF;//Null value
        }
        adjM[i][i] = 0;
    }
    for (int i=0;i<e;i++){
        int x,y, t; cin>>x>>y>>t;
        //Cost setting
        adjM[x][y] = t;
        adjM[y][x] = t;
    }
    
    //cout<<"h";
    
    
    //Floyd Warshall
    for (int k=0; k<n; k++){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                //cout<<adjM[i][k] + adjM[k][j]<<",";
                adjM[i][j] = min(adjM[i][j], adjM[i][k] + adjM[k][j]);
            }
        }        
    }
    
    /*
    cout<<endl<<endl;;
    //Output
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cout<<adjM[i][j]<<",";//Null value
        }
        cout<<endl;
    }
    */
    
    //cout<<Q<<endl;
    for (int i=0; i<Q; i++){
        int a, b; cin >>a>>b;
        if (adjM[a][b] == INF){cout<<-1;}
        else{cout<<adjM[a][b];}
        if (i!=Q-1){cout<<endl;}
    }
}
