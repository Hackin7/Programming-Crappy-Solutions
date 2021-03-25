#include <bits/stdc++.h>
using namespace std;

int main(){
    int n; cin >> n;
    string word = "";
    for (int i=0;i<n;i++){
        string input;cin>>input;
        if (input.size() > word.size()){word = input;}
    }
    cout << word;
}
