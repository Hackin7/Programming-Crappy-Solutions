#include <bits/stdc++.h>
#include <fstream>
using namespace std;

//Discretisation, only the relative sizes of the pancakes matter
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int T;cin>>T;
    for(int t=0;t<T;t++){
        int N;cin>>N;
        int A[N];for(int i=0;i<N;i++){cin>>A[i];}
        
        
        int state=0;
        int i;for(i=1;i<N;i++){
            if(A[i-1]<=A[i]&&state==0){state=1;}
            else if(A[i-1]>A[i]&&state==1){state=2;}
        }
        if(t!=0)cout<<"\n";
        cout<<state;
    }
    return 0;
}
/*
3
4 4 3 2 1
8 8 7 6 5 4 1 2 3
5 5 1 2 4 3
*/
