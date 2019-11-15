#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int R, C, Q;
int t[10][100000]; // [y][x]
bool flowed[10][100000];
bool finalFlowed[10][100000];
int dir[4][2] = {{1,0}, {-1,0}, {0,1}, {0,-1}};

int flow = 0;
void dfs(int x, int y, bool mode){
    if (flowed[y][x] || finalFlowed[y][x])return;
    flowed[y][x] = true;
    
    if(mode)finalFlowed[y][x] = true;
    flow++;
    //cout<<"["<<mode<<"("<<x<<","<<y<<":"<<t[y][x]<<")"<<endl;
    for (int i=0; i<4; i++){
        int x1 = x + dir[i][0];
        int y1 = y + dir[i][1];
        if (x1 < 0 || x1 > C-1 || y1 < 0 || y1 > R-1){continue;}
        if (t[y1][x1] < t[y][x]){dfs(x1,y1,mode);} // If lower height
    }
}
void reset(bool mode){
    flow = 0;
    for (int j=0; j<R; j++){//y value
        for (int i=0; i<C; i++){//x value
            flowed[j][i] = false;
            if (mode)finalFlowed[j][i] = false;
        }
    }
}
vector<pair<int, int> > waterOn;
void mostFlow(){
    int maxX = 0;
    int maxY = 0;
    int maxFlow = 0;
    for (int i=0; i<C; i++){
        for (int j=0; j<R; j++){
            reset(0);
            dfs(i,j, false);
            if (flow > maxFlow){maxFlow = flow;maxX = i;maxY = j;}
        }
    }
    reset(0);
    dfs(maxX,maxY, true);
    waterOn.push_back(make_pair(maxX, maxY));
    cout<<maxX<<","<<maxY<<endl;
}
bool allFilled(){
    for (int i=0; i<C; i++){
        for (int j=0; j<R; j++){
            if (!finalFlowed[j][i]){//cout<<i<<"<"<<j<<" ";
                return false;}
        }
    }
    return true;
}
void show(){
    cout<<endl;
    for (int i=0; i<R; i++){
        for (int j=0; j<C; j++){
            cout<<finalFlowed[i][j];
        }
        cout<<endl;
    }
    cout<<endl;
}

int check(){
    int tile = 0;
    reset(1);
    for (;tile<R*C;tile++){
        //show();
        mostFlow();
        if (allFilled())break;
    }
    cout<<tile+1;
    return tile+1;
}

int newcheck(int x, int y){
    int ans = check();
    for (int tile = 0;tile<R*C;tile++){
        for (int i=0; i<4; i++){
            int x1 = x + dir[i][0];
            int y1 = y + dir[i][1];
            
        }
    }
    return ans;
};

int main(){
    ifstream infile; 
    infile.open("janitorin.txt"); 
    ofstream outfile;
    outfile.open("janitorout.txt");

    //INPUT
    infile >> R >> C >> Q; 
    //int t[R][C];// heights
    for (int j=0; j<R; j++){//y value
        for (int i=0; i<C; i++){//x value
            infile >> t[j][i];
            flowed[j][i] = false;
            finalFlowed[j][i] = false;
        }
    }
    
    outfile << check()<<endl;
        
    //Replacements
    int r[Q], c[Q], h[Q];
    for (int i=0; i<Q; i++){
        infile >> r[i] >> c[i] >> h[i];
        t[r[i]-1][c[i]-1] = h[i];
        outfile<<newcheck()<<endl;
    }
    //cout<<flow;
        
    infile.close();
    outfile.close();
    return 0;
}
