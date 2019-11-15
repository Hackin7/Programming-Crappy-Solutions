#include <bits/stdc++.h>
using namespace std;

//Nope should use segment tree
struct node {  
    int s, e, m, v;  
    node *l, *r;  
    
    node(int N) {  
        s = 0; e = N-1; m = (s+e)/2;  
        v = 0;  
        if (s!=e) {
            l = new node(s,m); r = new node(m+1,e);  
        }  
    }
    node(int _s, int _e) {  
        s = _s; e = _e; m = (s+e)/2;  
        v = 0;  
        if (s!=e) {
            l = new node(s,m); r = new node(m+1,e);  
        }  
    }
    //Update
    void update(int x, int nv) { //position x to new value
        if (s==e) { v=nv; return; }  
        if (x>m) r->update(x, nv);  
        if (x<=m) l->update(x, nv);
        v = min(l->v, r->v);  
    } 
    //Range Query
    int query(int x, int y) {
        if (s==x && e==y) return v;
        if (x>m) return r->query(x, y);
        if (y<=m) return l->query(x, y);
        return min(l->query(x, m), r->query(m+1, y));
    }
} *root;


void init(int N){
    node n;
}
void update(int x, int nv){}
int query(){}

int main(){
    
}

