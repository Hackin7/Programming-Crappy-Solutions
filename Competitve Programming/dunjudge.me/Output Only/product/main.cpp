#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    for(int f=1;f<=10;f++){
        ifstream infile;
        infile.open("Input/"+to_string(f)+".txt");
        int H,W,N; infile>>H>>W>>N;
        infile.close();
        ofstream outfile;
        outfile.open("Output/"+to_string(f)+".out");
        int counter = 0;
        for(int i=0;i<H;i++){
            if (i!=0){outfile<<endl;}
            for(int j=0;j<W;j++){
                if (counter >=N)outfile<<'.';
                else outfile<<'#';
                counter++;
            }
        }
        outfile.close();
    }
    return 0;
}
