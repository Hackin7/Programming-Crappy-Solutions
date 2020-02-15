#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int rise[1000000];
int countRise(ll H[],ll xx,ll y, ll threshold){
    //cout<<y<<endl;
    if (y==0){rise[y]=0;}//Nothing before it
    else if (rise[y]==-1){
        int localcount=0;
        
        for(int x=y-1;x>=xx;x--){
            if (H[x]<H[y] &&  threshold > H[x]){
                //Dont do anything
            }else if(H[x]<H[y] && threshold <= H[x]){
                localcount++;
            }else if(H[x]<H[y] && threshold <= H[x]){
                //cout<<y<<"["<<H[y]<<"] count "<<threshold<<"<="<<x<<"["<<H[x]<<endl;
                localcount += countRise(H,xx,x,threshold)+1;
                threshold = H[x];
            }
        }
        rise[y]=localcount;
    }
    return rise[y];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;cin>>n;
    ll H[n];for(int i=0;i<n;i++){cin>>H[i];}
    
    memset(rise,-1,sizeof(rise));//index by y value
    
    ll count=0;
    
    if (*max_element(H,H+n)==1){
        for(int i=0;i<n;i++){
        }
    }
    for(int z=2;z<n;z++){//Count backwards
        int localcount = 0, prevZ=0;
        /*
        if (memo.count(H[z])>0){
            prevZ=spaces[H[z]].back()+1;
            localcount+=memo[H[z]];
        }*/
        
        //Find remaining in range
        for(int y=z-1;y>prevZ;y--){
            if (H[y]>H[z]){
                //Overlapping subproblem here
                localcount+=countRise(H,prevZ,y,0);
            }
        }
        
        memo[H[z]]=localcount;
        spaces[H[z]].push_back(z);
        count+=memo[H[z]];
    }
    cout<<count;
    return 0;
}
/*
5
0 1 1 0 1
* 2

6
500 20 900 0 900 70
* 7

8
500 10 20 20 900 0 900 70
* 
*/
