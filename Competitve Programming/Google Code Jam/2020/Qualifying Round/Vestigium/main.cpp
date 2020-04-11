#include <bits/stdc++.h>
using namespace std;
//AC
int main(){
    int T;cin>>T;
    for(int t=1;t<=T;t++){
        int N;cin>>N;
        int M[N][N];
        int k=0,r=0,c=0;
        
        int repeatRow[N],repeatCol[N];
        memset(repeatRow,0,sizeof(repeatRow));
        memset(repeatCol,0,sizeof(repeatCol));
        
        for(int j=0;j<N;j++){for(int i=0;i<N;i++){
            cin>>M[i][j];
            //In one row, check if there are repeated values
            for(int ii=0;ii<i;ii++){
                if (M[ii][j]==M[i][j]){
                    repeatRow[j]=1;
                }
            }
            //Check column
            //In one col, check if there are repeated values
            for(int jj=0;jj<j;jj++){
                if (M[i][jj]==M[i][j]){
                    repeatCol[i]=1;
                }
            }
            //Trace
            if (i==j){k+=M[i][j];}
        }}
        
        for(int i=0;i<N;i++){r+=repeatRow[i];}
        for(int i=0;i<N;i++){c+=repeatCol[i];}
        
        if (t!=1)cout<<"\n";
        cout<<"Case #"<<t<<": "<<k<<" "<<r<<" "<<c;
    }
}
/*
3
4
1 2 3 4
2 1 4 3
3 4 1 2
4 3 2 1
4
2 2 2 2
2 3 2 3
2 2 2 3
2 2 2 2
3
2 1 3
1 3 2
1 2 3
*/
