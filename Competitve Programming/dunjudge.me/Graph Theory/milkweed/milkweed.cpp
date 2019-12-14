#include <bits/stdc++.h>
using namespace std;

int visited[100][100]; // x,y
char m[100][100]; //x, y
int h=100, w=100, t = 0;
void mout(){
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}
        for (int j=0; j<w; j++){cout<<visited[j][i];}}
}
//int v(int x, int y){return y*h+x;}

bool cmp(int x1, int y1, int depth){
    bool condition=false;
    condition = visited[x1][y1]<=0 && m[x1][y1] == '.';;
    if (condition){visited[x1][y1] = depth;}
    return condition;
    
}

void bfs(int x1, int y1, int startDepth){
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
    int x,y;cin>>w>>h>>x>>y;
    for (int i=0; i<h; i++){for (int j=0; j<w; j++){cin>>m[j][i];visited[j][i] = 0;}}
    /*
    int matchx=-1,matchy=-1;
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}for (int j=0; j<w; j++){if (i==matchy&&j==matchx){cout<<"-";}else{cout<<m[j][i];}}}
    cout<<endl<<endl;
    */
    
    bfs(x-1,h-y,1);
    
    int maxval = 0;for (int i=0; i<w; i++){for (int j=0; j<w; j++){
        maxval = max(visited[i][j], maxval);
    }}
    /*
    for (int i=0; i<h; i++){for (int j=0; j<w; j++){
        if (cmp(j,i)){dfs(0);}
    }}*/
    cout<<maxval-1;
}
