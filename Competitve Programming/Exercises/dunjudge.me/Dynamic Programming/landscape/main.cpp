#include <bits/stdc++.h>
using namespace std;

#define V 1000000
int a[V+1]; //Original Array
int sum[V+1]; //Array used by RSQ
int rsq(int x, int y) { return sum[y]-sum[x-1]; }

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n; cin>>n;
    int a[n];set<int,greater<int> >s;//Sort in reverse, a "speedup"
    for(int i=0;i<n;i++){
        cin>>a[i];s.insert(a[i]);
    }
    
    /* Pre-computation -> put in int main*/
    memset(sum, 0, sizeof(sum)); //Not required if no multiple testcases
    for (int i=0;i<N;++i)
        sum[i] = sum[i-1] + a[i];
    
    int ans=0;
    for(auto ss:s){
        int maxsize=1;int size=1;
        for(int i=2;i<=n;i++){
            if (a[i-1]>=ss && a[i]>=ss){
                size=ss;
            }else{size=ss;}
            maxsize=max(maxsize,size);
        }
        ans=max(ans,maxsize);
    }
    cout<<ans;
    return 0;
}
