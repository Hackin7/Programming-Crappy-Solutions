#include <bits/stdc++.h>
#include <fstream>
using namespace std;
typedef int ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    ll N,S,K;cin>>N>>S>>K;
    ll d[N-1];for(ll i=0;i<N-1;i++){cin>>d[i];}
    ll v[N];for(ll i=0;i<N;i++){cin>>v[i];}

    //When S==1, only 1 spaceshield
    ll T=S;
    deque<ll> deploy;

    if (S==1){ //Subtask 2
        //When d==1, Deploy in the middle module
        //Find largest consecutive subsequence
        ll sum=0;
        int range = max(N,(2*K+1));
        ll maxsum=0,maxi=range/2;
        for(ll i=0;i<range;i++){sum+=v[i];}
        for(ll i=1;i<N-range;i++){
            //cout<<sum<<":"<<i<<" ";
            sum -= v[i-1];
            sum += v[range+i-1];
            if(maxsum<sum){
                sum = maxsum;
                maxi = (i-1+range+i-1)/2;
            }
        }
        deploy.push_back(maxi);
    }
    ////Output//////////////////////////////////
    cout<<T<<"\n";
    bool flag=false;
    for(auto i:deploy){
        if(flag){cout<<" ";}else{flag=true;}
        cout<<i;
    }
    return 0;
}

/*Other Test Data
//Subtask 2
12 1 2
1 1 1 1 1 1 1 1 1 1 1
1 2 3 4 5 6 6 5 4 3 2 1
* 6

12 1 2
1 1 1 1 1 1 1 1 1 1 1
1 2 5 4 3 2 1 1 1 1 1 1
* 3
*/
