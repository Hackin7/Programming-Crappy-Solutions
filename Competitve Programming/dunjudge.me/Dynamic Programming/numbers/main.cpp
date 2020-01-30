#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

//Number of palindrome-free numbers
int isPalindromeFree(ll x){
    string s = to_string(x);
    for (ll i=0;i<=(ll)s.length()-3;i++){//3 Characters at a time
        if (s[i] == s[i+1] ||
            s[i+1] == s[i+2] ||
            s[i] == s[i+2]){
            //cout<<s[i]<<s[i+1]<<s[i+2]<<"\n";
            return 0;
        }
    }
    return -1;
}
ll noPalindromeFree(ll a,ll b) {
    ll ans = 0;
    for (ll i=a;i<=b;){
        int pos=isPalindromeFree(i);
        if (pos==-1){ans++;}
        i+=pow(10,pos);
    }
    return ans;
}
int main(){
    ll a,b; cin>>a>>b;
    cout<<noPalindromeFree(a,b);
    //cout<<isPalindromeFree(112);
    return 0;
}
