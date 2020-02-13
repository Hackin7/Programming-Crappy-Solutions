#include <bits/stdc++.h>
#include <fstream>
using namespace std;
//23% TLE
typedef long long ll;
int distance(int x1, int y1, int x2, int y2){
    return abs(x1-x2)+abs(y1-y2);
}
//Shortest distance between 2 points
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;cin>>N;
    int X[N],Y[N];bool subtask_2_3=1;
    for(int i=0;i<N;i++){
        cin>>X[i]>>Y[i];
        subtask_2_3=max(subtask_2_3,!(Y[i]>0));
    }
    
    //int upperX=*max_element(X,X+N),upperY=*max_element(Y,Y+N);
    //int lowerX=0,lowerY=0;
    /*
    int g[N][N];memset(g,-1,sizeof(g));
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if (g[i][j]!=-1){
                g[i][j] = distance(X[i],Y[i],X[j],Y[j]);
                g[j][i] = g[i][j];
            }
        }
    }
    */
    //X-x + X-x2 + x3-X
    if(N==2){cout<<X[0]<<" "<<Y[0];}
    else if (subtask_2_3){
        sort(X,X+N);//Increasing Order
        ll sum=0;
        for(int i=0;i<N;i++){sum+=X[i];}
        
        ll distance=INT_MAX, c=0;
        for(int i=0;i<N;i++){//Those that are smaller
            //cout<<X[i]<<",0 "<<distance<<" ";
            if (i+1<N && X[i]==X[i+1]){}
            else{
                ll ldistance=-X[i]*(N-i)+X[i]*(i) + sum;
                //cout<<ldistance;
                if (ldistance<distance){
                    distance=ldistance;c=i;
                }
            }
            //cout<<"\n";
            sum-=2*X[i];
        }
        cout<<X[c]<<" "<<Y[c];
    }
    else{
        
    }
    return 0;
}
