#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    string N; cin>>N;
    int test=0;
    for(int i=0;i<(int)N.length();i++){
        if (i%2==0){test+=N[i]-'0';}
        else{test-=N[i]-'0';}
    }
    if (test%11){cout<<"NO";}
    else{cout<<"YES";}
    return 0;
}
