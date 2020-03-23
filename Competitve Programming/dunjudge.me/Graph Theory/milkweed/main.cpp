#include <bits/stdc++.h>
using namespace std;

//100%
//https://contest.usaco.org/TESTDATA/OCT09_6.htm
typedef long long ll;
ll visited[V]; // x,y
char m[V]; //x, y
ll h=100, w=100, t = 0;

int conv(int x,int y){return y*w+x;}
int xv,yv;void conn(int v){xv=v%w;yv=v/w;}

bool cmp(ll x1, ll y1, ll depth){
    bool condition=false;
    bool inrange = 0<=x1 && x1<w && 0<=y1&&y1<h;
    condition = inrange && 
                visited[conv(x1,y1)]<0 && 
                m[conv(x1,y1)] == '.';
    if (condition){visited[conv(x1,y1)] = depth;}
    return condition;
    
}

int main(){
    ll x,y;cin>>w>>h>>x>>y;
    for (ll i=0; i<h; i++){for (ll j=0; j<w; j++){cin>>m[conv(j,i)];visited[conv(j,i)] = -1;}}
    
    ll x1 = x-1,y1 = h-y;
    //bfs//////////////////////////////////////////
    deque<tuple<ll,ll,ll> > stuff;

    stuff.push_back(make_tuple(x1,y1,0));visited[conv(x1,y1)]=0;
    while (!stuff.empty()){
        tuple<ll,ll,ll> square = stuff.front();
        ll x = get<0>(square), y = get<1>(square), depth = get<2>(square);
        ll newdepth = depth+1;
        stuff.pop_front();
        
        int directions[][2]={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        //cout<<endl<<x<<","<<y<<" "<<depth<<endl;
        //5mout();cout<<endl;
        for(int i=0;i<8;i++){
            int dx=directions[i][0], dy=directions[i][1];
            if (cmp(x+dx,y+dy,newdepth)){
                stuff.push_back(make_tuple(x+dx,y+dy,newdepth));
            }
        }
    }
    /////////////////////////////
    ll maxval = 0;
    for (ll i=0; i<w; i++){for (ll j=0; j<h; j++){
        maxval = max(visited[conv(i,j)], maxval);
    }}
    cout<<maxval;
}
