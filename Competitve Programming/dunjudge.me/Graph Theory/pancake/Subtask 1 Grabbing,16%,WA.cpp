#include <bits/stdc++.h>
#include <fstream>
using namespace std;

//https://dunjudge.me/analysis/submissions/722550/
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int T;cin>>T;
    for(int t=0;t<T;t++){
        int N;cin>>N;
        int A[N];for(int i=0;i<N;i++){cin>>A[i];}
        
        if(t!=0)cout<<"\n";
        int i;for(i=1;i<N;i++){
            if(A[i-1]<=A[i]){cout<<1;break;} //If not descending
        }
        if (i!=N){}
        else{cout<<0;}
    }
    return 0;
}
/*
2
4 4 3 2 1
8 8 7 6 5 4 1 2 3
*/
