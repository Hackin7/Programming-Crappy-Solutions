#include <bits/stdc++.h>
using namespace std;
//60%
int unit(char i){
    switch(i){
        case 'o':return 100;
        case 'e':return 10;
        case 'g':return 1;
        case 'a':return 0;
        case 'b':return -1;
        case 'i':return -10;
        case 'u':return -100;
        default:return 0;
    }
}
int performance(string p){
    int ans=0;
    
    int n=p.length();
    //int memo[n+1][n];//Length,End Pos
    int memo[n+1];//End Pos
    memset(memo,0,sizeof(memo));
    //When the length is 1
    for(int i=0;i<n;i++){
        memo[i]=unit(p[i]);
        ans=max(ans,memo[i]);
        //cout<<memo[i]<<" ";
    }//cout<<endl;
    for(int l=2;l<=n;l++){//Length of string
        for(int i=n-1;i>=l-1;i--){//End Pos
            memo[i] = memo[i-1]+unit(p[i]);
            ans=max(ans,memo[i]);
        }
        memo[l-2]=0;
        //for(int i=0;i<n;i++){cout<<memo[i]<<" ";}cout<<endl;
    }
    
    return ans;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    deque<string> machines;
    char input;string p;
    while(cin>>input){
        if(input==','){
            machines.push_back(p);p="";
        }else if (input=='.'){
            machines.push_back(p);
            break;
        }else if (input!=' '&&input!='\n'){
            p+=input;
        }
    }
    
    bool flag=false;
    for (auto i:machines){
        if(flag){cout<<"\n";}else{flag=true;}
        cout<<performance(i);
    }
    return 0;
}
/*
bbaab b,
ggbgg,
ggbgg buoeg,
aaaag ggeeo,
ggggg ggaaa aaggg ggggg
ggggg gaaag gaaag aagaa
ggggg ggggg ggggg ggggg.
*/
