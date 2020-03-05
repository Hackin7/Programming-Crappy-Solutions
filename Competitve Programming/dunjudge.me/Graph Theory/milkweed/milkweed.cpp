#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll V=101;
ll visited[V][V]; // x,y
char m[V][V]; //x, y
ll h=100, w=100, t = 0;
void mout(){
    for (ll i=0; i<h; i++){
        if (i>0){cout<<endl;}
        for (ll j=0; j<w; j++){cout<<visited[j][i];}
    }
}

bool cmp(ll x1, ll y1, ll depth){
    bool condition=false;
    bool inrange = 0<=x1 && x1<w && 0<=y1&&y1<h;
    condition = inrange && 
                visited[x1][y1]<=0 && 
                m[x1][y1] == '.';
    if (condition){visited[x1][y1] = depth;}
    return condition;
    
}

void bfs(ll x1, ll y1, ll startDepth){
    deque<tuple<ll,ll,ll> > stuff;

    stuff.push_back(make_tuple(x1,y1,startDepth));
    cmp(x1,y1,startDepth);//Set visited
    
    while (!stuff.empty()){
        tuple<ll,ll,ll> square = stuff.front();
        ll x = get<0>(square), y = get<1>(square), depth = get<2>(square);
        ll newdepth = depth+1;
        stuff.pop_front();
        
        int directions[][2]={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        //cout<<endl<<x<<","<<y<<" "<<depth<<endl;
        //mout();cout<<endl;
        for(int i=0;i<8;i++){
            int dx=directions[i][0], dy=directions[i][1];
            if (cmp(x+dx,y+dy,newdepth)){
                stuff.push_back(make_tuple(x+dx,y+dy,newdepth));
            }
        }
    }
}
int main(){
    ll x,y;cin>>w>>h>>x>>y;
    for (ll i=0; i<h; i++){for (ll j=0; j<w; j++){cin>>m[j][i];visited[j][i] = 0;}}
    
    bfs(x-1,h-y,1);
    
    ll maxval = 0;for (ll i=0; i<w; i++){for (ll j=0; j<w; j++){
        maxval = max(visited[i][j], maxval);
    }}
    cout<<maxval-1;
}
