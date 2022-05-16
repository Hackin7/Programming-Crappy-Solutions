//Done at 16:02 from 15:00

#include <bits/stdc++.h>
//#include <iostream>
using namespace std;

// Variables
typedef long long ll;
#define INF 922337203685477580;

// Map Data ///////////////////////////////////////////
vector<pair<int,int>> holes[1000];
int M,N; //(y,x)
int arr[1000][1000]; // Map x,y
int visited[1000][1000]; // BFS x,y

void mout(){
    for (int i=0; i<M; i++){if (i>0){cout<<endl;}
        for (int j=0; j<N; j++){cout<<visited[j][i];}}
}

// Traversal /////////////////////////////////////////
int ans = INT_MAX; // Least No. steps needed
bool cmp(int x1, int y1, int depth){
    // Function to check if traversable
    bool condition = false;
    condition = (
        (
            visited[x1][y1] == -1 || //Not visited
            visited[x1][y1] > depth // Distance is less
        ) 
        // && arr[x1][y1] == 0
    );
    if (condition){
        visited[x1][y1] = depth;
        if (x1==N-1 && y1==M-1){
            ans = min(ans,depth);
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
    
        // Portals
        if (arr[x][y] != 0){
            for (pair<int,int> hole : holes[arr[x][y]]){
                int hx = hole.first; int hy=hole.second;
                if (hx==x && hy==y){continue;} // Skip if same
                if (cmp(hx,hy,depth)){stuff.push_back(make_tuple(hx,hy, depth));}
            }
        }
        
        // Up down left right
        if (x-1 >= 0 && cmp(x-1,y,depth+1) ){stuff.push_back(make_tuple(x-1,y, depth+1));}
        if (x+1 < N && cmp(x+1,y,depth+1) ){stuff.push_back(make_tuple(x+1,y, depth+1));}
        if (y-1 >= 0 && cmp(x,y-1,depth+1) ){stuff.push_back(make_tuple(x,y-1, depth+1));}
        if (y+1 < M && cmp(x,y+1,depth+1)){stuff.push_back(make_tuple(x,y+1, depth+1));}
        
       
    }
}



int main() {
    // Input
    cin>>M>>N; //y, x
    for (int y=0;y<M;y++){
        for(int x=0;x<N;x++){
            int holeval; cin>>holeval;
            arr[x][y] = holeval;
            if (holeval>0){
                holes[holeval].push_back(make_pair(x,y));
            }
            visited[x][y] = -1;//Not visited
        }
    }
    
    bfs(0, 0);
    cout<<ans;
    return 0;
}

/*
8 8
0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 1 0
0 0 0 0 0 0 0 0

3 3
0 0 0
0 1 0
0 0 1

*/
