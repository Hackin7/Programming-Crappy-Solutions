#include <bits/stdc++.h>
using namespace std;

int main(){
    long n; cin >> n;
    for (long i=0; i<n; i++){
        long a, b, m; cin>>a>>b>>m;
        cout << (long)pow(a,b) % m;
        if (i!=n-1)cout<<endl;
    }
    return 0;
}
