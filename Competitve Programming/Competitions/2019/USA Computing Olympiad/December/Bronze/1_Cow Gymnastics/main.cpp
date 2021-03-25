#include <bits/stdc++.h>
#include <fstream>
using namespace std;

// 100% Solutions

/*Plan
 1. Check status at start
 2. For next few lines, check if consistent
 3. Count Consistent
*/

int main(){
    ifstream infile; 
    infile.open("gymnastics.in"); 
    
    int K,N; infile>>K>>N;
    int m[K][N];
    for (int k=0;k<K;k++){for(int n=0;n<N;n++){
        infile>>m[k][n];
    }}
    infile.close();

    cout<<"Input done";//Debugging
        
    ////Status at start//////////////////////////////////////
    bool consistent[N][N]; 
    //1 for a larger or equal to b, 
    //0 for smaller than, consistent[a][b]
    for(int i=0;i<N;i++){for(int j=0;j<N;j++){consistent[i][j] = 1;}}
    
    vector<int> best;
    //First,Best Element ------Working on Test
    int a = m[0][0];
    cout<<endl<<a; //Debugging
    best.push_back(a);
    for(int i=0;i<N;i++){consistent[a-1][i] = true;}
    //Next Elements ----------Working on Test
    for(int n=1;n<N;n++){
        int b = m[0][n];
        for (int a:best){
            //1-indexed
            consistent[a-1][b-1] = true;
            consistent[b-1][a-1] = false;
        }
        best.push_back(b);
    }
    
    ////Debugging (Column:a, Row:b)
    for(int i=0;i<N;i++){cout<<endl;for(int j=0;j<N;j++){cout<<consistent[i][j];}}cout<<endl;
    
    
    ////Check remaining consistency///////////////////////////
    int marked[N][N]; 
    for(int i=0;i<N;i++){for(int j=0;j<N;j++){marked[i][j]=0;}}
    for (int k=1;k<K;k++){
        vector<int> best;
        best.push_back(m[k][0]); //First Element
        for(int n=1;n<N;n++){//Next elements
            int b = m[k][n];
            cout<<"At "<<k<<","<<n<<","<<endl;
            for (int a:best){
                cout<<" Checking:"<<a<<","<<b<<":"<<marked[b-1][a-1];
                if (a!=b && consistent[a-1][b-1]){
                    cout<<"Consistent";
                    marked[b-1][a-1]++;marked[a-1][b-1]++;
                }
                cout<<endl;
            }
            best.push_back(b);
        }
    }
    ////Count consistent ones//////////////////////////
    int ans = 0; 
    for(int i=0;i<N;i++){for(int j=i;j<N;j++){
        if (i!=j && marked[i][j]==K-1){ans++;}
    }}
    //ans/=2;
    ////Output//////////////////////////////////////////////
    cout<<ans;
    ofstream outfile;
    outfile.open("gymnastics.out");
    outfile<<ans;
    outfile.close();
    return 0;
}
