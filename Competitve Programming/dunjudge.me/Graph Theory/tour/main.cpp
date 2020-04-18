#include <bits/stdc++.h>
#include <fstream>
using namespace std;


typedef pair<int, int> pi;


int dx[] = {0, 0, 1, -1, 1, 1, -1, -1};
int dy[] = {1, -1, 0, 0, 1, -1, 1, -1};

queue<pi> q;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int R,C;cin>>R>>C;
    char grid[C+1][R+1]; int sx,sy;
    for(int j=0;j<R;j++){
        for(int i=0;i<C;i++){
            cin>>grid[i][j];
            if(grid[i][j]=='C'){sx=i;sy=j;}
        }
    }
    
    int dist[C+1][R+1];
    memset(dist, INT_MIN, sizeof(dist));
    dist[sx][sy] = 0;
    q.push(make_pair(sx, sy));
    while (!q.empty()) {
        pi cur = q.front();
        q.pop();
        int x = cur.first, y = cur.second;
        cout<<x<<","<<y<<endl;
        for (int i = 0; i < 4; ++i) { //Change '4' to 8 for 8 directions
            int nx = x + dx[i], ny = y + dy[i];
            if (nx < 0 || ny < 0) continue;
            if (nx >= C || ny >= R) continue;
            if (dist[nx][ny] != INT_MIN) continue;
            if (grid[nx][ny] == '~') continue; //Check other conditions here
            
            int diff = (int)grid[nx][ny]-48, gain=0;
            if (diff>0){gain=diff;}
            dist[nx][ny] = max(dist[nx][ny],dist[x][y]-2+gain); 
            q.push(make_pair(nx, ny));
        }
    }
    int ans=INT_MIN;
    for(int j=1;j<=R;j++){
        for(int i=1;i<=C;i++){
            cout<<dist[i][j]<<" ";
            ans=max(ans,dist[i][j]);
    }cout<<endl;}
    cout<<ans;
    return 0;
}
/*
3 5
~.~.~
6.~5.
~..C~
*/
