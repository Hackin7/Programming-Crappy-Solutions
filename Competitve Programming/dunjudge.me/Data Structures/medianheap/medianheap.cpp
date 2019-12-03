#include <bits/stdc++.h>
using namespace std;
//NOT WORKING
int main() {
  int N; cin>>N;
    multiset<int, greater<int> > pq;
    for (auto i=0; i<N;i++){
        string cmd; cin>>cmd;
        if (cmd == "PUSH"){
            int x; cin>>x;
            pq.insert(x);
        }
        else if (cmd == "POP"){
            auto it = pq.begin(); for (int i=0; i<(int)pq.size()/2;i++){it++;}
            if (pq.size()%2==1){
                it++;
            }
            if (it != pq.begin() || it != pq.end()){pq.erase(it);}
        }
    }

    bool first = true;
    stack<int> s;
    for(auto it = pq.begin(); it != pq.end(); it++){
        s.push(*it);
        //if (!first){cout<<" ";}else{first = false;}
        //cout << *it;
    }
    while (!s.empty()){
        if (!first){cout<<" ";}else{first = false;}
        cout << s.top();
        s.pop();
    }
}
