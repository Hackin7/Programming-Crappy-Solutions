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
    
    //Naive solution
    int dist=0;
    for(int i=0;i<M;i++){
        dist += (b[i]-a[i]+1);
    }
    cout<<dist/N+1;
    
    ofstream outfile;
    outfile.open("socdist.out");
    outfile<<dist/N+1;
    outfile.close();
    
    return 0;
}
