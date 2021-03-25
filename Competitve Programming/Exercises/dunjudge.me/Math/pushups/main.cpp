#include <bits/stdc++.h>
using namespace std;

///////////////////////////////////////////////////////
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
    
    // Range Minimum Query // O(log N)
    int rangeMaximumQuery(int lower_bound, int upper_bound) {
        //cout<<"Node:"<<start<<" "<<end<<" "<<mid<<" "<<val<<endl;
        //If Query Range Corresponds////////////////
        if (start==lower_bound && end==upper_bound){
            return value();
        }
        //Query Right Tree if range only lies there
        else if (lower_bound > mid){
            return right->rangeMaximumQuery(lower_bound, upper_bound);
        }
        //Query Left Tree if range only lies there
        else if (upper_bound <= mid){
            return left->rangeMaximumQuery(lower_bound, upper_bound);
        }
        //Query both ranges as range spans both trees
        else{
            return max(left->rangeMaximumQuery(lower_bound, mid),right->rangeMaximumQuery(mid+1, upper_bound));
        }
        //End//////////////////////////////////////////
    }
    
} *root;



///////////////////////////////////////////////////////
const int NN = 1000000;
int pushupMemo[NN+1];//1-indexed

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    //memset(pushupMemo,0,sizeof(pushupMemo));
    int T; cin>>T;
    
    int Nl=0;int N[T];
    for(int i=0;i<T;i++){cin>>N[i];Nl=max(Nl,N[i]);}
    root = new node(0, Nl+1);
    for(int i=1;i<=Nl;i++){
        for(int j=1;i*j<=Nl;j++){//<Multiple
            int index=i*j;
            root->addRange(index,index,i);
            //pushupMemo[index]+=i;
            //root->update(index,pushupMemo[index]);
        }
    }
    
    for(int i=0;i<T;i++){
        if (i!=0)cout<<"\n";
        cout<<root->rangeMaximumQuery(1,N[i]);
    }
    return 0;
}
