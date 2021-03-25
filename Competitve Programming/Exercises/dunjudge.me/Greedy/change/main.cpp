#include <bits/stdc++.h>

using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int coin=4;
    int v[coin] = {5,10,20,50};
    int c[coin];for(int i=0;i<coin;i++){cin>>c[i];}
    int val;cin>>val;
    
    int ans=0;
    while (val>0&&coin>=0){
        int usage = max(val/v[coin],c[coin]);
        ans += usage;
        val -= usage*v[coin];
        coin--;
    }
    if (val>0)ans=-1;
    cout<<ans;
    return 0;
}
