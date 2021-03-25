#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("socdist.in"); 
    int N,M;infile>>N>>M;
    int a[M],b[M];
    for(int i=0;i<M;i++){infile>>a[i]>>b[i];}
    infile.close();
    
    
    //Find minimum difference between regions
    int minv=INT_MAX;
    for(int i=1;i<M;i++){
        //d[i]=a[i]-b[i-1];
        minv=min(minv, a[i]-b[i-1]-1 );
    }
    
    //Naive solution
    int dist=0;
    for(int i=0;i<M;i++){
        dist += (b[i]-a[i]+1);
    }
    int ans = dist/N+minv;//Min possible value of d
    
    ofstream outfile;
    outfile.open("socdist.out");
    outfile<<ans;
    outfile.close();
    
    return 0;
}
