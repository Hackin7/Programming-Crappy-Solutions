#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("cloudin.txt"); 
    int n, k;
    infile >> n >> k;
    int d[n-1];
    for (int i=0;i<n-1;i++){
        infile >> d[i];
    }
    infile.close();
    
    int s[n-k];
    s[0] = 0;
    for (int j=0;j<0+k;j++){
        s[0] += d[j];
    }
    for (int i=1;i<n-k;i++){
        s[i] = -d[i-1] + s[i-1] + d[i+k-1];
    }
    
    int min = s[0];
    for (int i=1;i<n-k;i++){
        if (s[i] < min){min = s[i];}
    }
    
    int ans = min;
    cout << ans;
    
    ofstream outfile;
    outfile.open("cloudout.txt");
    outfile << ans;
    outfile.close();
}
