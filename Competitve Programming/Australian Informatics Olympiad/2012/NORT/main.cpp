#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("nortin.txt"); 
    ofstream outfile;
    outfile.open("nortout.txt");

    int H, W; infile>>H>>W;
    
    int ans = H*W-1;
    if (H %2 == 0 || W % 2 == 0)ans = H*W;
    
    outfile << ans;
    infile.close();
    outfile.close();
    return 0;
}
