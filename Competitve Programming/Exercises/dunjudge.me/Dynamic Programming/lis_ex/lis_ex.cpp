#include <bits/stdc++.h>
using namespace std;
//With reference to https://noiref.codecla.ws/dp/#lis
int main(){
    int N; cin >> N;
    int a[N];
    for (int i=0;i<N;i++)cin >> a[i];
    int h[N], l;
    for (int i = l = 0; i < N; ++i) {
        //Find the position of the thing
        int p = lower_bound(h, h+l, a[i])-h; 
        //Set the current position for future reference
        h[p] = a[i];
        l = max(p+1, l);
    }
    cout<<l;
}
