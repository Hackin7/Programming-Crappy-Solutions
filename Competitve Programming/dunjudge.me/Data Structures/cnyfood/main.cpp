#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;cin>>N;
    set<int> items[N+1];
    for(int i=0;i<N;i++){
        int M;cin>>M;
        for(int j=0;j<M;j++){
            int a;cin>>a;
            items[i].insert(a);
            items[N].insert(a);
        }
        /* Get in an unknown amount of integers
        string line;getline(cin,line);
        istringstream tmp(line);
        int a;
        while(tmp >> a){
            items[i].insert(a);
            items[N].insert(a);
        }*/
    }
    for(int i=0;i<=N;i++){
        if(i!=0){cout<<"\n";}
        cout<<items[i].size();
        //for(auto j:items[i]){cout<<j<<" ";}
    }
    return 0;
}
