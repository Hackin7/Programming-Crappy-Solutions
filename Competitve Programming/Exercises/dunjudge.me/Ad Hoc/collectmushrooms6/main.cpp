#include <bits/stdc++.h>
using namespace std;

//60%
typedef pair<int,int> ipair;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int R,C,D,K;cin>>R>>C>>D>>K;
    
    deque<ipair> mushrooms;
    deque<ipair> sprinklers;
    char layout[R][C];
    for(int j=0;j<R;j++){for(int i=0;i<C;i++){
        cin>>layout[j][i];
        if(layout[j][i]=='M'){
            mushrooms.push_back(make_pair(i,j));
        }else if(layout[j][i]=='S'){
            sprinklers.push_back(make_pair(i,j));
        }
    }}
    
    int ans=0;
    int counters[mushrooms.size()];
    memset(counters,0,sizeof(counters));
    for(ipair s:sprinklers){
        //cout<<s.first<<","<<s.second<<endl;
        for(int i=0;i<(int)mushrooms.size();i++){
            auto m=mushrooms[i];
            //cout<<" "<<m.first<<","<<m.second;
            if(max(abs(m.first-s.first),
               abs(m.second-s.second))<=D){
                //cout<<" +";
                counters[i]++;
                if(counters[i]==K){ans++;}
            }
            //cout<<endl;
        }
    }
    cout<<ans;
    
    return 0;
}
/*
5 5 1 1
....M
.M...
..S..
.S...
...M.
*/
