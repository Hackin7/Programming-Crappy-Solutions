#include <bits/stdc++.h>
using namespace std;

/*stepgame
int main(){
    int N; cin >> N;
    int A[N], maxsum[N];
    for (int i=0;i<N;i++)cin >> A[i];
    int ans = maxsum[0] = A[0];
    for (int i = 1; i < N; ++i) {
        maxsum[i] = min(maxsum[i-1] + A[i], A[i]);
        ans = min(ans, maxsum[i]);
    }
    cout << ans;
}
*/

/*lis
int main(){
    int N; cin >> N;
    int A[N], lis[N];
    for (int i=0;i<N;i++)cin >> A[i];
    int ans = 0;
    for (int i = 0; i < N; ++i) {
        lis[i] = 1;
        for (int j = 0; j < i; ++j)
            if (A[j] < A[i])lis[i] = max(lis[i], 1 + lis[j]);
        ans = max(ans, lis[i]);
    }
    cout<<ans;
}
*/

/*coinchange
int main(){
    int N,V; cin >> N >> V;
    int coins[N], ways[N];
    for (int i=0;i<N;i++)cin >> A[i];
    ways[0] = 1;
    for (int i = 1; i <= N; ++i) // note order of loops!
    for (int v = 1; v <= V; ++v)
        if (v >= coins[i])
            ways[v] += ways[v - coins[i]];
    cout << ways[N];
}*/

/*moneychanger*/
int main(){
    int N,V; cin >> N >> V;
    int coins[N], mincoins[V];
    for (int i=0;i<N;i++)cin >> coins[i];
    
    for (int v = 0; v <= V; ++v) mincoins[v] = INT_MAX;
    // INT_MAX will be our infinity
    mincoins[0] = 0;
    //for all values
    for (int v = 1; v <= V; ++v)
        for (int i = 0; i < N; ++i)
            if (v >= coins[i] && mincoins[v - coins[i]] != INT_MAX)
            mincoins[v] = min(mincoins[v], 1 + mincoins[v - coins[i]]);
    if (mincoins[V-1] == INT_MAX)cout<<-1;
    else cout << mincoins[V-1];
    return 0;
}
