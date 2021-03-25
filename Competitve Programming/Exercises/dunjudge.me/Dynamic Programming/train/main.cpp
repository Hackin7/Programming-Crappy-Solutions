#include <bits/stdc++.h>
using namespace std;
int main() {
    int N;cin>>N;
    int H[N+2];H[0]=1000000000;H[N+1]=0;for(int i=1;i<=N;i++){cin>>H[i];}
    pair<int,int> fmem[N+2];fill(fmem,fmem+N+2,make_pair(INT_MAX,0));fmem[0]=make_pair(0,0);
    for(int i=0;i<=N+2;i++){//Start point
        //cout<<i<<"]";
        for(int j=i+1;j<N+2;j++){//End
            int dist = j-i;
            //cout<<j<<","<<fmem[j].first<<","<<fmem[i].first<<"+"<<dist*dist<<"="<<fmem[i].first+dist*dist<<" ";
            if (fmem[j].second<N && fmem[j].first > fmem[i].second+dist*dist){
                fmem[j].first = fmem[i].second+dist*dist;
                fmem[j].second++;
            }
        }
        //cout<<endl;
    }
    //for(int i=0;i<N+2;i++){cout<<fmem[i]<<" ";}cout<<endl;
    cout<<fmem[N+1].first;
}
