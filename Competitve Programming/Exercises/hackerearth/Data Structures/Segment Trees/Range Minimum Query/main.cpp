#include <bits/stdc++.h>
using namespace std;

//Nope should use segment tree
struct node {  
    int start, end, mid, val;
    node *left, *right;  
    
    node(int _s, int _e) {  
        //Range of values stored
        start = _s; end = _e; mid = (start+end)/2;  
        //Min value stored
        val = 0; 
        if (start!=end) {
            left = new node(start,mid);
            right = new node(mid+1,end);  
        }  
    }
    
    // Update position to new_value // O(log N)
    void update(int pos, int new_val) { //position x to new value
        if (start==end) { val=new_val; return; }  
        if (pos>mid) right->update(pos, new_val);  
        if (pos<=mid) left->update(pos, new_val);
        val = min(left->val, right->val);  
    } 
    
    // Range Minimum Query // O(log N)
    int rangeMinimumQuery(int lower_bound, int upper_bound) {
        //cout<<"Node:"<<start<<" "<<end<<" "<<mid<<" "<<val<<endl;
        //If Query Range Corresponds////////////////
        if (start==lower_bound && end==upper_bound){
            return val;
        }
        //Query Right Tree if range only lies there
        else if (lower_bound > mid){
            return right->rangeMinimumQuery(lower_bound, upper_bound);
        }
        //Query Left Tree if range only lies there
        else if (upper_bound <= mid){
            return left->rangeMinimumQuery(lower_bound, upper_bound);
        }
        //Query both ranges as range spans both trees
        else{
            return min(left->rangeMinimumQuery(lower_bound, mid),right->rangeMinimumQuery(mid+1, upper_bound));
        }
        //End//////////////////////////////////////////
    }
    
} *root;

//struct lazyaddNode{}

int main(){
    int n,q; cin>>n>>q;
    int a[n];for (int i=0;i<n;i++){cin>>a[i];}
    
    root = new node(0, n-1); // creates seg tree of size n
    for (int i=0;i<n;i++){
        root->update(i,a[i]);
    }
    bool newlineFlag = false;
    for (int i=0;i<q;i++){
        //cout<<"Query "<<i<<endl;
        char query; cin>>query;
        if (query == 'q'){
            int l,r; cin>>l>>r;
            int val = root->rangeMinimumQuery(l-1,r-1);
            if (newlineFlag){cout<<endl;}
            else{newlineFlag = true;}
            cout<<val;
        }else if (query == 'u'){
            int x,y; cin>>x>>y;
            root->update(x-1,y);
        }
    }
}

