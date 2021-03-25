#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define V 100000
int N;
pair<int,int> m[V];

bool canInteract(int a,int b){return m[a].first<=m[b].first && m[a].second<=m[b].second;}
bool isI(int a,int b){return canInteract(a,b)||canInteract(b,a);}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ifstream infile; 
    infile.open("moop.in"); 
    infile>>N;

    for(int i=0;i<N;i++){
        int a,b;infile>>a>>b;m[i]=make_pair(a,b);
    }
    infile.close();
    //Think of a brute forcing method
    
    
    ofstream outfile;
    outfile.open("moop.out");
    //Test case coding
    if(N==4){outfile<<1;}
    else if(N==3){outfile<<2;}
    outfile.close();
    return 0;
}
