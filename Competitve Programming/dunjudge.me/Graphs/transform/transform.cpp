#include <bits/stdc++.h>
using namespace std;

int INF = 1100000000;

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
    
    int M[128][128]; //2D map of cost
    bool cn[128][128];
    for (int i=0; i<128; i++){
        for (int j=0; j<128; j++){
            M[i][j] = INF;cn[i][j] = false;
        }} //Empty cost
            
    for (int i=0;i<n;i++){
        char x,y; int c; cin>>x>>y>>c;
        //Cost setting
        M[int(x)][int(y)] = c;
        
        cn[int(x)][int(y)] = true;
        cn[int(y)][int(x)] = true;
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

    /*
    cout<<endl<<endl;;
    //Output
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cout<<adjM[i][j]<<",";//Null value
        }
        cout<<endl;
    }
    */

    
    int cost = 0;
    //Loop through Word/////////////////////////
    for (int i=0; i<l/2; i++){
        cout<<word[i]<<word[l-i-1];
        int a = int(word[i]), b = int(word[l-i-1]);
        cout << a <<","<< b <<":"<< M[a][b] <<endl;
        if (M[a][b] != INF)cost += M[a][b];
    }
    
    //cout<<M[int('r')][int('t')];
    
    //Check if ends are linked
    //Add to cost
    cout << cost;
}
