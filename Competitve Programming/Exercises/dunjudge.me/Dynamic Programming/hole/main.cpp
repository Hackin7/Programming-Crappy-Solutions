#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n; cin>>n;
    int a[n];set<int,greater<int> >s;//Sort in reverse, a "speedup"
    for(int i=0;i<n;i++){
        cin>>a[i];s.insert(a[i]);
    }
    int ans=0;
    for(auto ss:s){
        int maxsize=1;int size=1;
        for(int i=1;i<n;i++){
            if (a[i-1]>=ss && a[i]>=ss){
                size+=1;
            }else{size=1;}
            maxsize=max(maxsize,size);
        }
        ans=max(ans,ss*maxsize);
    }
    cout<<ans;
    return 0;
}

