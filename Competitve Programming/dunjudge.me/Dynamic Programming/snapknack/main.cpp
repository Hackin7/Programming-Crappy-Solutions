#include <bits/stdc++.h>
using namespace std;

//Basically lis on mirrored array
/*lis*/
int main(){
    int N; cin >> N;
    int A[2*N], lis[2*N];
    for (int i=0;i<N;i++){cin >> A[i];A[2*N-i-1] = A[i];}
    int ans = 0;
    for (int i = 0; i < 2*N; ++i) {
        lis[i] = 1;
        for (int j = 0; j < i; ++j)
            if (A[j] < A[i])lis[i] = max(lis[i], 1 + lis[j]);
        ans = max(ans, lis[i]);
    }
    cout<<ans;
}
