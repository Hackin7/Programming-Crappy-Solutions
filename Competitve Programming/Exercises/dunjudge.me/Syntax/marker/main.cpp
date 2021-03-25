#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;cin>>n;
    int Spongebob=0,Patrick=0;
    for(int i=0;i<2*n;i++){
        char o,p;
        int a,b,c;
        cin>>a>>o>>b>>p>>c;
        
        int output=a+b;
        if (o=='-'){output=a-b;}
        
        if (output==c && i<n){Spongebob++;}
        else if (output==c && i>=n){Patrick++;}
    }
    cout<<"Spongebob: "<<Spongebob<<"\n"<<"Patrick: "<<Patrick;
    return 0;
}
