#include <bits/stdc++.h>
using namespace std;

int w[501], v[501]; //size 500, 1-indexed
int maxvals[501]; //coin, bagSize

//0-1 Knapsack Copied from slides lol
int main() {
    ////Input///////////////////////////////////
    int n,m; cin>>n>>m;
    //int w[n],v[n]; //weight, value
    for (int i=1;i<=n;i++){
        cin>>w[i]>>v[i];
    }
    ////Dynamic Programming/////////////////////
    fill(maxvals, maxvals+n+1,0);
    for(int i=0;i<n;i++){ //Coins available
        for(int j=m-w[i];j>=0;j--){ //Bag sizes
            maxvals[j+w[i]] =
            max(maxvals[j+w[i]],maxvals[j]+v[i]);
            //Stick to current solution, or add coin value
        }
    }
    cout<<maxvals[m];
}
