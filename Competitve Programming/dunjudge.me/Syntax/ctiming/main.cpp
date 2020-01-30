#include <bits/stdc++.h>
using namespace std;

int minutes(int d,int h,int m){
    return d*60*24+h*60+m;
}
int main() {
    int D,H,M; cin>>D>>H>>M;
    int ans = minutes(D,H,M)-minutes(11,11,11);
    if (ans < 0){ans=-1;}
    cout<<ans;
}
