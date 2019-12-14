#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int R, C, Q;
int t[10][100000];// heights
bool flowed[10][100000];
bool canFlow(int x1, int y1, int x2, int y2){
    if (x2 < 0 or x2 > C-1)return false;
    if (y2 < 0 or y2 > R-1)return false;
    if (flowed[y2][x2])return false;
    ////cout<<":"<<t[x2][y2]<<"<"<<t[x1][y1]<<";";
    return t[y2][x2] < t[y1][x1];
}
vector<pair<int, int> > coordinates;
deque<pair<int, int> > queue;
void neighbour(int x, int y, int x1, int y1){
    ////cout<<"("<<x1<<","<<y1<<")";
    if (canFlow(x, y, x1, y1)){
        ////cout<<"["<<x1<<","<<y1<<"]";
        ::coordinates.push_back(make_pair(x1, y1));
        ::queue.push_back(make_pair(x1, y1));
        //::flowed[y1][x1] = true;
    }
}
void bfs(int x, int y){
    ::coordinates.clear();
    ::queue.push_back(make_pair(x,y));
    ::coordinates.push_back(make_pair(x, y));
    while (!::queue.empty()){
        pair<int,int> current = ::queue.front();
        int x1 = current.first, y1 = current.second;
        ////cout<<x1<<","<<y1<<"["<<t[y1][x1]<<"]"<<endl;
        ::queue.pop_front();
        //Find neighbours
        neighbour(x1, y1, x1, y1+1);
        neighbour(x1, y1, x1, y1-1);
        neighbour(x1, y1, x1+1, y1);
        neighbour( x1, y1, x1-1, y1);
    }
}
vector<pair<int, int> > emptySpaces(){
    vector<pair<int, int> > coor;
    for (int j=0; j<R; j++){
        for (int i=0; i<C; i++){
            if (!flowed[j][i]){
                coor.push_back(make_pair(i, j));}
        }
    }
    return coor;
}
void showFlowed(){
    //cout<<endl;
    for (int j=0; j<R; j++){
        for (int i=0; i<C; i++){
            //cout<<flowed[j][i];
        }//cout<<endl;
    }
}
int clearSpaces(){
    pair<int, int> cmax = make_pair(0,0);
    int max = 0;
    vector<pair<int, int> > coor = emptySpaces();
    for (auto c : coor){
        bfs(c.first,c.second);
        if (max < (int)::coordinates.size()){
            cmax = c;
            max = ::coordinates.size();
        }
    }
    //cout<<"("<<cmax.first<<","<<cmax.second<<")"<<endl;
    //Clear all
    bfs(cmax.first, cmax.second);
    for (auto c: ::coordinates){
        flowed[c.second][c.first] = true;
    }
    return max;
}

bool isFilled(){
    for (int j=0; j<R; j++){
        for (int i=0; i<C; i++){
            if (!flowed[j][i]){return false;}
        }
    }
    return true;
}

int noPouring(){
    int counter = 0;
    int filled = -1;
    while (!isFilled()){
        filled += clearSpaces();
        ////cout<<"_"<<filled<<"_";
        counter++;
        showFlowed();
    }
    
    return counter;
}
void reset(){
    for (int j=0; j<R; j++){//y value
        for (int i=0; i<C; i++){//x value
            flowed[j][i] = false;
        }
    }
}
int main(){
    ifstream infile; 
    infile.open("janitorin.txt"); 
    //INPUT
    infile >> R >> C >> Q; 
    //int t[R][C];// heights
    for (int j=0; j<R; j++){//y value
        for (int i=0; i<C; i++){//x value
            infile >> t[j][i];
            flowed[j][i] = false;
        }
    }
    //Replacements
    int r[Q], c[Q], h[Q];
    for (int i=0; i<Q; i++){
        infile >> r[i] >> c[i] >> h[i];
    }
    infile.close();
    
    
    ofstream outfile;
    outfile.open("janitorout.txt");
    
    int d = noPouring();
    //cout<<d<<endl;
    outfile<<d<<endl;
    
    for (int i=0; i<Q; i++){
        t[r[i]-1][c[i]-1] = h[i];
        reset();
        showFlowed();
        int d = noPouring();
        //cout<<d<<endl;
        outfile<<d<<endl;
    }
    outfile.close();
}
