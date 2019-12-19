#include <bits/stdc++.h>
using namespace std;
int main() {
    unsigned long long B; cin>>B;
    int ans = 0;
    unsigned long long note = (unsigned long)pow(2, (unsigned long long)log2(B));
    //cout<<note<<endl;
    while (B > 0){
        //cout<<note<<endl;
        ans += B/note;
        B%=note;note/=2;
    }
    cout<<ans;
}
