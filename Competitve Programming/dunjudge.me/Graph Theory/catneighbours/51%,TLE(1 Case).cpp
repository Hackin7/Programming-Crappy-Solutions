#include <bits/stdc++.h>
using namespace std;

typedef int ll;
const ll V=1000;
int m[V][V]; //x, y

int dir[][2]={{1,0},{-1,0},{0,1},{0,-1}};
int main(){
    int H,W,N;cin>>H>>W>>N;
    for (ll i=0; i<H; i++){for (ll j=0; j<W; j++){cin>>m[j][i];}}

    set<int> neighbours[N];
    for (ll i=0; i<H; i++){for (ll j=0; j<W; j++){
        //cout<<i<<","<<j<<":  ";
        int curr=m[j][i];
        for(int k=0;k<4;k++){
            int nx=j+dir[k][0], ny=i+dir[k][1];
            if (0<=nx&&nx<=W-1&&0<=ny&&ny<=H-1){
                //cout<<k<<"["<<m[nx][ny]<<",";e
                if (m[nx][ny]!=curr)
                    neighbours[curr].insert(m[nx][ny]);
                //neighbours[m[nx][ny]].insert(curr);
            }
        }//cout<<endl;
    }}

    //cout<<endl;
    for(int i=0;i<N;i++){
        if(i!=0)cout<<"\n";
        cout<<neighbours[i].size();
        //cout<<":";for(auto j:neighbours[i]){cout<<j<<" ";}
    }
}
/*
3 3 5
1 3 4
2 0 1
3 1 2
*/
