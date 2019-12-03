#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int N = 0, S=0, M=0;
int main(){
    ifstream infile; 
    infile.open("hirein.txt"); 
    ofstream outfile;
    outfile.open("hireout.txt");

    infile >> N;
    int x[N]; for (int i=0; i<N; i++)infile >> x[i];
    infile >> S;
    int s[S]; for (int i=0; i<S; i++)infile >> s[i];
    infile >> M;
    int m[M]; for (int i=0; i<M; i++)infile >> m[i];
    
    int matchup[N][S+M];
    for (int i=0; i<N; i++){
        for (int j=0; j<S; j++){
            //cout<<s[i]<<","<<x[j]<<","<<matchup[i][j]<<endl;
            matchup[i][j]  = s[j] - x[i];
            if (matchup[i][j]<0){//Overskilled
                matchup[i][j] = INT_MAX; //Not Suitable
            }
        }
        for (int k=0; k<M; k++){
            matchup[i][S+k]  = x[i] - m[k];
            if (matchup[i][S+k]<0){//Underskilled
                matchup[i][S+k] = INT_MAX; //Not Suitable
            }
        }
    }

    
    int ans = N;
    for (int i=0; i<N; i++){
        int min = matchup[i][0], job = 0;
        for (int j=0; j<S+M; j++){
            if (matchup[i][j] < min){
                job = j;min = matchup[i][j];
            }
        }
        //cout<<i<<","<<min<<","<<job<<endl;
        //Set all others to nill
        if (min == INT_MAX){ans--;continue;}
        //cout<<job<<endl;
        for (int k=0; k<N; k++){
            if (k == i)continue;
            matchup[k][job] = INT_MAX;
        }
        
    }/*Show
    for (int i=0; i<N; i++){
        for (int j=0; j<S+M; j++){
            cout<<matchup[i][j]<<" ";
        }
        cout<<endl;
    }*/
    cout << ans;
    outfile<<ans;
    
    infile.close();
    outfile.close();
    return 0;
}
