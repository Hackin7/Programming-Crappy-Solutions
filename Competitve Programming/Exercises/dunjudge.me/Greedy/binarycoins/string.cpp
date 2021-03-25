#include <bits/stdc++.h>
using namespace std;
int main() {
    unsigned long long B; cin>>B;
    string binary = bitset<64>(B).to_string(); //to binary
    //cout<<binary<<"\n";
    
    int ans = 0;
    for (int i=0;i<64;i++){
        if (binary[i] == '1'){ans++;}
    }
    cout<<ans;
}
