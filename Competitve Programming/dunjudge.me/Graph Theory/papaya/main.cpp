#include <bits/stdc++.h>
using namespace std;

//100%
int dirs[][2] = {{0,1},{0,-1},{1,0},{-1,0}};
int main() {
    int R,C;cin>>R>>C;
    int F[R][C];for(int j=0;j<R;j++){for(int i=0;i<C;i++){cin>>F[j][i];}}

    //BFS
    bool visited[R][C]; memset(visited,false,sizeof(visited));
    deque<tuple<int,int,int> > stuff;
    stuff.push_back(make_tuple(0,0,F[0][0]));
    while (!stuff.empty()){
        tuple<int,int,int> square = stuff.front();
        int x = get<0>(square), y = get<1>(square), val = get<2>(square);
        stuff.pop_front();
        //cout<<x<<","<<y<<" "<<val<<endl;
        if (visited[y][x]){continue;}
        visited[y][x]=true;
        if (x==C-1 && y==R-1){cout<<val;break;}

        int dir = 0, maxVal=0;
        for (int i=0;i<4;i++){
            int nx = x+dirs[i][0],ny=y+dirs[i][1];
            if (0<=nx&&nx<=C-1 && 0<=ny&&ny<=R-1 &&
                F[ny][nx] > maxVal && !visited[ny][nx]){
                maxVal=F[ny][nx];dir=i;
            }
        }
        stuff.push_back(make_tuple(x+dirs[dir][0],y+dirs[dir][1], val+maxVal));
    }
}
