#include <bits/stdc++.h>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;cin>>n;
    int a[N];for(int i=0;i<N-1;i++){cin>>a[i];}
    
    int sum[N];sum[0]=a[0];
    for(int i=1;i<N;i++){sum[i]=sum[i-1]+a[i];}
    return 0;
}
