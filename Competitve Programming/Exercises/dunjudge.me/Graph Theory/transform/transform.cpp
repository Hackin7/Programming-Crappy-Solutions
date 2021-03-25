#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const int INF = 1100000000;

bool ispalindrome(int l,string word){
    for (int i=0; i<l/2; i++){
        cout<<word[i]<<word[l-i-1];
        if(word[i]!=word[l-1-i]){return false;}
    }
    return true;
}
int main(){
    //Input//////////////////////////////////
    int l, n; cin>>l>>n;
    string word; cin>>word;
    
    int nodes = 0;
    bool letters[128];fill(letters, letters+128, false);
    for (int i=0; i<l; i++){
        int index = int(word[i]);
        if (letters[index] == false){
            letters[index] = true;nodes++;}
    }
    
    //Initialisation
    const int V=128;
    ll M[V][V]; //2D map of cost
    //bool cn[V][V];
    memset(M,INF,sizeof(M));//Empty cost
            
    for (int i=0;i<n;i++){
        char x,y; int c;cin>>x>>y>>c;
        //Cost setting
        M[int(x)][int(y)] = c;
        //M[int(y)][int(x)] = c;
        
        //cn[int(x)][int(y)] = true;
        //cn[int(y)][int(x)] = true;
    }
    
    //cout << nodes;
    
    //Floyd Warshall/////////////////////////////
    for (int k=0; k<nodes; k++){
        for (int i=0; i<nodes; i++){
            for (int j=0; j<nodes; j++){
                //cout<<adjM[i][k] + adjM[k][j]<<",";
                M[i][j] = min(M[i][j], M[i][k] + M[k][j]);
                
            }
        }        
    }

    int cost = 0;
    ll totalchoices = 67108864;//2^26
    //Loop through choices/////////////////////////
    for (ll choice=0;choice<totalchoices;choice++){
        ll currchoice=choice;
        for(int i=0;i<26;i++){
            int isletter = currchoice%2;
            if (isletter){}
            currchoice/=2;
        }
    }
    
    cout<<M[int('c')][int('t')]<<":";
    
    cout << cost;
}
/*
3 3
cat
c r 10
t r 12
r t 14
*/
