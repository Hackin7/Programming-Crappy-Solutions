#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N;cin>>N;
    int totalLetters=0,noCs=0;
    
    for(int i=0;i<N;i++){
        string a;cin>>a;
        totalLetters+=a.length();
        for(auto c:a){
            if (c=='C'||c=='c'){noCs++;}
        }
    }
    //cout<<noCs<<" "<<totalLetters;
    cout<<(noCs*100/totalLetters)<<"%";
    return 0;
}
