#include <bits/stdc++.h>
using namespace std;

//Some Notes
/*
Fenwick Tree, the array stores the buckets (sums)
Has to be 1 indexed
All odd number values store in the array https://www.geeksforgeeks.org/binary-indexed-tree-or-fenwick-tree-2/
https://drive.google.com/drive/folders/1T1WNhUqT8_9JMnsUfPrtz18NIWhb3fwJ
https://www.hackerearth.com/practice/data-structures/advanced-data-structures/fenwick-binary-indexed-trees/tutorial/ https://kartikkukreja.wordpress.com/2013/12/02/range-updates-with-bit-fenwick-tree/
*/
int N = 100000;

//Below here can mix & match
long long ft[100001]; // note: this fenwick tree is 1-indexed.
////PUPQ//////////////////////////////////////////////////////
void fenwick_update(int pos, long long value) {
    while (pos <= N) {
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
}////RUPQ//////////////////////////////////////////////////////
void fenwick_range_update(int pos_a, int pos_b, int val){
    //TLE way
    //for (int i=pos_a;i<=pos_b;i++){fenwick_update(i, val);}
    fenwick_update(pos_a, val);
    fenwick_update(pos_b+1, -val);
}
////PURQ////////////// ////////////////////////////////////////
long long fenwick_range_query(int pos_a, int pos_b) {
    return fenwick_query(pos_b) - fenwick_query(pos_a-1);
}


////RURQ//////////////////////////////////////////////////////
long long B1[100001];long long B2[100001];
void base_update(long long *ft, int pos, long long value){
  //Add largest power of 2 dividing x / Last set bit in number x
  for (; pos <= N; pos += pos&(-pos))
    ft[pos] += value;
}
void rurq_range_update(int a, int b,long long v){
  base_update(B1, a, v);
  base_update(B1, b + 1, -v);
  base_update(B2, a, v * (a-1));     
  base_update(B2, b + 1, -v * b);     
}
void rurq_point_update(int a, long long v){
    rurq_range_update(a,a,v);
}
long long base_query(long long *ft,int b){
  long long sum = 0; 
  for(; b > 0; b -= b&(-b))
    sum += ft[b];
  return sum;
}
// Return sum A[1...b]
long long rurq_query(int b){
  return base_query(B1, b) * b - base_query(B2, b);
}

//Return sum A[a...b]
long long rurq_range_query(int a,int b){
  return rurq_query(b) - rurq_query(a-1);
}

int main(){
    memset(ft, 0, sizeof(ft));
    memset(B1, 0, sizeof(ft));
    memset(B2, 0, sizeof(ft));
    cin>>N;
    //cout<<"Array"<<N<<endl;
    long long arr[N+1];for (int i=1;i<=N;i++){cin>>arr[i];}
    //cout<<"Fenwick Updating"<<endl;
    for (int i=1;i<=N;i++){
        rurq_point_update(i,arr[i]);
    }
    //cout<<"Queries"<<endl;
    int q; cin>>q;
    bool newlineFlag = false;
    for (int i=0;i<q;i++){
        //cout<<"Query "<<i<<endl;
        char query; cin>>query;
        if (query == '0'){
            int x,y; cin>>x>>y;
            int val = rurq_range_query(x+1,y+1);
            if (newlineFlag){cout<<endl;}
            else{newlineFlag = true;}
            cout<<val;
        }else if (query == '1'){
            int a,b,c; cin>>a>>b>>c;
            for (int j=a;j<=b; j++){arr[j]+=c;}
            rurq_range_update(a+1,b+1,c);
        }
    }
}

