#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("frogin.txt"); 
    ofstream outfile;
    outfile.open("frogout.txt");
    
    int N, K; infile >> N >> K;
    int dist[N-1], total = 0; 
    for (int i=0; i<N-1; i++){
        infile >> dist[i];
        total += dist[i];
    }
    
    int shift[N-1], newdist[N-1], minS = INT_MAX;
    //Negative shows shirt rightward, Positive shows shift leftward
    shift[0] = (N-1)*K - total;
    newdist[0] = dist[0] + shift[0];
    minS = abs(shift[0]);
    //cout<<shift[0]<<" "<<newdist[0]<<endl;
    for (int i=1; i<N-1; i++){
        shift[i] = newdist[i-1] - K;
        //newdist[i-1] = dist[i-1] + shift[i-1] - shift[i];
        newdist[i] = dist[i] + shift[i];
        if (abs(shift[i]) < minS){minS = abs(shift[i]);}
    }
    int ans = 0;
    for (int i=0; i<N-1; i++){
        cout<<shift[i]<<":"<<newdist[i]<<"_";
        ans += abs(shift[i]);
    }
    
    cout<<minS;
    //Remove minimum
    ans -= minS*(N-2);
    
    cout << endl<<ans;
    outfile << ans;
    
    infile.close();
    outfile.close();
    return 0;
}
