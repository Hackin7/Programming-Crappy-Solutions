#include <bits/stdc++.h>
using namespace std;

typedef pair<int,int> ipair;
typedef tuple<int,int,int,int> group;
int K,n,m,A,B;
int noAttend(int d){
    if (d==0)return 0;
    return A+d*B;
}
int skipEvents(int p,int q){
    return noAttend(q-p+1);//A+(q-p+1)*B;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin>>K>>n>>m>>A>>B;
    //Events from 1..K
    //Happiness
    int V[K+1];for(int i=1;i<=K;i++){cin>>V[i];}
    //Events organised in consecutive n days
    int S[n];for(int i=0;i<n;i++){cin>>S[i];}
    //Want to attend
    int T[m];for(int i=0;i<m;i++){cin>>T[i];}
    
    int ans=-INT_MAX;
    //Stay
    
    
    if (K==1 && m<n){
        ans=V[K]*m;
    }else if (K==1 && n<m){
        ans = V[K]*n+noAttend(m-n);
    }else if(A==0 && B==0){
        ans=0;
        for (int start=0;start<n;start++){
            int localans=0, ti=0;
            for(int i=start;i<n;i++){//Different starting points
                for(int j=ti;j<m;j++){
                    if (S[i]==T[j]){
                        //cout<<"Start"<<start<<":"<<i<<","<<j<<" "<<S[i]<<","<<"\n";
                        localans+=V[T[j]];ti=j;break;//Move to next digit
                    }
                }
            }
            //cout<<localans<<endl;
            ans=max(ans,localans);
        }
    }
    else{
        int i=0,j=m;
        //For every choice, you can skip S, skip T, or go both
        
    }
    cout<<ans;
    return 0;
}
/*
4 7 4 0 0
1 2 3 4
3 1 2 1 4 1 1
1 2 3 4
*/
