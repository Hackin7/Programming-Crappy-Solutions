#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("farmin.txt"); 
    ofstream outfile;
    outfile.open("farmout.txt");
    
    int N; infile >> N;
    int dist[N], total = 0;
    for (int i=0; i<N; i++){infile >> dist[i];total += dist[i];}
    
    int posts[total+1]; memset(posts, 0, sizeof(posts));
    int counter = 0;
    for (int i=0; i<N-1; i++){
        //if (i==N-1)break;//cout<<"("<<dist[i]<<")";
        counter+=dist[i];
        posts[counter] = 1;
    }
    
    //for (int i=0; i<total+1; i++)cout<<posts[i]<<"_";
    //cout<<endl;
    
    int ans = 0;
    for (int i=0; i< (total+1)/2 + 1; i++){
        if (posts[i] != posts[total-i]){//have extra posts
            posts[i] = 0;posts[total-i] = 0;//Remove post
            ans++;
        }
    }
    //cout<<ans;
    outfile << ans;
    
    infile.close();
    outfile.close();
    return 0;
}
