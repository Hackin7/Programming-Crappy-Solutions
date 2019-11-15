#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;cin>>n;
    for (int i=1;i<=n*n;i++){
        cout<<i;
        if (i%n==0 && i!=n*n)cout<<endl;
        else cout<<" ";
    }
    return 0;
}
