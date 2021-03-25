#include <bits/stdc++.h>
using namespace std;


struct node { 
    int start, end, mid, val, lazyadd;
    node *left, *right;  
    
    node(int _s, int _e) {  
        //Range of values stored
        start = _s; end = _e; mid = (start+end)/2;  
        //Min value stored
        val = 0;  lazyadd = 0;
        if (start!=end) {
            left = new node(start,mid);
            right = new node(mid+1,end);  
        }  
    }
    
    int value(){
        if (start==end){
            val += lazyadd;lazyadd = 0;return val;
        }else{
            val += lazyadd;
            // Propagate Lazyadd
            right->lazyadd += lazyadd; 
            left->lazyadd += lazyadd;
            lazyadd = 0;
            return val;
        }
    }
            
    void addRange(int lower_bound, int upper_bound, int val_to_add){
        if (start == lower_bound && end == upper_bound){
            lazyadd += val_to_add;
        }else{ 
            if (lower_bound > mid){
                right->addRange(lower_bound, upper_bound, val_to_add);
            }else if (upper_bound <= mid){
                left->addRange(lower_bound, upper_bound, val_to_add);
            }else{
                left->addRange(lower_bound, mid, val_to_add);
                right->addRange(mid+1, upper_bound, val_to_add);
            }
            val = max(left->value(), right->value());
        }
    }
    
    // Update position to new_value // O(log N)
    void update(int pos, int new_val) { //position x to new value
        if (start==end) { val=new_val; return; }  
        if (pos>mid) right->update(pos, new_val);  
        if (pos<=mid) left->update(pos, new_val);
        val = max(left->val, right->val);  
    } 
    
    // Range Max Query // O(log N)
    int rangeMaxQuery(int lower_bound, int upper_bound) {
        //cout<<"Node:"<<start<<" "<<end<<" "<<mid<<" "<<val<<endl;
        //If Query Range Corresponds////////////////
        if (start==lower_bound && end==upper_bound){
            return value();
        }
        //Query Right Tree if range only lies there
        else if (lower_bound > mid){
            return right->rangeMaxQuery(lower_bound, upper_bound);
        }
        //Query Left Tree if range only lies there
        else if (upper_bound <= mid){
            return left->rangeMaxQuery(lower_bound, upper_bound);
        }
        //Query both ranges as range spans both trees
        else{
            return max(left->rangeMaxQuery(lower_bound, mid),right->rangeMaxQuery(mid+1, upper_bound));
        }
        //End//////////////////////////////////////////
    }
    
} *root;

int main(){
    int n,q; cin>>n;
    int a[n];for (int i=0;i<n;i++){cin>>a[i];}
    
    root = new node(0, n-1); // creates seg tree of size n
    for (int i=0;i<n;i++){
        root->update(i,a[i]);
    }
    cin>>q;
    bool newlineFlag = false;
    for (int i=0;i<q;i++){
        //cout<<"Query "<<i<<endl;
        char query; cin>>query;
        if (query == '0'){
            int l,r; cin>>l>>r;
            int val = root->rangeMaxQuery(l,r);
            if (newlineFlag){cout<<endl;}
            else{newlineFlag = true;}
            cout<<val;
        } else if (query == '1'){
            int x,y,z; cin>>x>>y>>z;
            root->addRange(x-1,y-1,z);
        }
    }
}

