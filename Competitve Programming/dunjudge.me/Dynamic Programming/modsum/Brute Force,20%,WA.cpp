#include <bits/stdc++.h>
using namespace std;

#define V 1000
int v[V],w[V];

//Creating f
int f(int sum){
    int sumSquare=(sum*sum);
    int sumFour=sumSquare*sumSquare;
    int val=(sumFour+2*sumSquare)%5+1;
    //cout<<val<<",";
    return val;
    
}
//Brute forcing the summation
int ans=0;
void summing(int n, int val=0){
    for(int x=v[n];x<=w[n];x++){
        if(n==0){//At the last loop
            //cout<<val+x<<endl;
            ans += f(val+x);
        }else{
            summing(n-1,val+x);
        }
    }
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;cin>>n;for(int i=0;i<n;i++){cin>>v[i]>>w[i];}
    summing(n-1);
    cout<<ans;
    return 0;
}
