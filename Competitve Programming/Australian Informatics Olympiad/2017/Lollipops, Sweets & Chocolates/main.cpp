#include <bits/stdc++.h>
#include <fstream>
using namespace std;

float higher = 1000000001;
float lower = 1;
int main(){
    ifstream infile; 
    infile.open("lscin.txt"); 
    //Input
    int N, L; infile >> N >> L;
    higher = (float)L;
    int arr[N]; 
    for (int i=0; i<N; i++)infile >>arr[i];
    
    int closest[N];
    for (int i=0; i<N; i++)infile >>closest[i];
    infile.close();
    
    int newarr[N];
    for (int i=0; i<N; i++){newarr[i] = arr[closest[i]-1];}

    //Algorithm
    for (int i=0; i<N-1; i++){
        float a= newarr[i], b=newarr[i+1];
        
        float x = ((a+b)/2);
        if (a>b){// x smaller than ans
            if (lower < x){lower = x;}
        }
        else if (a<b){// x larger than ans
            if (x < higher){higher = x;}
        }
    }
    
    //Ans
    int ans = -1;
    if (lower <= higher)ans = int(lower);
    //cout << lower<<" "<<higher<<":";
    //cout<<ans;
    
    ofstream outfile;
    outfile.open("lscout.txt");
    outfile << ans;
    outfile.close();
}
