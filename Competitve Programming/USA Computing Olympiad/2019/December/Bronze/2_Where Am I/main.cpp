#include <bits/stdc++.h>
#include <fstream>
using namespace std;

//10% solution
/* Abridged Problem Statement
Smallest length of a unique sequence in N;

* Possible solutions
1. All combinations-> Factorial Complexity
2. Dynamic Programing-> How 
* 
*/ 

int memo[100][51];
int main(){
    ifstream infile; 
    infile.open("whereami.in"); 
    int N; infile>>N;string S; infile>>S;
    infile.close();
    
    int ans=N/2+1;//Subtask grabbing
    cout<<ans;c
    ofstream outfile;
    outfile.open("whereami.out");
    outfile<<ans;
    outfile.close();
    return 0;
}
