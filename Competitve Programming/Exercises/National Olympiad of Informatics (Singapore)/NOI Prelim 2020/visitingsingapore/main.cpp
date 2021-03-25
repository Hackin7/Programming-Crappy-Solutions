#include <bits/stdc++.h>
using namespace std;

typedef pair<int,int> ipair;

int K,n,m,A,B;
int V[1010];int S[5010];int T[5010];

int hLoss(int d){return A+d*B;}
int hLoss(int p,int q){return 0;}
//DP
int H[5010][5010];//DP states
//Happiness until s and t events in sequence

int happiness(int s, int t){ 
    //if (S[s]==T[t]){cout<<s<<","<<t<<endl;}
    // Base case
    if (s<0 || t<0){return 0;}
    else if(H[s][t]!=-1){return H[s][t];}
    // Recursion
    else{
        int match2 = happiness(s-1,t)-B;
        int match3 = happiness(s,t-1)-B;
        //cout<<s<<","<<t<<endl;
        //printf("%d %d %d\n",match1,match2, match3);
        H[s][t] = max(match2, match3);
        
        int match1=happiness(s-1,t-1);
        if (S[s]==T[t]){
            match1+=V[T[t]];
        }else{
            match1=INT_MIN; //loss
        }
        H[s][t]=max(H[s][t],match1);
    }
    return H[s][t];
}
int main(){
    cin>>K>>n>>m>>A>>B;
    for(int i=1;i<=K;i++){cin>>V[i];}
    for(int i=0;i<n;i++){cin>>S[i];}
    for(int i=0;i<m;i++){cin>>T[i];}
    
    // Subtask 1 (4%): K==1 (Only 1 event), m < n 
    if (K==1 && m < n){
        cout<<V[1]*m;
    }
    // Subtask 2: K==1 (Only 1 event), n < m 
    else if (K==1 && n < m){
        int reduction = (A + (m-n)*B);
        cout<< (V[1]*n + reduction);
    }
    //Subtask 5: A == 0
    else {
       //DP state
       memset(H,-1,sizeof(H));
       cout<<happiness(n-1,m-1);
    }
    /*cout<<endl;
    for(int s=0;s<n;s++){
        for(int t=0;t<m;t++){
            cout<<H[s][t]<<" ";
        }cout<<endl;
    }*/
    
}

/*
1 5 3 -5 -4
10
1 1 1 1 1
1 1 1
 
1 3 5 -10 -5
10
1 1 1
1 1 1 1 1

4 7 4 0 0
1 2 3 4
3 1 2 1 4 1 1
1 2 3 4

6 10 6 0 0
1 2 3 4 5 6
3 1 5 2 6 1 5 1 1 4
1 2 3 4 5 6
* 
4 8 4 0 -3
1 2 3 4
3 1 2 1 1 4 1 1
1 2 3 4
*/
