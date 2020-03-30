#include <bits/stdc++.h>
using namespace std;

int main() {
    string a,b; cin>>a>>b;
    //pivot,length
    int memo[a.length()][b.length()];
    int l=0;
    for(int i=0;i<(int)a.length();i++){
        for(int j=0;j<(int)b.length();j++){
            if(a[i]==b[j]){
                memo[i][j]=1;
                if (i-1>=0 && j-1>=0 && 
                    memo[i-1][j-1]>0){
                    memo[i][j]+=memo[i-1][j-1];
                }
                l=max(l,memo[i][j]);
            }
            else{memo[i][j]=0;}
        }
    }
    /*
    for(int i=0;i<(int)a.length();i++){
        for(int j=0;j<(int)b.length();j++){
            cout<<memo[i][j]<<" ";
        }cout<<endl;
    }
    */
    cout<<l;
}
