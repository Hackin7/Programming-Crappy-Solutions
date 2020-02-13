#include <bits/stdc++.h>
using namespace std;
int charval(char c){
    int val1 = c-'a'+1;
    int val2 = c-'A'+1; 
    return val1<0 ? val2:val1;
}
int chardiff(char a,char b,int diff){
    return charval(a)-charval(b)==diff;
}
typedef unsigned long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    string A;getline(cin,A);
    ll N; N=A.length();
    ll lis[1000000]; memset(lis,0,sizeof(lis));
    ll ans=0;
    for (int i=N-1; i>=0; i--) {
        if (charval(A[i])==26){lis[i]=1;}
        
        for (int j=0;j<i;++j){ //Jump From
            if ( chardiff(A[i],A[j],1) ){
                lis[j]+=lis[i];}
        }
        if (charval(A[i])==1){ans+=lis[i];}
    }
    cout<< ans;
    return 0;
}
