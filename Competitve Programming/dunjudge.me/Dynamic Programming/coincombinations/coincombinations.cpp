#include <bits/stdc++.h>
using namespace std;

/*
Solution:
ways(i,v) the number of ways to form v with coins C1....Ci
ways(i,0) = 1, ways(0,v) = 0
ways (i,v) = { if (v<Ci): ways(i-1,v) + 0 //Dont use coin
             { else: ways(i-1,v) + ways(i,v-Ci)
*/

//Copied from notes lol, 70%
int main(){
    int N,V; cin >> N>>V;
    int coins[N+1];for (int i=1;i<=N;i++){cin>>coins[i];}
    int ways[V+1]; //indexed by value
    ways[0] = 1; //One way to make nothing
    fill(ways+1, ways+V+1, 0);
    for (int i = 1; i <= N; ++i)// note order of loops!
        for (int v = 1; v <= V; ++v)
            if (v >= coins[i])
                ways[v] += ways[v - coins[i]];

    cout<<ways[V]%13371337;
}
