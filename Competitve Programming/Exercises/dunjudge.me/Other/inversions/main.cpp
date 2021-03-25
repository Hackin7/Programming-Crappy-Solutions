#include <bits/stdc++.h>
using namespace std;

//Below here can mix & match
int S = 10000000;
vector<int> ft; // note: this fenwick tree is 1-indexed.
////PUPQ//////////////////////////////////////////////////////
void fenwick_update(int pos, int value) {
    while (pos <= S) {
        //cout<<"Fenwick Updating: "<<pos<<","<<value<<endl;
        ft[pos] += value;
        
        pos += pos&-pos;
    }
}
int fenwick_query(int pos) {
    int sum = 0;
    while (pos) { // while p > 0
        sum += ft[pos];
        //Move to parent node
        pos -= pos&-pos;
    }
    return sum;
}
//////////////////////////////////////////////////////////////

int getInvCount(int* arr,int n){
    int invcount=0;
    //Find maximum element in arr[]
    int maxElement = *max_element(arr,arr+n);
    S = maxElement+1;
    ft.reserve(S);
    fill(ft.begin(),ft.end(),0);
    for(int i=n-1;i>=0;i--){
        // Get count of elements smaller than arr[i]
        invcount+=fenwick_query(arr[i]-1);
        fenwick_update(arr[i],1);
    }
    return invcount;
}

int main(){
    int T; cin>>T;
    for(int i=0;i<T;i++){
        int N;cin>>N;
        int A[N];for(int j=0;j<N;j++){cin>>A[j];}
        
        int ans = getInvCount(A,N);
        if(i!=0){cout<<"\n";}
        cout<<ans;
    }
    return 0;
}
