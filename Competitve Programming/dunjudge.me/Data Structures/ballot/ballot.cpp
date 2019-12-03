#include <bits/stdc++.h>
using namespace std;
//NOT WORKING
int main() {
    int N, C; cin>>N>>C;
    set<int > b;
    map<int, int> student;
    for (int i=0; i<N; i++){
        int val; cin>>val;
        b.insert(val);
        student[val] = i+1;
    }
    for (int i=0; i<C; i++){
        int val; cin>>val;
        int ans;
        set<int>::iterator up = b.upper_bound(val);
        set<int>::iterator low = b.lower_bound(val);
        set<int>::iterator f;
        //if (low == b.begin()){f = up;}
        if (val-*low <= *up -val){ f = low;}
        //else if (val-(int)*low == (int)*up -val){f = low;}
        else if (val-*low > *up -val){f = up;}

        ans = student[*f];

        if (i!=0)cout<<endl;
        cout<<ans<<","<<*f<<","<<*low<<","<<*up;
        b.erase(f);
    }
}
