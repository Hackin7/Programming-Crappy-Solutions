#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int H,W; cin>>H>>W;
    string row="";for(int i=0;i<W-H/2;i++){row+="*";}
    
    for(int i=0;i<H;i++){
        string out="";
        
        for(int j=0;j<min(i,H-i-1);j++){out+=" ";}
        out+=row;
        while(out.length()<(int)W){out+=" ";}
        
        if(i!=0){cout<<"\n";}
        cout<<out;
    }
    return 0;
}
