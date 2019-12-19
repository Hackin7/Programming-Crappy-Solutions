#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;cin>>N;
    long long X[N];for (int i=0;i<N;i++){cin>>X[i];}
    long long Y[N];for (int i=0;i<N;i++){cin>>Y[i];}
    
    long long ans = 0;
    sort(X,X+N);sort(Y,Y+N);
    for(int i=0;i<N;i++){
        ans += X[i] * Y[N-1-i];
    }
    cout<<ans;
}
