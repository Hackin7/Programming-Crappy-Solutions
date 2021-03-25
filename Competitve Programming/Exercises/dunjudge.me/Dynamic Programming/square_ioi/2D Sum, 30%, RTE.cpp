#include"square.h"


#include <bits/stdc++.h>
using namespace std;

int sum[SIZE][SIZE]; //Array used by RSQ
int rsq(int x1, int y1, int x2, int y2) {
    return sum[x2][y2] - sum[x2][y1-1] - sum[x1-1][y2] + sum[x1-1][y1-1]; 
}

int findMaxSquare(int material[SIZE][SIZE], int materialSize)
{
    //Making it match the hole problem
    int n=materialSize;
    
    ////The solution to hole, just adding counting///////////
    //https://noiref.codecla.ws/dp/
    /* Pre-computation -> put in int main*/
    memset(sum, 0, sizeof(sum)); //Not required if no multiple testcases
    for(int i=1;i<=n;++i){
        for(int j=1;j<=n;++j){
            sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + material[i-1][j-1];
        }
    }
    //cout<<":";
    int nosq[n+1];nosq[0]=1;
    //Brute force combinaations
    int ans=0;
    for(int h=1;h<=n;h++){ //Sizes
        nosq[h]=0;
        //Brute Force coordinates
        for(int i=1;i<=n-h+1;++i){for(int j=1;j<=n-h+1;++j){
            if (rsq(i,j,i+h-1,j+h-1)==h*h){//if empty
                ans=h;
                nosq[h]++;
            }
        }}
    }
    
    return ans*nosq[ans];
}
