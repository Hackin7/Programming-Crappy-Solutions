#include <bits/stdc++.h>
#include <fstream>
using namespace std;

const int V=100001;
vector<int> adjlist[V];

int main(){
    int N,Q;cin>>N>>Q;
    int e[N];for(int i=0;i<N;i++){cin>>e[i];}
    int A,B;for (int i=0;i<N-1;i++){
        cin>>A>>B;
        adjlist[A].push_back(B);
        adjlist[B].push_back(A);
    }
    
    bool flag = false;
    for(int i=0;i<Q;i++){
        int a,x,y;cin>>a>>x>>y;
        if (a==1){e[x] = y;}
        else{
            if (flag){cout<<"\n";}
            else{flag=true;}
            
        }
    }
    return 0;
}
