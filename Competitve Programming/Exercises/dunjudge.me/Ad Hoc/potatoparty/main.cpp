#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N;cin>>N;
    
    int A[N],B[N];
    for(int i=0;i<N;i++){
        cin>>A[i]>>B[i];
    }
    cout<<max(0,*min_element(B,B+N)-*max_element(A,A+N)+1);
     
    return 0;
}
