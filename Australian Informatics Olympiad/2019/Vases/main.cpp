#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("vasesin.txt"); 
    ofstream outfile;
    outfile.open("vasesout.txt");

    int N;infile >> N;
    int minf = (N-3)/3, f1 = 0, f2 = 0, f3 = 0;
    if (minf != 0){
        f1 = minf;f2 = minf+1;f3 = minf+2+ (N-3)%3;
    }
    outfile << f1 <<" " << f2 << " " << f3;
    cout << f1 <<" " << f2 << " " << f3;
    
    infile.close();
    outfile.close();
    return 0;
}
