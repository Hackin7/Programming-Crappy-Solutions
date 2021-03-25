#include <bits/stdc++.h>
using namespace std;

/*
Solution:
ways(i,v) the number of ways to form v with coins C1....Ci
ways(i,0) = 1, ways(0,v) = 0
ways (i,v) = { if (v<Ci): ways(i-1,v) + 0 //Dont use coin
             { else: ways(i-1,v) + ways(i,v-Ci)
*/

//O(NV) solution, 70%
int main(){
    int n,v; cin >> n>>v;
    int coinval[n];for (int i=0;i<n;i++){cin>>coinval[i];}
    int ways[v+1]; //indexed by value
    ways[0] = 1; //One way to make nothing
    fill(ways+1, ways+v+1,0);//No way to make nothing

    for (int i=1;i<=n;i++){ //value of coins
        for (int j=1;j<=v;j++){ //Number of coins
            ////Transition///////////////////////////////
            if (j<coinval[i-1]){ // Don't use coin
                    ways[j] = ways[j] + 0;
            }
            else{ // Use coin
                    ways[j] = ways[j] + ways[j-coinval[i-1]];
            }
            //cout<<"Transition"<<i<<","<<j<<":"<<ways[j]<<endl;
        }
    }
    cout<<ways[v]%13371337;
}
