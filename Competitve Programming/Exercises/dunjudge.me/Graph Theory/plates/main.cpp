#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef pair<int, int> pi;
typedef tuple<int,int,int> group;


int dx[] = {0, 0, 1, -1, 1, 1, -1, -1};
int dy[] = {1, -1, 0, 0, 1, -1, 1, -1};

//https://dunjudge.me/analysis/submissions/722587/

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int H,W;cin>>H>>W;char grid[W+1][H+1];
    for(int j=1;j<=H;j++){for(int i=1;i<=W;i++){cin>>grid[i][j];}}
    
    int sx=1,sy=1;
    //BFS https://noiref.codecla.ws/graph/
    int dist[W+1][H+1][5];memset(dist, -1, sizeof(dist));
    dist[sx][sy][2] = 0;
    queue<group> q;q.push(make_tuple(sx, sy,2));
    while (!q.empty()) {
        group cur = q.front();
        q.pop();
        int x,y,d; tie(x,y,d)=cur;
        if(x==W&&y==H)break;
        //cout<<x<<','<<y<<endl;
        for (int i = 0; i < 4; ++i) { //Change '4' to 8 for 8 directions
            int nx = x + dx[i], ny = y + dy[i];
            if (nx <= 0 || ny <= 0) continue;
            if (nx > W || ny > H) continue;
            if (dist[nx][ny][i] != -1) continue;
            //if (grid[nx][ny] == '#') continue; //Check other conditions here
                        
            //Continuing in same direction
            if (d==i){    
                dist[nx][ny][i] = dist[x][y][d]; //Same cost
                q.push(make_tuple(nx,ny,i));
            }
            //Changing Direction
            if(grid[x][y]=='#' && i!=d){ 
                dist[nx][ny][i] = dist[x][y][d]+1; //Add Cost
                q.push(make_tuple(nx,ny,i));
            }
        }
        /*
        for(int dd=0;dd<1;dd++){
        for(int i=1;i<=H;i++){for(int j=1;j<=W;j++){cout<<
            (dist[j][i][dd])<<" ";}cout<<endl;}cout<<dd<<"]"<<endl;
        }
        */
    }
    
    int ans=INT_MAX;
    for(int i=0;i<4;i++){
        if (dist[W][H][i]!=-1)
            ans=min(ans,dist[W][H][i]);
        //cout<<dist[W][H][i]<<" ";
    }cout<<(ans==INT_MAX?-1:ans);
    return 0;
}
/*
4 3
##.
...
.#.
.#.
*/
