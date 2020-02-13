#include <bits/stdc++.h>
#include <fstream>
using namespace std;

//12%,TLE
//Weight, Value, item, K
typedef tuple<int,int,int,int> group;

const int v = 100001;
int valMemo[v];

int limit(int a,int b){return a>b?b:a;}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int S,N; cin>>S>>N;
    int V[N],W[N],K[N];
    for(int i=0;i<N;i++){
        cin>>V[i]>>W[i]>>K[i];
    }
    /////////////////////////////////
    
    int ans = 0;
    //Start with N=1
    if (N==1){
        /*Choices
        if S<sum(w) take
        else Don't take*/
        ans=V[0]*limit(S/W[0],K[0]);
        cout<<ans;return 0;
    }
    
    deque<group> choices;
    choices.push_back(make_tuple(0,0,0,K[0]));
    while (!choices.empty()){
        group curr = choices.front();
        choices.pop_front();
        
        int weight=get<0>(curr);
        int val=get<1>(curr);
        int i=get<2>(curr);
        int qty=get<3>(curr);
        
        if (weight > S){continue;}//Ignore Choice
        else{ans=max(ans,val);}
        //Choices: 
        //1.Take more of curr item(if available)
        //2.Go to next item
        
        if (qty>0){
            choices.push_back(
                make_tuple(weight+W[i],val+V[i],i,qty-1)
            );
        }
        if(i+1<N){
            choices.push_back(
                make_tuple(weight,val,i+1,K[i+1])
            );
        }
            
    }
    cout<<ans;
    
    return 0;
}
