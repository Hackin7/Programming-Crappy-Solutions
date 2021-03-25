#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef pair<int,int> ipair;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N,K; cin>>N>>K;int A[N];
    for(int i=0;i<N;i++){cin>>A[i];}
    
    deque<ipair> choices;
    choices.push_back(make_pair(A[0],0));//Start from 0 index added
    while (!choices.empty()){
        ipair currchoice = choices.front();
        int val=currchoice.first,index=currchoice.second;
        cout<<val<<":"<<index<<" "<<choices.size()<<"\n";
        choices.pop_front();
        if (index == N-1 && val%K==0){
            cout<<"Divisible";return 0;
        }else if (index < N-1){            
            //Next choices
            choices.push_back(make_pair(val+A[index+1],index+1));
            choices.push_back(make_pair(val-A[index+1],index+1));
        }
    }
    cout<<"Not divisible";
    return 0;
}
