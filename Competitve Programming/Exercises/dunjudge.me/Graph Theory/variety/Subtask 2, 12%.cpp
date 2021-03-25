#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    bool subtask1=true,subtask2=true;
    ll N,M,W; cin>>N>>M>>W;
    ll cost[N];memset(cost,-1,sizeof(cost));
    ll order[M][3];
    for(ll i=0;i<M;i++){
        ll A,B,C;cin>>A>>B>>C;
        order[i][0]=A,order[i][1]=B,order[i][2]=C;
        
        if (C!=1){subtask2=false;}
        if(A!=B){subtask1=false;}
        else{
            if(cost[A]==-1){cost[A]=C;}
            else{cost[A]=min(cost[A],C);}
        }
    }
    if (subtask1){
        ll sum=0;for(ll i=0;i<N;i++){
            sum+=cost[i];
            if (cost[i]==-1){cout<<-1;return 0;}
        }
        cout<<sum;
    }else if (subtask2){
    }
    return 0;
}

/*
3 3 1
0 0 1
1 1 2
2 2 3
* 
3 4 1
0 0 1
0 0 2
1 1 2
2 2 3
*/
