#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("mixin.txt"); 
    
    int a,b;
    infile >> a >> b; 
    infile.close();
    
    ofstream outfile;
    outfile.open("mixout.txt");
    outfile << a/b;
    if (a%b>0){outfile <<" "<< a%b <<"/"<<b;}
    outfile.close();
}
