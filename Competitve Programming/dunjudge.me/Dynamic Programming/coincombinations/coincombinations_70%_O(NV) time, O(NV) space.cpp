#include <bits/stdc++.h>
using namespace std;

/*
Solution:
ways(i,v) the number of ways to form v with coins C1....Ci
ways(i,0) = 1, ways(0,v) = 0
ways (i,v) = { if (v<Ci): ways(i-1,v) + 0 //Dont use coin
             { else: ways(i-1,v) + ways(i,v-Ci)
*/

//Space O(NV) solution, 70%,
int main(){
    int n,v; cin >> n>>v;
    int coinval[n];for (int i=0;i<n;i++){cin>>coinval[i];}
    int ways[n+1][v+1]; //indexed by value, 1 indexed
    for (int i=0;i<=n;i++){ways[i][0] = 1;}
    for (int j=0;j<=v;j++){ways[0][j] = 0;}

    for (int i=1;i<=n;i++){ //Number of coins
        for (int j=1;j<=v;j++){ //value of coins
            ////Transition///////////////////////////////
            if (j<coinval[i-1]){ // Don't use coin
                    ways[i][j] = ways[i-1][j] + 0;
            }
            else{ // Use coin
                    ways[i][j] = ways[i-1][j] + ways[i][j-coinval[i-1]];
            }
            //cout<<"Transition"<<i<<","<<j<<":"<<ways[i][j]<<endl;
        }
    }
    cout<<ways[n][v]%13371337;
}
