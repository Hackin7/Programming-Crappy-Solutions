#include <bits/stdc++.h>
#include <fstream>
using namespace std;

double pythagoras(int x, int y, int x1, int y1){
    return sqrt(pow(x-x1,2) + pow(y-y1,2));
}
int main(){
    ifstream infile; 
    infile.open("cocoin.txt"); 
    int ix, iy, id;
    int cx, cy, cd;
    infile >> ix >> iy >> id;
    infile >> cx >> cy >> cd;
    infile.close();
    
    string ans="no";
    if (pythagoras(ix, iy, cx, cy) + min(id,cd) >= max(id, cd) &&
        pythagoras(ix, iy, cx, cy) <= id + cd){
        ans = "yes";}
    cout << ans;
    
    ofstream outfile;
    outfile.open("cocoout.txt");
    outfile << ans;
    outfile.close();
}
