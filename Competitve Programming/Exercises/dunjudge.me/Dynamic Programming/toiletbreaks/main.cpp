#include <bits/stdc++.h>
using namespace std;

int main() {
    int N,K=0; cin>>N>>K;
    int A[N]; for(int i=0;i<N;i++){cin>>A[i];}
    
    int memo[N];
    fill(memo, memo+N, 1);
    int ans = memo[0];
    for(int i=0;i<N;i++){ //Jump from
        for(int j=i+1;j<N;j++){ //Jump to
            if (A[j] >= A[i]+K){
                memo[j] = max(memo[j],memo[i]+1);
                ans = max(ans, memo[j]);
            }
            
        }
    }
    //for (int i=0;i<N;i++)cout<<memo[i]<<endl;
    cout<<ans;
    return 0;
}
