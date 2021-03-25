#include <bits/stdc++.h>
#include <fstream>
using namespace std;
//Check has number as substring
int hasNoSubstring(int x, int y){
    string S=to_string(x),s=to_string(y);
    for(int i=0;i<(int)(S.length()-s.length()+1);i++){
        bool match=0;
        for(int c=0;c<(int)s.length();c++){
            if(S[i+c]!=s[c]){break;}
            if(c==(int)s.length()-1){match=1;}
        }
        if (match)return 0;
    }
    return 1;
}
#define V 100000
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    //Generation of lucky numbers
    int dp[V];dp[0]=0;dp[1]=1;
    map<int,int> fromlucky;
    int c=1;
    for(int i=1;i<V;i++){
        while(!(hasNoSubstring(c,4)&&hasNoSubstring(c,13))){
            c++;
        }
        dp[i]=c;fromlucky[c]=i;
        //cout<<i<<" "<<dp[i]<<" "<<fromlucky[c]<<endl;
        c++;
    }
    
    int N;cin>>N;
    for(int n=0;n<N;n++){
        int T,X;cin>>T>>X;
        if (n!=0)cout<<"\n";
        if (T==2){cout<<dp[X];}
        else if (T==1){
            if (hasNoSubstring(X,4)&&hasNoSubstring(X,13))
                cout<<fromlucky[X];
            else cout<<-1;
        }
        
    }
    return 0;
}
