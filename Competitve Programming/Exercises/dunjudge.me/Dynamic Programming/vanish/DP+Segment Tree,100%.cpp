#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/724953/
typedef long long ll;

struct node {
    ll start, end, mid, val, lazyadd;
    node *left, *right;

    node(ll _s, ll _e) {
        //Range of values stored
        start = _s; end = _e; mid = (start+end)/2;
        //Min value stored
        val = 0;  lazyadd = 0;
        if (start!=end) {
            left = new node(start,mid);
            right = new node(mid+1,end);
        }
    }

    ll value(){
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

    void addRange(ll lower_bound, ll upper_bound, ll val_to_add){
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
    void update(ll pos, ll new_val) { //position x to new value
        if (start==end) { val=new_val; return; }
        if (pos>mid) right->update(pos, new_val);
        if (pos<=mid) left->update(pos, new_val);
        val = max(left->val, right->val);
    }

    // Range Maximum Query // O(log N)
    ll rangeMaximumQuery(ll lower_bound, ll upper_bound) {
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

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N;cin>>N;
    
    map<ll,ll> count;ll maxel=0;
    ll prev=0;bool subtask3=1;
    for(ll i=0;i<N;i++){
        ll A;cin>>A;
        if(A!=prev+1){subtask3=0;}
        else{prev++;}
        maxel = max(maxel,A);
        count[A]++;
    }
    
    //Subtask 3
    if (subtask3){
        ll ans=0;
        for(ll i=N-1;i>=0;i-=2){
            ans+=i+1;//A[i];
        }
        cout<<ans;
        return 0;
    }
    //Brute forcing all possible combinations
    //Find the max score possible with numbers 
    // only from 1 to max A;
    //ll dp[maxel+1];dp[1]=count[1]*1;
    
    root = new node(0, maxel+1);root->update(1,count[1]*1);
    for(ll i=2;i<=maxel;i++){
        //Choose any prev and current
        ll choose=count[i]*i;ll prev=0;
        prev = root->rangeMaximumQuery(0,i-2);
        root->update(i,max(prev+choose,
                            root->rangeMaximumQuery(i-1,i-1))
                    );
    }
    
    
    cout<<root->rangeMaximumQuery(maxel,maxel);//ans;
    return 0;
}
/*
4
1 2 2 3
*/
