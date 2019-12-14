#include <bits/stdc++.h>
using namespace std;

//Some Notes
/*
Fenwick Tree, the array stores the buckets (sums)
All odd number values store in the array https://www.geeksforgeeks.org/binary-indexed-tree-or-fenwick-tree-2/
https://drive.google.com/drive/folders/1T1WNhUqT8_9JMnsUfPrtz18NIWhb3fwJ
https://www.hackerearth.com/practice/data-structures/advanced-data-structures/fenwick-binary-indexed-trees/tutorial/
*/
int N = 100000;
long long ft[N + 1]; // note: this fenwick tree is 1-indexed.
void fenwick_update(int pos, long long value) {
    while (pos <= N) {
        ft[pos] += value;
        //Add largest power of 2 dividing x
        //Last set bit in number x
        pos += (pos)&(-pos);
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
//RUPQ
void fenwick_range_update(int pos_a, int pos_b, int val){
    fenwick_update(pos_a, val);
    fenwick_update(pos_b+1, -val);
}
//PURQ
long long fenwick_range_query(int pos_a, int pos_b) {
    return fenwick_query(pos_b) - fenwick_query(pos_a-1);
}

int main(){
    int n; cin>>n;N=n;
    long long a[n];for (int i=0;i<n;i++){cin>>a[i];}
    
    int q; cin>>q;
    bool newlineFlag = false;
    for (int i=0;i<q;i++){
        //cout<<"Query "<<i<<endl;
        char query; cin>>query;
        if (query == 'C'){
            int l,r; cin>>l>>r;
            int val = fenwick_range_query(l,r);
            if (newlineFlag){cout<<endl;}
            else{newlineFlag = true;}
        }else if (query == 'U'){
            int x,y; cin>>x>>y;
            fenwick_update(x,y);
        }
    }
}

