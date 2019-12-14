#include <bits/stdc++.h>
using namespace std;

/*lis*/
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
