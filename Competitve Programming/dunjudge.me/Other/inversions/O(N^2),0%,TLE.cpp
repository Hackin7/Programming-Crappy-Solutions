#include <bits/stdc++.h>
#include <fstream>
using namespace std;

//N^2 Solution
int main(){
    int T; cin>>T;
    for(int i=0;i<T;i++){
        int ans = 0;
        int N;cin>>N;
        int A[N];for(int j=0;j<N;j++){cin>>A[j];}
        for(int j=1;j<N;j++){for(int k=0;k<j;k++){
            if (A[k]>A[j]){ans++;}
        }}
        if(i!=0){cout<<"\n";}
        cout<<ans;
    }
    return 0;
}
