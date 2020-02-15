#include <bits/stdc++.h>
using namespace std;

void output(multiset<int> pq){
    bool first = true;
    for(auto it=pq.begin();it!=pq.end();it++){
        if (!first){cout<<" ";}else{first=false;}
        cout<<(*it);
    }
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N; cin>>N;
    multiset<int> pq;
    for (auto i=0; i<N;i++){
        string cmd; cin>>cmd;
        if (cmd == "PUSH"){
            int x; cin>>x;
            pq.insert(x);
        }
        else if (cmd == "POP"){
            //auto it = pq.begin();
            //for (int i=0; i<(int)pq.size()/2-1;i++){it++;}
            auto it = next(pq.begin(),(int)pq.size()/2-1);
            if (pq.size()%2==1 && pq.size()>0){it++;}
            //cout<<":"<<distance(pq.begin(),it)<<" "<<(it==pq.end())<<" "<<(it==pq.begin());
            if(it!=pq.end())pq.erase(it);
            else{pq.erase(--it);}
        }
        //cout<<endl;output(pq);
    }
    output(pq);
    
}
/*
10
PUSH 5
PUSH 2
PUSH 4
POP
PUSH 3
PUSH 9
POP
POP
POP
POP

5
PUSH 5
PUSH 2
POP
PUSH 3
PUSH 9

*/
