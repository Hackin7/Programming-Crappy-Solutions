#include <bits/stdc++.h>
using namespace std;
/* Test data
10 3
0 1 3 2 4 8 2 7 3 5

10 1
1 2 3 4 5 6 7 8 9 10
*/
int n=100000,k;
int pebble[100000];
int fmem[100000];
int f(int i){
    //Memoization
    //cout<<k<<":"<<i<<"["<<fmem[i]<<"]"<<endl;;
    if (fmem[i]!= INT_MAX){return fmem[i];}
    
    //Base Case
    if (i==0){fmem[0]=pebble[0];}
    //Recursive cases
    else{
        int prev=f(i-1);
        for (int j=i-1-1; j>=max(i-k,0);j--){//Origin stones
            prev = min(prev,f(j));
        }
        fmem[i] = max(prev, pebble[i]);
    }
    return fmem[i];
}
int main(){
    fill(fmem, fmem+n,INT_MAX);
    cin>>n>>k;
    for(int i=0;i<n;i++){cin>>pebble[i];}pebble[n]=0;
    
    if (k==1){cout<<*max_element(pebble,pebble+n);return 0;}
    //for (int i=0;i<n;i++){f(i);}
    cout<<f(n);
    return 0;
}
