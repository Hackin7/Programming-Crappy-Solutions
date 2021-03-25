#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef pair<int,int> ipair;

bool cmp(ipair a,ipair b){
    if (a.second==b.second)
        return a.first>b.first;//Reverse Order
    return a.second>b.second;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N;cin>>N;
    deque<ipair> coordinates
    int X,Y;for(int i=0;i<N;i++){
        cin>>X>>Y;
        coordinates.push_back(make_pair(X,Y));
    }
    sort(coordinates.begin(),coordinates.end(), cmp);
    for(auto i:coordinates){cout<<i.first<<","<<i.second;}
    return 0;
}
