#include <bits/stdc++.h>
using namespace std;
int main() {
    int N,M; cin>>N>>M;
    int onFence = 0;
    bool flag = false;
    for (int i=0;i<M;i++){
        string a; cin>>a;
        if (a=="LAND"){onFence++;}
        else if (a=="LEAVE"){onFence=max(onFence-1,0);}
        else if (a=="EVACUATE"){onFence=0;}
        if (onFence > N){flag=true;}
    }
    if (flag){cout<<"PLAN REJECTED";}
    else{cout<<"PLAN ACCEPTED";}
}
