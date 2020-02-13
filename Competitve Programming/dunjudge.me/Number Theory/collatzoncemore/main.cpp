#include <bits/stdc++.h>
using namespace std;

bool checkFibo(int n){
    int f = 5*n*n;
    int sq1 = pow(f+4,0.5), sq2 = pow(f-4,0.5);
    if (sq1*sq1 == f+4 || sq2*sq2 == f-4){
        return true;
    }
    return false;
}
int main(){
    int n;cin>>n;
    int count=0;
    while (!checkFibo(n)){
        if (n%2==0){n/=2;}
        else{n = 3*n+1;}
        count++;
    }
    cout<<count;
    return 0;
}
