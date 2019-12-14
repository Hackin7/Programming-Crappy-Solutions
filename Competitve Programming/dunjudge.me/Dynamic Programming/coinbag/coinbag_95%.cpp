#include <bits/stdc++.h>
using namespace std;

int w[501], v[501]; //size 500, 1-indexed
int maxvals[501][501]; //coin, bagSize

//0-1 Knapsack 95%
int main() {
    ////Input///////////////////////////////////
    int n,m; cin>>n>>m;
    //int w[n],v[n]; //weight, value
    for (int i=1;i<=n;i++){
        cin>>w[i]>>v[i];
    }
    ////Dynamic Programming/////////////////////
    for (int c=0;c<=n;c++){maxvals[c][0] = 0;}//No weight
    for (int s=0;s<=m;s++){maxvals[0][s] = 0;}//No coins

    for (int i=1;i<=n;i++){//coins
        for (int j=1;j<=m;j++){//weight
            int condC = (j-w[i] >= 0)?maxvals[i-1][j-w[i]]+v[i]:0;
            maxvals[i][j] = max(maxvals[i-1][j], //Don't add coin
                                condC); //Add coin
        }
    }
    cout<<maxvals[n][m];
}
