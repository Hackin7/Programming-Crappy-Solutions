#include <bits/stdc++.h>
using namespace std;
/*
5 5
5
541
33
8
89
*/
//40%
bool cmpC(string a,string b){
    int i=0;
    for (i=0;i<(int)min(a.length(),b.length());i++){
        if (a[i] != b[i]){return a[i] > b[i];}
    }
    if (a.length() > b.length()){
        return b[0] < a[i]; // Put A in front of B?
    }else{
        return a[0] < b[i];
    }
    //return a.length()<b.length(); // Shorter length at front
}
bool cmpL(string a,string b){
    if (a.length() == b.length()){
        return cmpC(a,b);
    }else{
        return a.length() > b.length(); 
    }
}

int main() {
    int N,K; cin>>N>>K;
    string S[N];for(int i=0;i<N;i++){cin>>S[i];}
    
    if (K!=N)stable_sort(S,S+N, cmpL);// Largest Length
    //for(auto s:S){cout<<s<<" ";}cout<<endl;
    stable_sort(S,S+K,cmpC); // Largest digits at front
    
    string output = "";
    for(int i=0;i<K;i++){output.append(S[i]);}
    cout<<output;
    
}
