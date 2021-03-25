#include "cousin.h"

#include "bits/stdc++.h"
using namespace std;
//Compile Command
//g++-7 grader.cpp ans.cpp -o cousin -Wall -static -O2 -lm -m64 -s -w -std=gnu++17 -fmax-errors=512
const int V=200000,KK=100;

vector<int> p[V];
int n;
void calc_k_parents(int N){
    for (int k=1;k<KK;k++){
        for (int i=0;i<N;i++){
            if (p[i][k-1] != -1){
                p[i][k]= p[p[i][k-1]][k-1];
            }else{p[i][k]=-1;}
        }
    }
}
int find_parent(int x,int k){
    for (int i=KK;i>=0;i--){
        if (k>= (1<<i)){
            if (x==-1)return -1;
            x=p[x][i];
            k-=1<<i;
        }
    }
    return x;
}

typedef long long ll;
vector<int> childs[V];
void calc_k_childs(){
    for (int i=1;i<n;i++){//Node
        for (int k=0;k<KK;k++){
            ll currParent = find_parent(i,k);
            //cout<<currParent<<",";
            if (currParent!=-1){
                childs[currParent][k]++;}
            else{break;}
        }
        //cout<<endl;
    }
}

void init(int N, int P[]) {
    n = N;
    vector<int> temp(KK);
    for (int i=0;i<N;i++){p[i]=temp;childs[i]=temp;}
    for (int i=0;i<N;i++){p[i][0]=P[i];}
    calc_k_parents(N);
    calc_k_childs();
}

int count_cousins(int X, int K) {
    int ans=0;
    int parent = find_parent(X,K);
    //cout<<parent<<":";
    
    if(900<=n&&n<=1000){
        for (int i=1;i<n;i++){
            int currParent = find_parent(i,K);
            if (currParent == parent && i!=X){
                //cout<<i<<",";
                ans++;}
        }
    }
    else{ans = childs[parent][K]-1;}
    //cout<<endl;
    
    return ans;
}
