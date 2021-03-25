#include <bits/stdc++.h>
using namespace std;
#define V 1000000

typedef pair<int,int> ipair;

int val(char a){
    if(a=='M'){return 0;}
    else if(a=='A'){return 1;}
    else if(a=='T'){return 2;}
    else if(a=='E'){return 3;}
    else{return 0;}
}

int R,C;
int conv(int x,int y){return y*C+x;}
int xv,yv;void conn(int v){xv=v%C;yv=v/C;}

char m[V]; 


bool cmp(int visited[],int x1, int y1, int depth){
    bool condition=false;
    bool inrange = 0<=x1 && x1<C && 0<=y1&&y1<R;
    condition = inrange && 
                visited[conv(x1,y1)]<0;
    if (condition){visited[conv(x1,y1)] = depth;}
    return condition;
    
}
bool found=0;
int find(int v,int x1,int y1){
    if (v==4){found=1;return 0;}
    int cost=INT_MAX;   
    
    int visited[R*C];memset(visited,-1,sizeof(visited)); //bfs//////////////////////////////////////////
    deque<tuple<int,int,int> > stuff;
    stuff.push_back(make_tuple(x1,y1,0));visited[conv(x1,y1)]=0;
    while (!stuff.empty()){
        tuple<int,int,int> square = stuff.front();
        int x ,y,depth;tie(x,y,depth)=square;
        //cout<<x<<","<<y<<endl;
        int newdepth = depth+1;
        stuff.pop_front();
        if (val(m[conv(x,y)])==v){
            cost=min(cost,find(v+1,x,y)+abs(x1-x)+abs(y1-y));
            break;//if (found==1){break;}
        }
        int directions[][2]={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int i=0;i<8;i++){
            int dx=directions[i][0], dy=directions[i][1];
            if (cmp(visited,x+dx,y+dy,newdepth)){
                stuff.push_back(make_tuple(x+dx,y+dy,newdepth));
            }
        }
    }
    /////////////////////////////
    return cost;
}

int find(){//Start node at 0
    int cost=INT_MAX,v=0;
    for(int i=0;i<C;i++){for(int j=0;j<R;j++){
        if (val(m[conv(i,j)])==v){
            cost=min(cost,find(v+1,i,j));
        }
    }}
    return cost;
}
typedef tuple<int,int,int> group;
int main(){
    cin>>R>>C;
    for (int i=0; i<R; i++){for (int j=0; j<C; j++){
        cin>>m[conv(j,i)];
    }}
    
    int cost=find();
    cout<<cost;
}
/*
4 4
MATE
MATE
MATE
MATE
*/
