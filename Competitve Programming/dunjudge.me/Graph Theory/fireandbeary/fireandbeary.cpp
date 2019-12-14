#include <bits/stdc++.h>
using namespace std;

//Done in 40 min
int visited[2000][2000]; // x,y
int bVisited[2000][2000];
char m[2000][2000]; //x, y, Represents the map
int h=2000, w=2000, t = 0;

void mout(){
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}
        for (int j=0; j<w; j++){cout<<visited[j][i];}}
}

void mout2(){
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}
        for (int j=0; j<w; j++){cout<<bVisited[j][i];}}
}
//int v(int x, int y){return y*h+x;}
bool beary = false; //Is beary traversing
int ans = INT_MAX;
bool cmp(int x1, int y1, int depth){
    bool condition=false;
    if (beary){
        condition = (bVisited[x1][y1]<=0) && 
        (m[x1][y1] == '.' || m[x1][y1] == 'B');
        if (condition){
            bVisited[x1][y1] = depth;
            if (x1 == 0 || x1 == w-1 || y1 == 0 || y1 == h-1){
                if (bVisited[x1][y1]*2 < visited[x1][y1]){
                    ans = min(ans, bVisited[x1][y1]*2);
                }
            }
        }
    }
    else{
        condition = visited[x1][y1]<=0;
        if (condition){visited[x1][y1] = depth;}
    }
    return condition;
    
}

void bfs(int x1, int y1){
    deque<tuple<int,int,int> > stuff;

    stuff.push_back(make_tuple(x1,y1,1));
    cmp(x1,y1,1);//Set visited
    
    while (!stuff.empty()){
        tuple<int,int,int> square = stuff.front();
        int x = get<0>(square), y = get<1>(square), depth = get<2>(square);
        stuff.pop_front();
        //cout<<x<<","<<y<<" "<<depth<<endl;
        
        //mout();cout<<endl<<depth<<endl;
        if (x-1 >= 0 && cmp(x-1,y,depth+1) ){stuff.push_back(make_tuple(x-1,y, depth+1));}
        if (x+1 < w && cmp(x+1,y,depth+1) ){stuff.push_back(make_tuple(x+1,y, depth+1));}
        if (y-1 >= 0 && cmp(x,y-1,depth+1) ){stuff.push_back(make_tuple(x,y-1, depth+1));}
        if (y+1 < h && cmp(x,y+1,depth+1)){stuff.push_back(make_tuple(x,y+1, depth+1));}

        //Diagonals
        /*
        if (x-1 >= 0 && y-1 >= 0 && cmp(x-1,y-1) ){dfs(x-1,y-1, depth+1);}
        if (x-1 >= 0 && y+1 < h  && cmp(x-1,y+1) ){dfs(x-1,y+1, depth+1);}
        if (x+1 < w  && y-1 >= 0 && cmp(x+1,y-1) ){dfs(x+1,y-1, depth+1);}
        if (x+1 < w  && y+1 < h  && cmp(x+1,y+1) ){dfs(x+1,y+1, depth+1);}
        */

    }
}

int main(){
    int fx=0,fy=0,bx=0,by=0;
    
    cin>>h>>w;//r,c
    for (int i=0; i<h; i++){for (int j=0; j<w; j++){
        cin>>m[j][i];visited[j][i] = 0;bVisited[j][i]=0;
        if (m[j][i]=='F'){fx=j,fy=i;}
        else if (m[j][i]=='B'){bx=j,by=i;}
    }}
    /*
    int matchx=-1,matchy=-1;
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}for (int j=0; j<w; j++){if (i==matchy&&j==matchx){cout<<"-";}else{cout<<m[j][i];}}}
    cout<<endl<<endl;
    */
    
    ////BFS of Fire///////////////////////////////////
    beary = false; //Is beary traversing?
    bfs(fx,fy);
    //mout();cout<<endl<<endl;
    ////BFS of Beary//////////////////////////////////
    beary = true;
    bfs(bx,by);
    //mout2();
    
    if (ans == INT_MAX){cout<<-1;}
    else{cout<<ans;}
}
