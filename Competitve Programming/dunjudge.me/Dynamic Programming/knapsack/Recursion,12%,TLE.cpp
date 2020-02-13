#include <bits/stdc++.h>
using namespace std;


typedef tuple<int,int,int> group;

int limit(int a,int b){return a>b?b:a;}

const int v = 100001;
int valMemo[v];
int bestval(int V[],int W[],int K[],int i,int S, int qty){
    //cout<<i<<":"<<S<<":"<<qty;
    int ans=0;
    //if (qty == K[i] && valMemo[i]!=-1){return valMemo[i];}else 
    if (S<=0){
        ans=0;
    }else{
        int choice1=0,choice2=0;
        if (qty>=1 && S-W[i]>=0){
            choice1=V[i]+bestval(V,W,K,i,S-W[i],qty-1);
        }
        if (i>0){
            choice2 = bestval(V,W,K,i-1,S,K[i-1]);
            //cout<<"down";
        }
        ans = max(choice1,choice2);
    }
    //cout<<"\n";
    if (qty==K[i]){valMemo[i]=ans;}
    return ans;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int S,N; cin>>S>>N;
    int V[N],W[N],K[N];
    for(int i=0;i<N;i++){
        cin>>V[i]>>W[i]>>K[i];
    }
    /////////////////////////////////
    memset(valMemo,-1,sizeof(valMemo));
    
    int ans = 0;
    ans=bestval(V,W,K,N-1,S,K[N-1]);
    //for(int i=0;i<N;i++){cout<<valMemo[i]<<",";}
    cout<<ans;
    
    return 0;
}
