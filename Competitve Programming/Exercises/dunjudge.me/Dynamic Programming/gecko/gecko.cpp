#include <bits/stdc++.h>
using namespace std;

int m[500][500];//x,y
int h,w;
int memo[500][500];
int f(int x, int y){
    //cout<<"f("<<x<<","<<y<<")"<<"->"<<memo[x][y]<<endl;
    if (memo[x][y] == -1){
        //Base Case
        if (y==0){memo[x][y] = m[x][y];}
        //Recursive case
        else{
            int ans = f(x,y-1);
            if (x-1>=0){ans=max(ans,f(x-1,y-1));}
            if (x+1<h){ans=max(ans,f(x+1,y-1));}
            memo[x][y] = ans+m[x][y];
        }
    }
    return memo[x][y];
}

int main(){
    cin>>h>>w;
    //int m[w][h];//x,y
    for (int j=0;j<h;j++){for(int i=0;i<w;i++){
        cin>>m[i][j];memo[i][j]=-1;//undefined
    }}
    int ans = f(0,h-1);
    for (int i=1;i<w;i++){
        ans = max(ans,f(i,h-1));
    }
    cout<<ans;
    return 0;
}
