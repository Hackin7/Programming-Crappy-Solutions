#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    int n, m;
    ifstream infile; 
   infile.open("addin.txt"); 
   infile >> n >> m; 
   
    ofstream outfile;
    outfile.open("addout.txt");
    outfile << n+m;
    outfile.close();
}
