#include <bits/stdc++.h>
using namespace std;

int main(){
    int n; cin >> n;int w[n];
    for (int i=0;i<n;i++){cin>>w[i];}

    int space[n];space[0] = w[0] == -1 ? 0:w[0];
    for (int i=1;i<n;i++){
        space[i] = space[i-1] + w[i];
        if (w[i] == -1)space[i]=0;
    }

    int maxVal = 0;
    for (int i=0;i<n;i++){
        if (maxVal < space[i])maxVal = space[i];
    }
    cout<<maxVal;
}
