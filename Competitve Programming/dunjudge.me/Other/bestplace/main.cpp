#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;cin>>N;
    int X[N],Y[N];
    for(int i=0;i<N;i++){
        cin>>X[i]>>Y[i];
    }
    sort(X,X+N);//Increasing Order
    sort(Y,Y+N);
    ll c=N/2;
    cout<<X[c]<<" "<<Y[c];
    return 0;
}
