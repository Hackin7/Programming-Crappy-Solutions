#include <bits/stdc++.h>
using namespace std;

int main() {
    int n,m;cin>>n>>m;
    if(n==1){
        int mapp[m];
        for(int i=0;i<m;i++){
            cin>>mapp[i];}
        //Precomputation
        int zeros[m];zeros[0]=(mapp[0]==0);
        int banas[m];banas[0]=(mapp[0]==1);
        for(int i=1;i<m;i++){
            zeros[i]=zeros[i-1]+(mapp[i]==0);
            banas[i]=banas[i-1]+(mapp[i]==1);
        }
        //DP
        int cost[m],ans=INT_MAX;
        cost[0]=zeros[0]+banas[m-1]-banas[0];
        ans=cost[0];
        for(int i=0;i<m;i++){//pivot
            int pastz = i==0? 0:zeros[i-1];
            int pastb = i==0? 0:banas[i-1];
            for(int j=i+1;j<m;j++){
                cost[j]=zeros[j]-pastz+banas[m-1] - (banas[j]-pastb);
                ans=min(ans,cost[j]);
            }
        }
        cout<<ans;
    }else{
        int mapp[m][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                cin>>mapp[i][j];}}
        //Precomputation        
        int zeros[m][n];
        for(int j=0;j<n;j++){
            zeros[0][j]=(mapp[0][j]==0);}
        int banas[m][n];
        for(int j=0;j<n;j++){
            banas[0][j]=(mapp[0][j]==1);}
                    
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                zeros[i][j]=zeros[i-1][j]+
                         (mapp[i][j]==0);
                banas[i][j]=banas[i-1][j]+
                         (mapp[i][j]==1);
            }
        }
        for(int j=1;j<n;j++){
            for(int i=0;i<m;i++){
                zeros[i][j]+=zeros[i][j-1];
                banas[i][j]+=banas[i][j-1];
            }
        }
        /*
        cout<<endl;
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){cout<<zeros[i][j]<<" ";}cout<<endl;
        }
        
        cout<<endl;
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){cout<<banas[i][j]<<" ";}cout<<endl;
        }*/

        //DP
        int cost,ans=INT_MAX;
        cost=zeros[0][0]+
                   banas[m-1][n-1]-banas[0][0];
        ans=cost;
        
        for(int i1=0;i1<m;i1++){//pivot
            for(int j1=0;j1<n;j1++){
                for(int i2=i1;i2<m;i2++){//end
                for(int j2=j1;j2<n;j2++){
                    int zsum,bsum;
                    if (i1==0&&j1==0){ //Corner
                        //cout<<"c";
                        zsum=zeros[i2][j2];
                        bsum=banas[i2][j2];
                    }else if (i1==0){
                        //cout<<"x";
                        zsum=zeros[i2][j2]-zeros[i2][j1-1];
                        bsum=banas[i2][j2]-banas[i2][j1-1];
                    }else if (j1==0){
                        //cout<<"y";
                        zsum=zeros[i2][j2]-zeros[i1-1][j2];
                        bsum=banas[i2][j2]-banas[i1-1][j2];
                    }else{
                        zsum = zeros[i2][j2]-zeros[i2][j1-1]-zeros[i1-1][j2]+zeros[i1-1][j1-1];
                        bsum = banas[i2][j2]-banas[i2][j1-1]-banas[i1-1][j2]+banas[i1-1][j1-1];
                    }
                    cost=zsum+banas[m-1][n-1]-bsum;
                    //cout<<i1<<","<<j1<<"->"<<i2<<","<<j2<<":  "<<zsum<<"+"<<banas[m-1][n-1]-bsum<<"="<<cost<<" "<<banas[i2][j2]<<endl;
                    ans=min(ans,cost);
                }}
            }
        }
        cout<<ans;
        
    }
    return 0;
}
/*
5 7
0 0 1 0 0 1 0
0 1 1 1 1 1 0
0 1 1 0 0 1 0
0 1 1 1 1 1 0
0 0 1 0 0 1 0
*/
