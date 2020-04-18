#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll m,d;
bool bsCmp(ll k){
    ll climbed = 0;
    ll divisor = 1, divstep=0;
    
    //cout<<k<<endl;
    ll term = k;
    while (term > 0){
        climbed+=term;
        divisor *= d+divstep;divstep++;
        term = k/divisor;
        //cout<<" - "<<divstep<<","<<divisor<<" "<<term<<endl;
    }
    return climbed >= m;
}
//find the minimum i such that f(i) is true
bool findMin=1;
ll binarySearch(ll l, ll r) { 
    ll m;
    while (l <= r) { 
        m = (l+r)/ 2; 
        bool cmp = findMin?bsCmp(m):!bsCmp(m);
        if (cmp){r = m-1;}
        else{l = m + 1;}
    }
    return l; 
} 

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin>>m>>d;
    
    cout<<binarySearch(1,m);
    return 0;
}
