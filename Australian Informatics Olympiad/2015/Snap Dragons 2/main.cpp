#include <bits/stdc++.h>
#include <fstream>
using namespace std;

//Manhatten
int dist(int a, int b, int c, int d){
    return abs(a-b)+abs(c-d);
}

int main(){
    ifstream infile; 
    infile.open("snapin.txt"); 
    ofstream outfile;
    outfile.open("snapout.txt");
    
    int R, C, rr, cr, rs, cs;
    infile >> R >> C >> rr >> cr >> rs >> cs;
    //Subtask 1
    if (R == 2 && C == 2){
        if (dist(rr, rs, cr, cs) == 2){outfile << "SCARLET";}
        else {outfile << "ROSE";} //Rose will win as she starts first
    }
    //Subtask 2
    else if (C == 1){
        int d = abs(rr-rs);
        if ((d+1) % 2 == 0){outfile << "ROSE";}//Even distance between them
        else {outfile << "SCARLET";}
    }
    //Subtasks 3 & 4
    else{
        int d = dist(rr, rs, cr, cs);
        //int rdist = abs(rr-rs);
        //int cdist = abs(cr-cs);
        if ((d+1) % 2 == 0){outfile << "ROSE";}
        else {outfile << "SCARLET";}
    }
    
    
    infile.close();
    outfile.close();
    return 0;
}
