#include <bits/stdc++.h>
#include <fstream>
using namespace std;
// 5/13 Solution, TLE
int main(){
    ifstream infile; 
    infile.open("moobuzz.in"); 
    long long N; infile>>N;
    infile.close();
    
    long long ans=1;//Starting Number
    for (long long i=0;i<N;i++){
        while (ans%3==0 || ans%5==0 || ans %15==0){ans++;}
        ans++;//Move on to next number
    }
    ans-=1; //Compensate for extra increment
    cout<<ans;
    
    ofstream outfile;
    outfile.open("moobuzz.out");
    outfile<<ans;
    outfile.close();
    return 0;
}
