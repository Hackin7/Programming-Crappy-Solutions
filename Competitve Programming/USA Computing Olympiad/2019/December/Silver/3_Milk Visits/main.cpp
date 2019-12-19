#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int N,M;string S;

const int V = 1000000;
vector<int> adjList[V];
bool visited[V];

int A,B; char C;
bool happy = false;
void resetDFS(){
    fill(visited,visited+N,false);
    happy = false;
    //cout<<A<<","<<B<<","<<C<<endl;
}
void dfs(int x, bool localHappy){
    if (visited[x]){return;}
    visited[x] = true;
    //cout<<" "<<x<<":"<<S[x]<<endl;
    if (S[x] == C){localHappy = true;}
    if (x == B){happy = localHappy; return;}
    
    for(int i:adjList[x]){
        dfs(i, localHappy);
    }
}

int main(){
    ifstream infile; 
    infile.open("milkvisits.in"); 
    
    infile>>N>>M>>S;
    for (int i=0;i<N-1;i++){
        int X,Y; infile>>X>>Y;
        X--;Y--; //1-Indexed
        adjList[X].push_back(Y);
        adjList[Y].push_back(X);
    }
    string output="";
    for (int i=0;i<M;i++){
        infile>>A>>B>>C;
        A--;B--;//1-indexed
        resetDFS();
        dfs(A, false);
        
        if (happy){output.append("1");}
        else{output.append("0");}
    }
    infile.close();

    cout<<output;
    ofstream outfile;
    outfile.open("milkvisits.out");
    outfile<<output;
    outfile.close();
    return 0;
}
