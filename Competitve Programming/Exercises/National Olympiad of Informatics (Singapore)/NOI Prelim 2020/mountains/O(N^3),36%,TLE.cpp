#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;cin>>n;
    ll H[n];for(int i=0;i<n;i++){cin>>H[i];}
    
    ll count=0;
    for(int z=2;z<n;z++){//Count backwards
        for(int y=z-1;y>=1;y--){
            if (H[y]>H[z]){
                for(int x=y-1;x>=0;x--){
                    if (H[x]<H[y]){count++;}
                }
            }
        }
    }
    cout<<count;
    return 0;
}
