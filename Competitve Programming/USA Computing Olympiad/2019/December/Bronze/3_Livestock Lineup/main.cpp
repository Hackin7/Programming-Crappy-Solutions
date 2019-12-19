#include <bits/stdc++.h>
#include <fstream>
using namespace std;

// 100% Solution

string nameval[] = {"Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"};
string toName(int x){return nameval[x];}
int fromName(string x){
    if (x=="Beatrice"){return 0;}
    if (x=="Belinda"){return 1;}
    if (x=="Bella"){return 2;}
    if (x=="Bessie"){return 3;}
    if (x=="Betsy"){return 4;}
    if (x=="Blue"){return 5;}
    if (x=="Buttercup"){return 6;}
    if (x=="Sue"){return 7;}
    cout<<"error";return 0;
}

const int V = 8;
vector<int> adjlist[V];
bool visited[V];

deque<int> bfs(int v) {//Input node with only 1 edge
    deque<int>order;//Ordering
    if (visited[v])return order;
    visited[v] = true;
    
    deque<int> toVisit;
    ////First node///////////////////////
    order.push_back(v);
    int dir = 0;//Direction to add
    if (adjlist[v][0] < v){dir = -1;}//Left
    else{dir = 1;}//Right
    toVisit.push_back(adjlist[v][0]);
    
    while(!toVisit.empty()){
        int curr = toVisit.front();toVisit.pop_front();
        cout<<"Visiting "<<curr<<endl;
        visited[curr] = true ;
        
        if (dir == 1){order.push_back(curr);}
        else{order.push_front(curr);}
        /////Traverse other nodes//////////////////////
        for(int u:adjlist[curr]){ 
            // Only 1 node will remain connected
            if (u!=curr && !visited[u]){ 
                cout<<"- Adding "<<u<<endl;
                toVisit.push_back(u);
            }
        }
    }
    //In case order got reversed
    if (order[0] > order[order.size()-1]){
        reverse(order.begin(),order.end());}
    cout<<"order:";for(int i=0;i<(int)order.size();i++){
        cout<<order[i];
    }cout<<endl;
    return order;
}

vector<int> oneEdge; set<int> noEdge;
deque<int> merge(deque<int> a, deque<int> b){
    deque<int> ans;
    int ACatB = b[0]-a[0];//[a.size()-1];
    int BCatA = a[0]-b[0];//[b.size()-1];
    
    if (BCatA < ACatB){    //Join a+b
        for (int i:a){ans.push_back(i);}
        //Add interim elements
        set<int> nEC;for (int i:noEdge){nEC.insert(i);}
        for (int i: nEC){
            cout<<i;
            if (i < b[0]){ans.push_back(i);noEdge.erase(i);}
            else{break;}
        }cout<<endl;
        for (int i:b){ans.push_back(i);}
    }
    else{    //Join b+a
        for (int i:b){ans.push_back(i);}
        //Add interim elements
        set<int> nEC;for (int i:noEdge){nEC.insert(i);}
        for (int i: nEC){
            if (i < a[0]){ans.push_back(i);noEdge.erase(i);}
            else{break;}
        }
        for (int i:a){ans.push_back(i);}
    }
    return ans;
}
// later in the order
int main(){
    ////Input///////////////////////////////////////////////
    ifstream infile; 
    infile.open("lineup.in"); 
    int N; infile>>N;string X,Y, u[4];
    for (int i=0;i<N;i++){
        infile>>X;
        for(int j=0;j<4;j++){infile>>u[j];}
        infile>>Y;
        int x=fromName(X),y=fromName(Y);
        adjlist[x].push_back(y);
        adjlist[y].push_back(x);
    }
    infile.close();
    
    ////Initialisation//////////////////////////////////////////
    memset(visited, false, sizeof(visited));
    //for(int i:visited){cout<<i;}cout<<endl;
    
    //Find nodes with only 1 edge
    for(int i=0;i<V;i++){
        if (adjlist[i].size()==1){oneEdge.push_back(i);}
        else if (adjlist[i].size()==0){noEdge.insert(i);}
    }
    deque<int>topo = bfs(oneEdge[0]);
    //Emptying Front
    set<int> nEC;for (int i:noEdge){nEC.insert(i);}
    deque<int> remaining;
    for (int i: nEC){
        if (i < topo[0]){remaining.push_back(i);noEdge.erase(i);}
        else{break;}
    }
    //Merging
    for(int i:remaining){
        topo.push_front(remaining.back());remaining.pop_back();
    }
    
    for (int i=0;i<(int)oneEdge.size();i++){
        if (!visited[oneEdge[i]]){
            deque<int> section=bfs(oneEdge[i]);
            topo = merge(topo, section);
        }
    }
    ////Emptying remaining ones
    //Back
    for (int i: noEdge){
        topo.push_back(i);
    }

    ////Output/////////////////////////////////////////////////
    ofstream outfile;
    outfile.open("lineup.out");
    for (int i:topo){cout<<toName(i)<<endl;
        if (i!=topo[0]){outfile<<endl;}
        outfile<<toName(i);
    }
    outfile.close();
    return 0;
}
