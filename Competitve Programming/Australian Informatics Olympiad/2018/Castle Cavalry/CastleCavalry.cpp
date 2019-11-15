#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("cavalryin.txt"); 
    int n;
    infile >> n;
    int a[n];

    int comfMatch[n+1];
    vector<int> comfSizes;
    int unhappy=0;
    memset(comfMatch,0, sizeof(comfMatch));
    for (int i=0;i<n;i++){
        infile >> a[i];
        comfMatch[a[i]]++; unhappy++;
        if (comfMatch[a[i]] % a[i] == 0){
            unhappy -= comfMatch[a[i]];
            comfMatch[a[i]] = 0;
        }
    }
    infile.close();

    string ans = "YES";
    
    if (unhappy > 0){ans = "NO";}
    cout << ans;
    
    ofstream outfile;
    outfile.open("cavalryout.txt");
    outfile << ans;
    outfile.close();
}
