#include <bits/stdc++.h>
using namespace std;
typedef unsigned long long ull; 
int main(){
    ull H,W,D;cin>>H>>W>>D;
    cout<<(H-1)+H*(W-1)+H*W*(D-1);
    return 0;
}
