#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ifstream infile; 
    infile.open("cereal.in"); 
    int N,M; infile>>N>>M;
    int f[N],s[N];
    for(int i=0;i<N;i++){infile>>f[i]>>s[i];}
    infile.close();
    
    ofstream outfile;
    outfile.open("cereal.out");
    
    //Brute force solution
    int visited[M+1];
    for(int i=0;i<N;i++){//Remove the first i cows from the line
        memset(visited,0,sizeof(visited));
        int ans=0;
        for(int j=i;j<N;j++){
            if(!visited[f[j]]){
                visited[f[j]]=1;ans++;
            }else if(!visited[s[j]]){
                visited[s[j]]=1;ans++;
            }else{}//Nothing
        }
        if (i!=0){outfile<<"\n";}
        outfile<<ans;
        cout<<ans<<"\n";//Debugging
    }
    
    
    outfile.close();
    return 0;
}
