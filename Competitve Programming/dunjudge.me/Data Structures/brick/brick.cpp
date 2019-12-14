#include <bits/stdc++.h>
using namespace std;
//51%
void brick(){
    deque<int> s;
    int N; cin>>N;
    //int arr[N];for (int i=0; i<N; i++){cin>>arr[i];}
    for (int i=0; i<N; i++){
        int X;cin>>X;// = arr[i];
        auto it = s.begin();
        while (it != s.end() && *it <= X){
            it++;
        }
        s.erase(s.begin(), it);
        s.push(X);
    }
    bool notstart = false;
    for(auto it = s.begin(); it != s.end(); it++){
        if (notstart){cout<<endl;}
        else{notstart = true;}
        cout << *it; // outputs 1 2 3 4
    }
}

int main() {
    brick();

}
