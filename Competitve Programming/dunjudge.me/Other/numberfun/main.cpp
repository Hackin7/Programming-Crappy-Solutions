#include <bits/stdc++.h>
using namespace std;

int main(){
    int N;cin>>N;
    int A[N];for(int i=0;i<N;i++){cin>>A[i];}
    for(int i=0;i<N;i++){
        int ops[3]//Steps->Operations
        ops[0]=0;ops[1]=0;ops[2]=0;
        int X[3];X[0]=A[i];X[2]=A[i];X[3]=A[i];
        while (*min_element(X,X+3)!=0){
            int a=0,b=0,c=0;
            for(int k=1;k<2){
                if(ops[k]<X[a]&&X[k]%2==0){a=k;}
                if(ops[k]<X[b]&&X[k]%3==0){b=k;}
                
            }
            if (a%2==0){
                
                X[0]/=2;ops[0]++;
            }
            if (X[1]%3==0){X[1]/=3;ops[1]++;}
            X[2]-=1;ops[2]++;
        }
        cout<<*min_element(ops,ops+3)
    }
    return 0;
}
