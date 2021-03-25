#include <bits/stdc++.h>
using namespace std;

//45.45% TLE
bool visited[1000][1000]; // x,y
int depths[1000][1000]; // x,y
int h=1000, w=1000;
void mout(){
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}
        for (int j=0; j<w; j++){cout<<depths[j][i];}}
}
//int v(int x, int y){return y*h+x;}

bool cmp(int x1, int y1, int depth){
    bool condition=false;
    condition = visited[x1][y1]<=0;
    if (condition){
        visited[x1][y1] = true;
        if (depths[x1][y1]==0){depths[x1][y1]=depth;}
        else{depths[x1][y1]=min(depths[x1][y1],depth);}
    }
    return condition;
    
}

void bfs(int x1, int y1, int startDepth){
    memset(visited, 0,sizeof(visited));
    deque<tuple<int,int,int> > stuff;

    stuff.push_back(make_tuple(x1,y1,startDepth));
    cmp(x1,y1,startDepth);//Set visited
    
    while (!stuff.empty()){
        tuple<int,int,int> square = stuff.front();
        int x = get<0>(square), y = get<1>(square), depth = get<2>(square);
        int newdepth = depth+1;
        stuff.pop_front();
        //cout<<x<<","<<y<<" "<<depth<<endl;
        
        //mout();cout<<endl<<depth<<endl;
        if (x-1 >= 0 && cmp(x-1,y,newdepth) ){stuff.push_back(make_tuple(x-1,y, newdepth));}
        if (x+1 < w && cmp(x+1,y,newdepth) ){stuff.push_back(make_tuple(x+1,y, newdepth));}
        if (y-1 >= 0 && cmp(x,y-1,newdepth) ){stuff.push_back(make_tuple(x,y-1, newdepth));}
        if (y+1 < h && cmp(x,y+1,newdepth)){stuff.push_back(make_tuple(x,y+1, newdepth));}

        //Diagonals
        if (x-1 >= 0 && y-1 >= 0 && cmp(x-1,y-1,newdepth) ){stuff.push_back(make_tuple(x-1,y-1, newdepth));}
        if (x-1 >= 0 && y+1 < h  && cmp(x-1,y+1,newdepth) ){stuff.push_back(make_tuple(x-1,y+1, newdepth));}
        if (x+1 < w  && y-1 >= 0 && cmp(x+1,y-1,newdepth) ){stuff.push_back(make_tuple(x+1,y-1, newdepth));}
        if (x+1 < w  && y+1 < h  && cmp(x+1,y+1,newdepth) ){stuff.push_back(make_tuple(x+1,y+1, newdepth));}

    }
}
int main(){
    int m,n,s;cin>>m>>n>>s;
    h=m,w=n;
    
    memset(depths, 0,sizeof(depths));
    for(int i=0;i<s;i++){
        int x,y;cin>>x>>y;
        bfs(x-1,y-1,1);
    }
    //mout();
    int maxval = 0;for (int i=0; i<w; i++){for (int j=0; j<w; j++){
        if (depths[i][j] != INT_MAX){
            maxval = max(depths[i][j], maxval);
        }
    }}
    cout<<maxval;
}
