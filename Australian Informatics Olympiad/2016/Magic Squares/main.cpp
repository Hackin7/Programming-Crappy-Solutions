#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("magicin.txt"); 
    ofstream outfile;
    outfile.open("magicout.txt");
    
    int k=21;
    int grid[3][3]; //x, y
    infile >> grid[0][0] >> grid[1][0] >> grid[0][1];
    grid[2][0] = k-grid[0][0] - grid[1][0];
    grid[0][2] = k-grid[0][0] - grid[0][1];
    
    //These values must be equal for there to be a middle value
    grid[2][1] = grid[1][0];
    grid[1][2] = grid[0][1];
    grid[1][1] = k-grid[1][0]-grid[1][2];
    
    grid[2][2] = k-grid[2][0]-grid[2][1];
    
    for (int j=0; j<3; j++){
        for (int i=0; i<3; i++){
            outfile<<grid[i][j];
            if (i!=3-1)outfile<<" ";
            else outfile<<endl;
        }
    }
    infile.close();
    outfile.close();
    return 0;
}
