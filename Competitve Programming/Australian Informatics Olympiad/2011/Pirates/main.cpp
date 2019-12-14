#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("piratein.txt"); 
    ofstream outfile;
    outfile.open("pirateout.txt");
    
    int L, X, Y;
    infile >> L >> X >> Y;
    int way1 = X+Y, way2 = 2*L - X - Y;
    outfile << min(way1, way2);

    infile.close();
    outfile.close();
    return 0;
}
