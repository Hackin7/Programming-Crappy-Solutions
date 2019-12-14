#include <bits/stdc++.h>
using namespace std;

int main(){
    int n; cin>>n;
    int p[n]; for (int i=0;i<n;i++){cin>>p[i];}
    sort(p,p+n);reverse(p,p+n);
    
    int sum = 0;
    for (int i=0; i<n; i++){
        //Get the 4th largest thing
        if (i%4 != 3)sum+=p[i];
    }
    cout << sum;
    return 0;
}
