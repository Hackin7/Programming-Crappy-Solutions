#include <bits/stdc++.h>
using namespace std;
typedef pair<int,int> ipair;
typedef tuple<int,int,int,int> group;
/*dijkstra*/
int main(){
    int n;cin>>n;char m[n][n];
    int sx,sy,ex,ey;
    for(int j=0;j<n;j++){for(int i=0;i<n;i++){
        cin>>m[i][j];
        if(m[i][j]=='S'){sx=i;sy=j;}
        if(m[i][j]=='F'){ex=i;ey=j;}
    }}
    
    priority_queue<group,vector<group>,greater<group> > pq; // distance, node
    int dist[n][n][7];//Previous direction
    memset(dist, -1, sizeof(dist));
    pq.push(make_tuple(0, sx,sy,6)); 
    for(int i=0;i<7;i++){dist[sx][sy][i] = 0;}
    
    int dirx[]={1,1,1,-1,-1,-1,0};
    int diry[]={1,0,-1,-1,0,1,0};
    int dircost[]={15,9,10,10,9,15,0};
    
    while(!pq.empty()){
        group g = pq.top(); pq.pop();
        int x,y,c,d;tie (c,x,y,d)=g; //d for prev dir
        
        if(c != dist[x][y][d]) continue;
        vector<int> directions;
        switch(d){
            case 0:
                directions.push_back(5);
                directions.push_back(0);       
                directions.push_back(1);
                break;
            case 1:
                directions.push_back(0);       
                directions.push_back(1);          
                directions.push_back(2);                
                break;
            case 2:
                directions.push_back(1);                
                directions.push_back(2);                
                break;
            case 3:
                directions.push_back(3);
                directions.push_back(4);
                break;
            case 4:
                directions.push_back(5);
                directions.push_back(4);
                directions.push_back(3);
                break;
            case 5:
                directions.push_back(4);
                directions.push_back(5); 
                directions.push_back(0);
                break;
            case 6:
                for(int i=0;i<6;i++){
                    directions.push_back(i);
                }
        }
        for(auto i:directions){
            //cout<<i<<endl;
            int nx=x+dirx[i];
            int ny=y+diry[i];
            int nc=c+dircost[i];
            
            if (dirx[i]==-dirx[d] && diry[i]==diry[d] && diry[i]==1){nc+=12;}//tacking
            
            
            if (0<=nx&&nx<n && 0<=ny&&ny<n &&
                m[nx][ny]!='X' && 
                (dist[nx][ny][i]>nc || dist[nx][ny][i]==-1)){
                dist[nx][ny][i]=nc;
                pq.push(make_tuple(dist[nx][ny][i],nx,ny,i));
            }
            
        }
    }
    int ans=INT_MAX;
    for(int i=0;i<6;i++){
        //cout<<dist[ex][ey][i]<<endl;
        if (dist[ex][ey][i]!=-1){ans=min(dist[ex][ey][i],ans);}
    }
    cout<<(ans==INT_MAX?-1:ans);
}

/*
9
WWWWSWXWW
WWWWWWWWW
WWWWWWWWW
WWWWWWXWW
WWWWWWWWW
WWWWWWWWW
FWWWWWWWW
WWWWWWWWW
WWWWWWWWW
*/
