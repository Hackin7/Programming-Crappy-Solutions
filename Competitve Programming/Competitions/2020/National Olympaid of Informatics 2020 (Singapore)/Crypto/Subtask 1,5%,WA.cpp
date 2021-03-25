#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define M 1000000007

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N; cin>>N;
    int A[N]; for(int i=0;i<N;i++){cin>>A[i];}
    
    //Subtask 1
    if (N==2){
        cout<< (A[0]>A[1]?2:1);
    }else{ //Subtask 3
        bool inc=1,dec=1;
        for(int i=1;i<N;i++){
            if(A[i-1]<A[i]){dec=0;}
            else if (A[i-1]>A[i]){inc=0;}
            else{dec=0;inc=0;}
        }
        if (inc){
            cout<<1;
        }else if(dec){
            //ans = N!
            int ans = 1;
            for(int i=2;i<=N;i++){
                ans=(ans*i)%M;}
            cout<<ans;
        }
    }
    
    return 0;
}
