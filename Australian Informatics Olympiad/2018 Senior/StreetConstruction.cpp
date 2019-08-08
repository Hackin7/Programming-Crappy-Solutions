#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("streetin.txt"); 
    
    int n, k;
    infile >> n >> k;
    infile.close();

    double parts = k+1;
    double spaceleft = n-k;
    double calc = spaceleft / parts;
    
    int ans = ceil(calc);
    cout<<ans;
    
    ofstream outfile;
    outfile.open("streetout.txt");
    outfile << ans;
    outfile.close();
}
