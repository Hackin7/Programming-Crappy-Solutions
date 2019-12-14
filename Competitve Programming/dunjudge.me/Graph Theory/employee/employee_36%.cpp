#include <bits/stdc++.h>
using namespace std;

int adj[1000000];
//36%, TLE
int main(){
    int n; cin>>n;

    int parent = 0;
    adj[parent]=0; for (int i=1;i<n;i++){cin>>adj[i];}

    int height = 0;
    for (int i=1;i<n;i++){
        int node = i, localHeight = 1;// Count existing node
        while (node != parent){node = adj[node];localHeight++;}
        height = max(height, localHeight);
    }
    cout<<height;
}
