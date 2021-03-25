#include <bits/stdc++.h>
using namespace std;

int INF = 1100000000;

int main(){
    //Input
    int n; cin>>n;
    long adjM[n][n];
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cin >> adjM[i][j];//Null value
            //if (adjM[i][j] == 0)adjM[i][j] = INF;
        }
    }
    
    //Floyd Warshall
    for (int k=0; k<n; k++){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                //Largest acceptable height
                //cout<<adjM[i][k] + adjM[k][j]<<",";
                adjM[i][j] = max(adjM[i][j], min(adjM[i][k],adjM[k][j])); 
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
    //Check if have road
    int ans = INF;
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            if (adjM[i][j] < ans)ans = adjM[i][j];
        }
    }
    cout<<ans;
}
