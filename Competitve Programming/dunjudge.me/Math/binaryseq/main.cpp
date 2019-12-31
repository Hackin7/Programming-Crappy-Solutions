#include <bits/stdc++.h>
#include <fstream>
using namespace std;

/*
10000000000000000000
11000000000000000000//1
10100000000000000000//1
11110000000000000000//3
100010000000000000000//1
1100110000000000000000//3
*/

int main(){
    string M; cin>>M;
    unsigned long long m = bitset<64>(M).to_ulong();
    
    int ans = 1;// First digits
    
    bool s[m], ss[m]; 
    fill(s,s+m,0);s[0] = 1;fill(ss,ss+m,0);ss[0] = 1;
    for (auto j=0;j<m-1;j++){
        for(auto i=0;i<m;i++){
            if (j%2==0){
                if (i==0){ss[i] = 1;}
                else{ss[i] = s[i-1] != s[i] ? 1 : 0;}
                if (ss[i])ans++;
            }else{
                if (i==0){s[i] = 1;}
                else{s[i] = ss[i-1] != ss[i] ? 1 : 0;}
                if (s[i])ans++;
            }
        }
        //if (j%2==0){for(int i=0;i<m;i++){cout<<ss[i];}cout<<endl;}
        //else{for(int i=0;i<m;i++){cout<<s[i];}cout<<endl;}
        //cout<<ans;
    }
    cout<<ans%1000000007;
    return 0;
}
