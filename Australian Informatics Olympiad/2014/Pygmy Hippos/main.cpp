#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("hippoin.txt"); 
    ofstream outfile;
    outfile.open("hippoout.txt");
    
    int N;
    infile >> N; 
    int d[3];for (int i=0; i<3; i++)infile>>d[i]; //Starting daisy for hippo
    
    int canSave = N-3;
    if (canSave <=0){outfile << 0;infile.close();outfile.close();return 0;}
    
    int spaces[4];
    spaces[0] = d[0]-1;
    spaces[1] = d[1]- d[0]-1;
    spaces[2] = d[2]-d[1]-1;
    spaces[3] = N-d[2];
    
    for (int i=0; i<4; i++){cout<<spaces[i]<<" ";}cout<<endl;
    //combinations = 12; //4*3
    int max = spaces[0] + spaces[1];
    for (int i=0; i<4; i++){
        for (int j=i; j<4; j++){
            int saved = spaces[i] + spaces[j];
            if (max < saved){
                max = saved;
            }
        }
    }
    cout<<max;
    outfile<<max;
    
    infile.close();
    outfile.close();
    return 0;
}
