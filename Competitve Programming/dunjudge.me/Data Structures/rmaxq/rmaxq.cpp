#include <bits/stdc++.h>
using namespace std;

//Nope should use segment tree
struct node {  
    int s, e, m, v;  
    node *l, *r;  
    node(int _s, int _e) {  
        s = _s; e = _e; m = (s+e)/2;  
        v = 0;  
        if (s!=e) {
            l = new node(s,m); r = new node(m+1,e);  
        }  
    }
    //Update
    void up(int x, int nv) { //position x to new value
        if (s==e) { v=nv; return; }  
        if (x>m) r->up(x, nv);  
        if (x<=m) l->up(x, nv);
        v = min(l->v, r->v);  
    } 
    //Range Maximum Query
    int rmq(int x, int y) {
        if (s==x && e==y) return v;
        if (x>m) return r->rmq(x, y);
        if (y<=m) return l->rmq(x, y);
        return max(l->rmq(x, m), r->rmq(m+1, y));
    }
} *root;

int main(){
    int N; cin>>N;
    root = new node(0, N-1);
}

void slow(){
    int N; cin>>N;
    int A[N]; 
    for (int i=0;i<N;i++){cin>>A[i];}
    
    int M; cin>>M;
    for (int i=0;i<M;i++){
        int t;cin>>t;
        if (t==0){
            int x,y;cin>>x>>y;
            //Find max value
            int val = A[x];
            for (int j=x+1;j<=y;j++){
                val = max(val,A[j]);}
            cout << val;if (i!=M-1)cout<<endl;
        }else if (t==1){
            int a,b,c; cin>>a>>b>>c;
            for (int j=a;j<=b;j++){
                A[j]+=c;}
        }
    }
}
