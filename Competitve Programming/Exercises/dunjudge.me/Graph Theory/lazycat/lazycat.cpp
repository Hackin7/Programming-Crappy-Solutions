#include <bits/stdc++.h>
using namespace std;

typedef tuple <int ,int ,int > ti ;
int dx[] = {-1,0,0,1};
int dy[] = {0,-1,1,0};

int main(){
    int N; cin>>N;char grid[N][N],index[N][N];//Index of checkpoints
    int sx,sy,ex,ey;int cnt=0;//Number of checkpoints
    for (int j=0;j<N;j++){for(int i=0;i<N;i++){
        cin>>grid[i][j];
        //cout<<i<<','<<j<<":"<<grid[i][j]<<endl;
        if (grid[i][j]=='S'){sx=i,sy=j;}
        if (grid[i][j]=='B'){ex=i,ey=j;}
        if (grid[i][j]=='F'){cnt++;index[i][j]=cnt-1;}
        else{index[i][j]=0;}
    }}
    
    int dist[N][N][1<<cnt];
    //cout<<(int)(1<<cnt);//Bitmask
    //eg. 0000, 1010, each bit represents checkpoint collected
    for (int i=0;i<N;i++){for (int j=0;j<N;j++){for (int k=0;k<1<<cnt ;k++){
        dist[i][j][k] = -1; 
    }}}
    
    ///BFS//////////////////////////////////////////////////
    dist[sx][sy][0] = 0;
    queue<ti> q;
    for (q.push(make_tuple(sx,sy,0));q.size ();q.pop () ) {
        ti t = q.front() ;
        int x = get <0>(t) , y = get <1 >( t ) , bs = get <2>(t) ;
        //cout<<x<<','<<y<<endl;
        ////End Condition////////////////////////////////
        if (x == ex && y == ey) {
            //All checkpoints reached
            if (bs ==(1<<cnt)-1) {
                cout<<dist[x][y][bs]<<"\n";
                return 0;
            }
        }   
        ////Add Nodes////////////////////////////////////
        for (int i=0;i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            int nbs ;
            //Out of bounds
            if ( nx < 0 || nx >= N ) continue ;
            if ( ny < 0 || ny >= N ) continue ;
            if ( grid [nx][ny] == 'X') continue ;
            
            //Checkpoints
            if ( grid [nx][ny] == 'F') {nbs = ( bs | (1<<index[nx][ny]));}
            else{nbs = bs;}
            
            //cout<<":"<<nx<<","<<ny<<"["<<bs<<"]"<<endl;
            if (dist[nx][ny][nbs] != -1) continue ;
            dist [nx][ny][nbs] = dist [x][y][bs] + 1;
            q.push(make_tuple(nx,ny,nbs)) ;
        }
    }
    cout<<"-1\n";

}

