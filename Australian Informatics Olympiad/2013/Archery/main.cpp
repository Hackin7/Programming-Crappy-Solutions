#include <bits/stdc++.h>
#include <fstream>
using namespace std;

float totalScore = 1000000;
int main(){
    ifstream infile; 
    infile.open("archin.txt"); 
    ofstream outfile;
    outfile.open("archout.txt");
    int N, A, B;
    infile >> N >> A >> B;
    
    int l=A, h=B;
    if (A == 0){}
    else{
        int diff = abs(A-B)-1;
        l = max(min(A,B) - diff, 1);
        h = min(max(A, B) + diff, N);
    }
    
    outfile << l << " " << h;
    
    infile.close();
    outfile.close();
    return 0;
}
