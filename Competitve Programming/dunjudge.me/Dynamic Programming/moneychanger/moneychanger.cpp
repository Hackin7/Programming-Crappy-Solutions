#include <bits/stdc++.h>
using namespace std;
int main(){
    int N,V; cin >> N>>V;
    //1-indexed
    int coins[N+1];for (int i=1;i<=N;i++){cin>>coins[i];} //Value of coins
    int minno[V+1]; //indexed by value

    minno[0] = 0; //Nothing to make nothing
    fill(minno+1, minno+V+1, INT_MAX);//Undefined

    for (int i = 1; i <= N; ++i){ //Order of loops doesn't matter
        for (int v = 1; v <= V; ++v){
            //Make sure doesn't exceed INT_MAX
            if (v >= coins[i] && minno[v-coins[i]] != INT_MAX){
                //Need take note of min max comparison
                minno[v] = min(minno[v-coins[i]] + 1, minno[v]);
            }
        }
    }

    if (minno[V] == INT_MAX){cout<<-1;}
    else {cout<<minno[V];}
}
