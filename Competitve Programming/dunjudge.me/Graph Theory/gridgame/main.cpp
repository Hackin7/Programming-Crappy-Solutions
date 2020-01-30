#include <bits/stdc++.h>
using namespace std;

//0% WA,TLE
#define MH 1000
#define MW 1000
int visited[MW][MH]; // x,y
int m[MW][MH]; //x, y
int h=MH, w=MW, k=0;
void mout(){
    for (int i=0; i<h; i++){if (i>0){cout<<endl;}
        for (int j=0; j<w; j++){cout<<visited[j][i];}}
}
//int v(int x, int y){return y*h+x;}

int onTime[1000010];
bool cmp(int x1, int y1, int depth){
    bool condition = visited[x1][y1]<depth && m[x1][y1] == 0 && depth <= k+2;
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
        stuff.pop_front();

        onTime[depth]++;
        //for(int i=depth;i<=k+2;i+=2){onTime[i]++;}
        //cout<<x<<","<<y<<" "<<depth<<endl;
        //mout();cout<<endl<<depth<<endl;

        int newdepth = depth+1;
        if (x-1 >= 0 && cmp(x-1,y,newdepth) ){stuff.push_back(make_tuple(x-1,y, newdepth));}
        if (x+1 < w && cmp(x+1,y,newdepth) ){stuff.push_back(make_tuple(x+1,y, newdepth));}
        if (y-1 >= 0 && cmp(x,y-1,newdepth) ){stuff.push_back(make_tuple(x,y-1, newdepth));}
        if (y+1 < h && cmp(x,y+1,newdepth)){stuff.push_back(make_tuple(x,y+1, newdepth));}
    }
}
int main(){
    int x,y;cin>>h>>w>>x>>y>>k;
    for (int i=0; i<h; i++){for (int j=0; j<w; j++){cin>>m[j][i];visited[j][i] = 0;}}

    memset(onTime,0,k+2);
    bfs(x,y,1);

    for (int i=2;i<k+2;i++){
        if(i>2){cout<<"\n";}
        cout<<onTime[i];
    }
}
