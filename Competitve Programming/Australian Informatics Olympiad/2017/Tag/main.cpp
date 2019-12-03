#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("tagin.txt"); 
    int n, m; infile >> n >> m;

    //1 is red, -1 is blue
    int players[n+1];
    memset(players, 0, sizeof(players));
    players[1] = 1; players[2] = -1;
    int r=1, b=1;
    for (int i=0; i<m; i++){
        int x, y; infile >> x >> y;
        //cout<<y<<":"<<players[y]<<"=x:"<<players[x]<<endl;
        players[y] = players[x];
        if (players[y] == 1){r++;}
        else if (players[y] == -1){b++;}
    }
    infile.close();
    
    
    cout<<r<<" "<<b;
    ofstream outfile;
    outfile.open("tagout.txt");
    outfile << r <<" "<< b;
    outfile.close();
}
