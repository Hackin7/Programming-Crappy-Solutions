#include <bits/stdc++.h>
using namespace std;

//Below here can mix & match
long long ft[100001]; // note: this fenwick tree is 1-indexed.
////PUPQ//////////////////////////////////////////////////////
int V = 10000000;
void fenwick_update(int pos, long long value) {
    while (pos <= V) {
        //cout<<"Fenwick Updating: "<<pos<<","<<value<<endl;
        ft[pos] += value;
        
        pos += pos&-pos;
    }
}
long long fenwick_query(int pos) {
    long long sum = 0;
    while (pos) { // while p > 0
        sum += ft[pos];
        pos -= pos&-pos;
    }
    return sum;
}
long long fenwick_range_query(int pos_a, int pos_b) {
    return fenwick_query(pos_b) - fenwick_query(pos_a-1);
}
/*lis*/
int main(){
    int N; cin >> N;
    int A[N],lis[N];
    for (int i=0;i<N;i++)cin >> A[i];
    
    memset(ft, 0, sizeof(ft));
    
    int ans = 0;
    for (int i = 0; i < N; ++i) {
        //New Start
        int val = 1;
        //fenwick_update(A[i],1);//lis[i] = 1;
        for (int j = 0; j < i; ++j) //Jump From
            if (A[j] < A[i]){
                val = max(val, 1 + lis[j]);
            }
        lis[i]=val;//fenwick_update(A[i],val);
        ans = max(ans, val);
    }
    cout<<ans;
}
