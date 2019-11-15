#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("ninjain.txt"); 
    ofstream outfile;
    outfile.open("ninjaout.txt");
    int N, K;infile >> N >> K;
    int ans = N-(N /(K+1));
    if (N % (K+1) >0) ans--;
    
    cout<<ans;outfile<<ans;

    infile.close();
    outfile.close();
    return 0;
}
