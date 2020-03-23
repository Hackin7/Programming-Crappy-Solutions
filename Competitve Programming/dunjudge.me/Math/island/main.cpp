#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int main(){
    int N,M; cin>>N>>M;
    int roads=N+M-1;
    int u, v;

    //The number of links connected to each node
    int linked[200010];//Starts from 1
    //Everything starts with 1 way to order
    for(int i=0;i<200010;i++){linked[i]=0;}

    for(int i=0;i<roads;i++){
        cin>>u>>v;

        //Taking u as fixed
        if (linked[u]>0)//Ignore the first way (Circle anyway)
            cout<<linked[u]<<" 1\n";//Order the currently linked node
        linked[u]++; //Add a new linked

        if (linked[v]>0)cout<<linked[v]<<" 1\n";
        linked[v]++;
    }

    /*
    /////Subtask 1//////////////////
    if (M==0){
        cout<<"1 1\n";
    }else if (M==1){
        for (int i=1;i<roads;i++){
            cout<<i<<" 1\n";
        }
    }*/
    ////Subtask 2///////////////////


}
