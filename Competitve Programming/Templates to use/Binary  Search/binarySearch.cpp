#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int arr[]={-4,-3,-2,-1,0,1,2};
bool bsCmp(int i){
    return arr[i] > -1;
}
//find the minimum i such that f(i) is true
bool findMin=true;
int binarySearch(int l, int r) { 
    int m;
    while (l <= r) { 
        m = (l+r)/ 2; 
        bool cmp = findMin?bsCmp(m):!bsCmp(m);
        if (cmp){r = m-1;}
        else{l = m + 1;}
    }
    return l; 
} 
int main(){
    //ios_base::sync_with_stdio(false);
    //cin.tie(NULL);
    
    cout<<"Running:";
    //cin>>arr[5];
    cout<<binarySearch(1,5);
    return 0;
}
