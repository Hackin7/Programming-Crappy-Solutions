#include <bits/stdc++.h>
using namespace std;

int moves[8][2]={{1,2},{1,-2},{2,1},{2,-1},{-1,2},{-1,-2},{-2,1},{-2,-1}};
int main() {
    int N,ik,jk,ip,jp,T;
    cin>>N>>ik>>jk>>ip>>jp>>T;
    int board[N+1][N+1];memset(board,0,sizeof(board));
    for(int i=0;i<T;i++){
        int x,y;cin>>x>>y;
        board[x][y]=1;
    }

    //BFS
    bool visited[N+1][N+1];memset(visited,0,sizeof(visited));
    //int dist[N+1][N+1];memset(dist,0,sizeof(dist));
    deque<tuple<int,int,int> > nodes;
    nodes.push_back(make_tuple(ik,jk,0));
    while (!nodes.empty()){
        auto curr=nodes.front();
        nodes.pop_front();
        int x=get<0>(curr);
        int y=get<1>(curr);
        int d=get<2>(curr);
        //dist[x][y]=min(dist[x][y],d);
        if (x==ip&&y==jp){cout<<d;return 0;}
        visited[x][y]=true;
        for(int i=0;i<8;i++){
            int xa=x+moves[i][0],ya=y+moves[i][1];
            if (1<=xa&&xa<=N&&1<=ya&&ya<=N &&
                board[xa][ya]==0&&visited[xa][ya]==false){
            nodes.push_back(make_tuple(xa,ya,d+1));
            }
        }
    }
    cout<<-1;
    return 0;
}
