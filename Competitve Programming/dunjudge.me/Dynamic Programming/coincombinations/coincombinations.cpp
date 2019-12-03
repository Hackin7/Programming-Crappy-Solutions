#include <bits/stdc++.h>
using namespace std;

int main(){
    int n,v; cin >> n,v;int no[n];
    for (int i=0;i<n;i++){cin>>no[i];}

    int space[n];space[0] = 0;
    for (int i=1;i<n;i++){
        //Formula
        space[i] = space[i-1] + w[i];
        if (w[i] == -1)space[i]=0;
    }

    int maxVal = 0;
    for (int i=0;i<n;i++){
        if (maxVal < space[i])maxVal = space[i];
    }
    cout<<maxVal;
}
