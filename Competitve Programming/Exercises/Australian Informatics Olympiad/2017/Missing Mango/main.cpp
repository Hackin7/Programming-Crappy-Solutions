#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("manin.txt"); 
    int ix, cx, id, cd;
    infile >> ix >> cx >> id >> cd;
    infile.close();

    int pos[4] = {ix-id, ix+id, cx-cd, cx+cd};
    int ans = 0;
    if (pos[0] == pos[2]){
        ans = pos[0];}
    if (pos[0] == pos[3]){
        ans = pos[0];}
    if (pos[1] == pos[2]){
        ans = pos[1];}
    if (pos[1] == pos[3]){
        ans = pos[1];}
    
    cout << ans;
    
    ofstream outfile;
    outfile.open("manout.txt");
    outfile << ans;
    outfile.close();
}
