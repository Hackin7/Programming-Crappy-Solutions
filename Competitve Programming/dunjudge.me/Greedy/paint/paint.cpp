#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    int n; cin >> n;
    int p[n]; for (int i=0; i<n; i++) cin>>p[i];
    int a[n]; for (int i=0; i<n; i++) cin>>a[i];
    
    int sum=0; for (int i=0; i<n; i++) sum+=p[i];
    sort(a, a+n);reverse(a, a+n);
    for (int i=0; i<n; i++){
        sum+=a[i]*i;
    }
    cout<<sum;
    return 0;
}
