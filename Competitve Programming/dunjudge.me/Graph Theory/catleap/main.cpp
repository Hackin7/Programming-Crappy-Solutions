#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll V=1025;
ll visited[V][V]; // x,y
char m[V][V]; //x, y
ll h=100, w=100, t = 0;
void mout(ll x,ll y){
    for (ll i=0; i<h; i++){
        if (i>0){cout<<endl;}
        for (ll j=0; j<w; j++){
            if (j==x && i==y)cout<<'*';
            else cout<<visited[j][i];
            cout<<' ';
        }
    }
}

bool inmap(ll x1, ll y1){return 0<=x1 && x1<w && 0<=y1&&y1<h;}
bool cmp(ll x1, ll y1, ll depth){
    bool condition=false;
    bool inrange = inmap(x1,y1);
    condition = inrange && 
                (visited[x1][y1]<=0 ||
                    visited[x1][y1]>depth) && 
                (m[x1][y1] == '.'||
                    m[x1][y1] == 'E');
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
        
        int directions[][2]={{1,0},{-1,0},{0,1},{0,-1}};//,{1,1},{1,-1},{-1,1},{-1,-1}};
        //cout<<endl<<x<<","<<y<<" "<<depth<<endl;
        //mout(x,y);cout<<endl;
        for(int i=0;i<4;i++){
            int dx=directions[i][0], dy=directions[i][1];
            if (cmp(x+dx,y+dy,newdepth)){
                stuff.push_back(make_tuple(x+dx,y+dy,newdepth));
            }else if (inmap(x+dx,y+dy)&&m[x+dx][y+dy]=='#'&& cmp(x+2*dx,y+2*dy,newdepth)){
               //cout<<'#'<<(m[x+dx][y+dy]=='#');
               stuff.push_back(make_tuple(x+2*dx,y+2*dy,newdepth));//cout<<1;
            }
        }
    }
}
int main(){
    ll x,y,xe,ye;cin>>h>>w;
    for (ll i=0; i<h; i++){
        for (ll j=0; j<w; j++){
            cin>>m[j][i];visited[j][i] = 0;
            if (m[j][i]=='S'){x=j;y=i;}
            if (m[j][i]=='E'){xe=j;ye=i;}
    }}
    
    bfs(x,y,1);
    
    cout<<visited[xe][ye]-1;
}

/*
3 20 
.#.#.#.#.#..........
S..................E
..........#.#.#.#.#.
*/
