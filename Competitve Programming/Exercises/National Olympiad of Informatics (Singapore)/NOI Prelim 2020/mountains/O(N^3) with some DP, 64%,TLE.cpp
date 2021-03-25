#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;cin>>n;
    ll H[n];for(int i=0;i<n;i++){cin>>H[i];}
    
    ll rise[n];memset(rise,-1,sizeof(rise));//index by y value
    
    ll count=0;
    
    for(int z=2;z<n;z++){//Count backwards
    for(int y=z-1;y>=1;y--){
        if (H[y]>H[z]){
            //Overlapping subproblem here
            if (rise[y]==-1){
                int localcount=0;
                for(int x=y-1;x>=0;x--){
                    if (H[x]<H[y]){localcount++;}
                }
                rise[y]=localcount;
            }
            count+=rise[y];
        }
    }
    }
    cout<<count;
    return 0;
}
