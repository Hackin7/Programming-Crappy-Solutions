#include <bits/stdc++.h>
using namespace std;

const int V=1000000;
int m,n,k,ans=0;
//char layout[V],visited[V];
//void set(char m[],int x,int y, int val){}

bool cmp(deque<char> layout[],deque<char> visited[], int x1, int y1, int depth){
    bool condition = 0<=x1 && x1<m && 0<=y1&&y1<n && 
                (visited[x1][y1]<=0 || visited[x1][y1]>depth) && 
                layout[x1][y1] == '.' &&
                depth<=k;
    if (condition){
        visited[x1][y1] = 1;ans++;
    }
    return condition;
    
}
int directions[][2]={{1,0},{-1,0},{0,1},{0,-1}};
void bfs(int x1, int y1, int startDepth, deque<char> layout[],deque<char> visited[]){
    deque<tuple<int,int,int> > stuff;

    stuff.push_back(make_tuple(x1,y1,startDepth));
    //cmp(layout,visited,x1,y1,startDepth);//start with a pond
    
    while (!stuff.empty()){
        auto square = stuff.front();
        int x = get<0>(square), y = get<1>(square);
        int depth = get<2>(square);
        int newdepth = depth+1;
        stuff.pop_front();
        
        //cout<<endl<<x<<","<<y<<" "<<depth<<endl;
        for(int i=0;i<4;i++){
            int dx=directions[i][0], dy=directions[i][1];
            if (cmp(layout,visited,x+dx,y+dy,newdepth)){
                stuff.push_back(make_tuple(x+dx,y+dy,newdepth));
            }
        }
    }
}

int main(){
    cin>>m>>n>>k;
    deque<pair<int,int> > ponds;
    deque<char> layout[m];
    deque<char> visited[m];
    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){
            char a;cin>>a;//cout<<a;
            layout[j].push_back(a);
            //layout[j][i];
            visited[j].push_back(0);
            if (a=='*'){
                ponds.push_back(make_pair(j,i));
            }
    }}
    
    for(auto i:ponds){
    //cout<<i.first<<','<<i.second<<'\n';
        bfs(i.first,i.second,0,layout,visited);
    }
    cout<<ans;
}
/*
3 3 3 ... .#. .*.
*/
