#include <bits/stdc++.h>
using namespace std;

int main(){
    string input;cin>>input;
    int ans=1;
    
    multiset<char> letters;
    set<char> l;
    for (auto i : input){
        letters.insert(i);l.insert(i);
    }
    bool evenflag = false;
    for (auto it=l.begin();it!=l.end();it++){
        int c = letters.count(*it);
        if (c == 1){cout<<0;return 0;}
        else if (c==2){
            if (evenflag){cout<<0;return 0;}
            evenflag = true;
        }
    }
    
    cout<<ans;
    return 0;
}
