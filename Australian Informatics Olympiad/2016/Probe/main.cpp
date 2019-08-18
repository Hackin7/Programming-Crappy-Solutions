#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("probein.txt"); 
    
    ofstream outfile;
    outfile.open("probeout.txt");
    
    int R, C;
    infile >> R >> C;
    int rp, cp; infile >> rp >> cp;
    int ri, ci; infile >> ri >> ci;
    
    long Q; infile >> Q;
    int qr, qc;
    for (long i=0; i<Q; i++){
        infile >> qr >> qc;
        
        int toP, toF;
        //The manhatten distance thing is all me though
        
        //Got Help From ONLINE https://github.com/zerohzz/AIO-practice-questions/blob/master/Probe.py
        //If square
        if (abs(rp-ri) == abs(cp-ci)){
            //Only need to check for boundary, do less calculations
            toP = max(abs(rp-qr),abs(cp-qc));
            toF = max(abs(ri-qr),abs(ci-qc));
        }else{
            //Calculate only when necessary
            toF = (abs(qr-ri) + abs(qc-ci));
            toP = (abs(qr-rp) + abs(qc-cp));
        }

        if (toF < toP){
                outfile<<"LAVA\n";
        }
        else if (toF > toP){
                outfile<<"WATER\n";
        }
        else{
            outfile<<"MOUNTAINS\n";
        }
    }
    
    infile.close();
    outfile.close();
}
