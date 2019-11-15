#include <bits/stdc++.h>
using namespace std;

char m[1000][1000];
//0%
bool gotRock(int x,int y,int width,int height){
    if (x > width)return false;
    if (x < 0)return false;
    if (y > height)return false;
    if (y < 0)return false;
    char c = ::m[x][y];
    return c == '*';
}
vector<pair<int,int> >connected(int x,int y,int width,int height){
    vector<pair<int,int> > neighbours;
    neighbours.push_back(make_pair(x+1,y+1));
    neighbours.push_back(make_pair(x+1,y-1));
    neighbours.push_back(make_pair(x-1,y+1));
    neighbours.push_back(make_pair(x-1,y-1));
    
    neighbours.push_back(make_pair(x+2,y+1));
    neighbours.push_back(make_pair(x+2,y));
    neighbours.push_back(make_pair(x+2,y-1));
    neighbours.push_back(make_pair(x-2,y+1));
    neighbours.push_back(make_pair(x-2,y));
    neighbours.push_back(make_pair(x+2,y-1));
    
    vector<pair<int,int> > allowed;
    for (int i=0; i<(int)neighbours.size();i++){
        if (gotRock(neighbours[i].first,neighbours[i].second, width, height))
            allowed.push_back(neighbours[i]);
    }
    return neighbours;
}
vector<int> adjList[1000];
int bfs(int node, int depth){
    int count = 0;//Friends attending
    
    bool passed[1000+1];
    memset(passed, false, sizeof(passed));

    deque<pair<int,int> > breadth;
    breadth.push_back(make_pair(node,1));//Starting depth
    passed[node] = true;
    
    while (!breadth.empty()){
        pair<int,int> current = breadth.front();
        int i = current.first;
        for (int j=0; j<(int)adjList[i].size(); j++){
            if (current.second+1 < depth && !passed[adjList[i][j]]){
                breadth.push_back(make_pair(adjList[i][j],current.second+1));
                passed[adjList[i][j]] = true;
            }
        }
        breadth.pop_front();
        count++;
    }
    return count;
}

int main(){
    int x,y,mx,my; cin>>x>>y>>mx>>my;
    //char map[x][y];
    for (int j=0; j<y;j++){
        for (int i=0; i<x;i++){
            char c;
            cin>>c;
            m[x][y] = c;
        }
    }
    //int cost2 = dijkstra(N, T, H);
    //if (cost1 < 0 || cost2 < 0)cout << -1;
    //else cout<<cost1+cost2; 
}

