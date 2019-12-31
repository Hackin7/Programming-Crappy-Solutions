#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int dfs(int x,int p){
    int size=1;// Total size
    int max_child=0;// Biggest Child
    for(auto v:adjList[x]){if(v!=p){
        depth[v]=depth[x]+1;
        int child_size=dfs(v,x)// Size of subtree of child
        size+=child_size;
        if(child_size>max_child){
            max_child=child_size;
            heavy[x]=v;//heavy[x] will store the heavy child of node x
        }
    }
    return size;
}
int cur = 0;
void decompose(int x,int h){
    // cur is the global counter that stores the indices
    head[x]=h;pos[x]=cur++;
    if(heavy[x]!=-1){decompose(heavy[x],h);}
    for(auto i:adjList[x]){
        if(i==p[x])continue;
        if(i==heavy[x])continue;
        decompose(i,i);
    }
}

int a(){
    int res = 0;
    for (; head [ a ] != head [ b ]; b = p [ head [ b ]]) {
    // While a and b are on different heavy paths , we choose the node with a head with a higher depth and update everything from the node to its head. Then we move our current node to the parent of the head , to ensure we don ’t update a node twice    .
    if ( depth [ head [ a ]] > depth [ head [ b ]]) swap (a , b ) ;
    res = max (res , root -> query ( pos [ head [ b ]] , pos [ b ]) ) ;
    // REMINDER : QUERY THE POSITION , NOT THE NODE
    }
    if( depth [ a ] > depth [ b ]) swap (a , b) ;
    // If the nodes are still not equal then we update them
    one more time
    res = max ( res , root -> query ( pos [ a ] + 1, pos [ b ]) ) ;
    return res ;
}
int main(){
    return 0;
}
