#include <bits/stdc++.h>
using namespace std;

int main(){
    int N,M,R;cin>>N>>M>>R;
    int c[N+M];for(int i=0;i<N+M;i++)cin>>c[i];
    //Let the villages be numbered 0...N-1 and the satelites be numbered N...N+M-1
    vector<int> adjList[N+M];
    for (int i=0;i<N+M;i++){
        for(int j=i+1;j<N+M;j++){
            //if (i==j){continue;}
            if (c[j]-c[i] <= R){
                adjList[i].push_back(j);
            }
        }
    }
    for(int i=0;i<N+M;i++){
        for(auto j:adjList[i]){cout<<j<<",";}cout<<endl;
    }
    return 0;
}
