#include <bits/stdc++.h>
using namespace std;
typedef unsigned long long ull;
#define modval 1000000007
//ull Aval[100000000];
int power(ull x, ull y, ull p) 
{ 
    int res = 1;      // Initialize result 
  
    x = x % p;  // Update x if it is more than or  
                // equal to p 
  
    while (y > 0) 
    { 
        // If y is odd, multiply x with result 
        if (y & 1) 
            res = (res*x) % p; 
  
        // y must be even now 
        y = y>>1; // y = y/2 
        x = (x*x) % p;   
    } 
    return res; 
}
ull N,A,X,Y;
ull fA(ull i){
    if(i==1)return A;
    //if (Aval[i]!=modval+1){return Aval[i];}
    ull Aval=power(X*fA(i-1),Y,modval);
    return Aval;
}
ull ssqsmsssq(){
    ull ans=0;
    for(ull i=0;i<N;i++){
        for(ull j=0;j<N;j++){
            ull val =fA(i)+fA(j);
            ans+= val*val%modval;
    }}
    for(ull i=0;i<N;i++){
        ull val=fA(i);
        ans-=val*val;
    }
    return ans;
}
int main(){
    //memset(Aval,modval+1,sizeof(Aval));
    cin>>N>>A>>X>>Y;
    cout<<ssqsmsssq();
    return 0;
}
