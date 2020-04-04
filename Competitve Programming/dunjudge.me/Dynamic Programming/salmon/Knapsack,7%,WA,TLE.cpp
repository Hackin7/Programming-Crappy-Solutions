#include <bits/stdc++.h>
using namespace std;

//salmon
//Some bugs in the values
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;cin>>n;
    int M=n;//Maximum number of salmon sashimi
    
    int noItems = 5;int N=1024*noItems;//Total no items available
    int v[N],s[N];
    //Generating items
    for(int i=0;i<N;i++){
        if (i%noItems==0){v[i]=2; s[i]=1;} //Salmon Sashimi
        else if (i%noItems==1){v[i]=60; s[i]=6*2+5;} //Premium Bento
        else if (i%noItems==2){v[i]=7; s[i]=2;} //Salmon Maki
        else if (i%noItems==3){v[i]=588; s[i]=179*2;} //Yu Sheng
        else if (i%noItems==4){v[i]=2888 ;s[i]=s[1]*24+67*s[2]+88*s[0];} //CNY Gift Box
    }
    
    int dp[M];
    memset(dp, 0, sizeof(dp));
    for (int i = 0; i < N; ++i) {
        for (int x = M; x >= s[i]; --x) {
            dp[x] = max(dp[x], dp[x-s[i]]+v[i]);
        }
    }
    int ans = 0;
    for (int i = 0; i <= M; ++i) ans = max(ans, dp[i]);
    cout<<ans;
    return 0;
}
