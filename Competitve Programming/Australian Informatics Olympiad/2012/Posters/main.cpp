#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("postin.txt"); 
    ofstream outfile;
    outfile.open("postout.txt");
    
    int N; infile >> N;
    
    
    int x[N], w[N];
    int space[1000100];memset(space, -1, sizeof(space));
    int tsp = 0; //total space
    for (int i=0; i<N; i++){
        infile >> x[i] >> w[i];
        // Mark out space
        for (int j=x[i]; j<x[i]+w[i]; j++){
            space[j] = i;
        }
        if (x[i] + w[i] > tsp){tsp = x[i] + w[i];}
    }
    
    //cout<<tsp<<" ";
    //for (int i=0; i<tsp; i++){cout<<space[i]<<"_";} 
    int ans = 0;
    int c=1, p = 0; //Counter, current poster number
    for (int i=1; i<tsp; i++){
        if (space[i-1] == space[i]){
            c++;p = space[i];
        }else{c=1;p=space[i];}
        if (c == w[p]){
            ans = p+1;break;
        }
    }
    
    cout << ans;
    outfile << ans;

    infile.close();
    outfile.close();
    return 0;
}
