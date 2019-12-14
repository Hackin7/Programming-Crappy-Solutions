#include <bits/stdc++.h>
using namespace std;


//from fireandbeary 100%

int visited[2000000]; // x,y
bool counted[2000000];
char m[2000000]; // Represents the map
int h=2000, w=2000;
int val(int x, int y){return y*h+x;}

void mout(){
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}
        for (int j=0; j<w; j++){cout<<visited[val(j,i)];}}
    cout<<endl<<endl;
}
void markout(int matchx, int matchy){
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}for (int j=0; j<w; j++){if (i==matchy&&j==matchx){cout<<"-";}else{cout<<m[val(j,i)];}}}
    cout<<endl<<endl;
}

bool beary = false; //Is beary traversing
int ans = 0;
long long k = 0;
bool cmp(int x1, int y1, int depth){
    bool condition = visited[val(x1,y1)]<=0 && m[val(x1,y1)] == '.';
    if (condition){visited[val(x1,y1)] = depth;
        if (visited[val(x1,y1)] <= (int)k && !counted[val(x1,y1)]){
            ans++;counted[val(x1,y1)] = true;
        }
    }
    return condition;
    
}

void bfs(int x1, int y1){
    deque<tuple<int,int,int> > stuff;

    stuff.push_back(make_tuple(x1,y1,0));
    cmp(x1,y1,0);//Set visited
    
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
    vector<pair<int,int> > pc;//Ponds coordinates
    cin>>h>>w>>k;//m,n,k
    for (int i=0; i<h; i++){for (int j=0; j<w; j++){
        cin>>m[val(j,i)];
        if (m[val(j,i)]=='*'){pc.push_back(make_pair(j,i));}
    }}
    
    memset(visited, 0,sizeof(visited));
    memset(counted, false,sizeof(counted));

    ////BFS from ponds///////////////////////////////////
    for (pair<int,int> c :pc){
        int x = c.first,y=c.second;
        //markout(x,y);
        bfs(x,y);
        //mout();
        //memset(visited, 0,sizeof(visited));
    }
    cout<<ans;
}
