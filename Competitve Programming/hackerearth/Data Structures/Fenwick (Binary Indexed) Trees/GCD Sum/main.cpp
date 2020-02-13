#include <bits/stdc++.h>
using namespace std;

//Some Notes
/*
Fenwick Tree, the array stores the buckets (sums)
All odd number values store in the array https://www.geeksforgeeks.org/binary-indexed-tree-or-fenwick-tree-2/
https://drive.google.com/drive/folders/1T1WNhUqT8_9JMnsUfPrtz18NIWhb3fwJ
https://www.hackerearth.com/practice/data-structures/advanced-data-structures/fenwick-binary-indexed-trees/tutorial/
*/
typedef long long ll;
const int V=1000000;

const int gcdSize=5000;
int gcdmemo[gcdSize][gcdSize];
int gcd(int a, int b) { 
    if (a>=gcdSize || b >= gcdSize){
        if (b==0){return a;}
        return gcd(b,a%b);
    }
    if (gcdmemo[a][b]!=0)return gcdmemo[a][b];
    if (b == 0) 
        return a; 
    gcdmemo[a][b] = gcd(b, a % b);  
    gcdmemo[b][a] = gcdmemo[a][b];
    return gcdmemo[a][b];
} 
int fmemo[V];
long long a[V];
int f(int x){
    if (fmemo[x]!=0)return fmemo[x];
    
    ll ans=0;
    for(int i=1;i<=x;i++){
        ans+=gcd(i,x);}
    fmemo[x] = ans;
    return ans;
}

int N = V;
long long ft[V + 1]; // note: this fenwick tree is 1-indexed.
void fenwick_update(int pos, long long value) {
    //cout<<value<<"["<<pos<<"]";
    while (pos <= N) {
        ft[pos] += value;
        //Add largest power of 2 dividing x
        //Last set bit in number x
        pos += (pos)&(-pos);
        //cout<<pos<<",";
    }
    //cout<<"\n";
}

long long fenwick_query(int pos) {
    long long sum = 0;
    while (pos) { // while p > 0
        sum += ft[pos];
        pos -= pos&-pos;
    }
    return sum;
}

//PURQ
long long fenwick_range_query(int pos_a, int pos_b) {
    return fenwick_query(pos_b) - fenwick_query(pos_a-1);
}

int main(){
    ios_base::sync_with_stdio(false); 
    cin.tie(NULL);  
    memset(gcdmemo,0,sizeof(gcdmemo));
    memset(fmemo,0,sizeof(fmemo));
    memset(ft,0,sizeof(ft));
    //cout<<f(4);
    int n; cin>>n;N=n;
    for (int i=0;i<n;i++){
        cin>>a[i];
        fenwick_update(i+1,f(a[i]));
        
    }
    
    int q; cin>>q;
    bool newlineFlag = false;
    for (int i=0;i<q;i++){
        //cout<<" ";for (int i=0;i<n+1;i++){cout<<ft[i]<<",";}cout<<"\n";
        char query; cin>>query;
        if (query == 'C'){
            int l,r; cin>>l>>r;
            int val = fenwick_range_query(l,r)%1000000007;
            if (newlineFlag){cout<<endl;}
            else{newlineFlag = true;}
            cout<<val;
        }else if (query == 'U'){
            int x,y; cin>>x>>y;
            int toReplace = fenwick_query(x);
            fenwick_update(x,f(y)-toReplace);
        }
    }
}

