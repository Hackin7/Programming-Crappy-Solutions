#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    string s;getline(cin,s);
    vector<char> upper,lower;
    for(auto i:s){
        if (65<=i&&i<=65+26){
            upper.push_back(i);}
        else if(97<=i&&i<=97+26){
            lower.push_back(i);
        }
    }
    for(auto i:upper){cout<<i;}
    for(auto i:lower){cout<<i;}
    return 0;
}
