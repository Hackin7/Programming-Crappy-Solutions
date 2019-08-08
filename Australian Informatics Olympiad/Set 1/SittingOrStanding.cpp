#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("sitin.txt"); 
    
    int r, s, n;
    infile >> r >> s >> n; 
    infile.close();

    ofstream outfile;
    outfile.open("sitout.txt");
    if (r * s > n){outfile << n <<" "<< 0;}
    else {outfile << r*s <<" "<< n-r*s;}
    outfile.close();
}
