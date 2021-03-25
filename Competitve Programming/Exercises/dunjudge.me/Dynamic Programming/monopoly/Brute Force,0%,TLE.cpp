#include <bits/stdc++.h>
using namespace std;

int M=1000000007;

int pos(int N,char S,int X){
    int m=0;
    switch(S){
        case 'A':m=0;break;
        case 'B':m=1;break;
        case 'C':m=2;break;
        case 'D':m=3;break;
    }
    //Mod by maxpos
    int maxpos = (N-1)*4;
    return (m*(N-1)+X)%maxpos;
}


int reach(int pos,int end){
    int ways = 0;
    if (pos>end){
        ways=0;
    }else if (pos==end){
        ways=1;
    }else{
        for(int i=1;i<=6;i++){
            ways+=reach(pos+i,end);
        }
    }
    return ways;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int TC; cin>>TC;
    for(int t=0;t<TC;t++){
        int N,X;char S;cin>>N>>S>>X;
        int p = pos(N,S,X);
        //cout<<p<<","<<maxpos<<endl;
        
        if(t!=0)cout<<"\n";
        cout<<reach(0,p);
    }
    return 0;
}
