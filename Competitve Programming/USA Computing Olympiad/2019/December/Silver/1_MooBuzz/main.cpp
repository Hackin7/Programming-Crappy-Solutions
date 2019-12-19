#include <bits/stdc++.h>
#include <fstream>
using namespace std;

long long notPrinted(long long X){return X/3 + X/5 - X/15;}
long long Nfrom(long long X){return X-notPrinted(X);}

int main(){
    ifstream infile; 
    infile.open("moobuzz.in"); 
    long long N; infile>>N;
    infile.close();
    ////Estimation//////////////////////////////////////
    /*Printing from 1...X
     * X/3 numbers are not printed
     * X/5 are not printed
     * Total X/3+X/5-X/15 Numbers are not printed
     * 
     * X>=N
     * X = noPrinted + N
     * 
     * 1. X multiple of 3 & 5:
     * X = (7/15)X + N; N = (8/15)X; X = 15N/8;
     * 2. Generic
     * X =  (X-X%3)/3 + (X-X%5)/5 + (X-X%15)/15 + N;
     * 8X/15 + (X%3)/3 +(X%5)/5 + (X%15)/15 = N;
    */ 
    
    //cout<<"No. Numbers Not Printed:"<<notPrinted<<endl;
    long long X=15*N/8;// Estimate Starting Number
    //int X0 = X-1;int X1 = X+1;
    
    ////Brute Force/////////////////////////////////////
    while (Nfrom(X)!=N){
        if (X < N){X++;}
        else if (X>N){X--;} 
    }
    ////Output//////////////////////////////////////////
    cout<<Nfrom(X)<<" "<<X;
    
    ofstream outfile;
    outfile.open("moobuzz.out");
    outfile<<X;
    outfile.close();
    return 0;
}
