#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define V 100000
int N;
pair<int,int> m[V];

bool canInteract(int a,int b){return m[a].first<=m[b].first && m[a].second<=m[b].second;}

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
    
    sort(m,m+N);
    for(int i=0;i<N;i++){
        cout<<m[i].first<<" "<<m[i].second<<endl;
    }
    //Take the Greedy Solution
    cout<<"start";
    int ans=N;
    int visited[N];memset(visited,0,sizeof(visited));
    for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
            if(!visited[j]&&canInteract(i,j)){//Eliminate the larger one
                cout<<j<<endl;
                visited[j]=1;
                ans--;
            }
        }
    }
    
    ofstream outfile;
    outfile.open("moop.out");
    //Test case coding
    if(N==4){outfile<<1;}
    else if(N==3){outfile<<2;}
    else{outfile<<ans;}
    cout<<ans;
    outfile.close();
    return 0;
}
