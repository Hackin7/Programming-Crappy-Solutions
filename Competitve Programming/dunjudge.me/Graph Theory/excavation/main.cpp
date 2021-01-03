#include <bits/stdc++.h>
using namespace std;

#define NN 3000
//#define INT_MAX 2000000000
vector<pair<int ,int > > adjlist[NN];//(vertex,weight)

int V[NN]; int N,K;
int visited[NN];
int dp[NN]; //Stores number of item 0 needed to make item c in dp[c]
bool cycle=false;

int dfs(int curr, int cost, int val){
    if (visited[curr] || cost > K){return 0;}
    visited[curr] = 1;

    int newval = val + V[curr];
    dp[curr] = newval;

    for (auto next: adjlist[curr]){
        int newcost = cost + next.second;
        dp[curr] = max(dp[curr], dfs(next.first, newcost, newval));
    }

    return dp[curr];
}

int main(){
    cin>>N>>K;
    for(int i=0;i<N;i++){cin>>V[i];}

    memset(visited, 0, sizeof(visited));
    memset(dp, 0, sizeof(dp));

    bool subtask1 = true;
    bool subtask2 = true;
    int costFromZero[N]; //Cost to travel from 0 (for subtask 2)

    for (int i=0;i<N-1;i++){
        int a,b,E;cin>>a>>b>>E;
        adjlist[a].push_back(make_pair(b,E));
        adjlist[b].push_back(make_pair(a,E));

        if (E != 0){subtask1 = false;}

        if (a != 0 && b != 0){subtask2 = false;}
        int node = max(a, b);
        costFromZero[node] = E;

    }

    int ans;
    if (subtask1){
        // Since it is a tree (Everything is connected), just collect everything
        ans = accumulate(V, V+N, 0);
    }else{//} if (subtask2){
        //Everything is connected to node 0, so can travel to anywhere from node 0
        //Just go do regular DP
        /* Useful things to take note of
        1. It does not matter what order you consume the energy

        So just loop through how ever many times I guess?

        States:
        cost[i] = the cost left after traversing from the 0th to the ith node
        extracted[0] = the total diamonds extracted from the 0th to the ith node
        */

        int cost[N]; memset(cost, 0, sizeof(cost));
        int extracted[N]; memset(extracted, 0, sizeof(extracted));
        cost[0] = K; extracted[0] = V[0];

        for (int i=1; i<N;i++){
            // Extracted first, before any others
            cost[i] = K - costFromZero[i];
            if (cost[i] < 0){
                extracted[i] = V[0]; cost[i] = K;
            }else{
                extracted[i] = V[i] + V[0]; // Manage to extract
            }
            //cout<<i<<endl;

            // Extracted after others extracted
            //for (int j=0;j<i;j++){ // j is the previous node extracted from
            int j = i-1;
            if (j>=0){
                int ifExtractCost = cost[j] - costFromZero[i]; //new cost at current node
                int ifExtractValue = -1;
                if (ifExtractCost >= 0){
                    ifExtractValue = extracted[j] + V[i];
                }
                //cout<<"  "<<j<<","<<ifExtractCost<<","<<ifExtractValue<<endl;

                if (ifExtractValue > extracted[i]){ //More gain
                    extracted[i] = ifExtractValue;
                    cost[i] = ifExtractCost;
                }else if (extracted[j] > extracted[i]){//If less value to extract then don't extract, follow prev
                    extracted[i] = extracted[j];
                    cost[i] = cost[j];
                }
            }

        }
        //Debugging
        /*
        cout<<endl;
        for (int i=0;i<N;i++){
            cout<< cost[i] <<" "<< extracted[i] <<endl;
        }
        */
        ans = extracted[N-1];
    }
    cout<<ans;
}

/* Subtask 1 test
4 3
3 6 7 9
0 1 0
0 2 0
0 3 0

Subtask 2 test
4 3
3 6 7 9
0 1 2
0 2 1
0 3 3

Answer should be 16
*/

