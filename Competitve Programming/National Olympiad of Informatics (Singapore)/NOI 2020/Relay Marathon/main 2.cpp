#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define V 1000000
typedef long long ll;
typedef pair<int,int> ipair;



int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N,M,K; cin>>N>>M>>K;

    int adjMat[N+1][N+1];memset(adjMat,-1,sizeof(adjMat));
    for(int i=0;i<M;i++){
        int A,B,C; cin>>A>>B>>C;
        adjMat[A][B]=C;
        adjMat[B][A]=C;
    }
    
    int A[N+10];
    for(int i=0;i<K;i++){cin>>A[i];}
    
    for (int k = 1; k <= N; ++k) {
        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= N; ++j) {
                if (adjMat[i][k] == -1 || adjMat[k][j] == -1) continue;
                if (adjMat[i][j] == -1 || adjMat[i][j] > adjMat[i][k] + adjMat[k][j]) 
                    adjMat[i][j] = adjMat[i][k] + adjMat[k][j];
            }
        }
    }
    //cout<<endl;
    //for(auto i:A){cout<<i<<" ";}cout<<endl;
    priority_queue<int> pq;
    for(int i=0;i<K;i++){
        for(int j=i+1;j<K;j++){
            if (adjMat[A[i]][A[j]]>=0){
                //cout<<A[i]<<" "<<A[j]<<" "<<adjMat[A[i]][A[j]]<<endl;
                pq.push(-adjMat[A[i]][A[j]]);
            }
        }
    }
    int ans = -pq.top(); pq.pop();//cout<<ans<<endl;
    ans+=-pq.top();cout<<ans;
    return 0;
}
/*
5 4 4
1 2 1
3 4 2
4 5 5
5 3 8
3 1 5 2

6 6 4
1 2 5
2 4 7
4 6 50
6 5 3
1 5 15
3 5 6
1 5 4 6
*/
