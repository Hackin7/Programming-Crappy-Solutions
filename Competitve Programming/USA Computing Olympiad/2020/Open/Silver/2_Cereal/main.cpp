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
    
    
    
    /*
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
            }
        }
        if (i!=0){outfile<<"\n";}
        outfile<<ans;
        cout<<ans<<"\n";//Debugging
    }*/
    
    //What if visited stores the next best option?
    int ans[N+1];ans[N]=0;
    int visited[M+1];memset(visited,0,sizeof(visited));
    for(int i=N-1;i>=0;i--){//
        cout<<"c"<<i<<endl;
        ans[i]=ans[i+1];
        //shift in visited stuff
        int pos=f[i];
        int currfavAlt = visited[f[i]];
        int currAlt=s[i];
        while(true){
            cout<<"["<<currfavAlt<<endl;
            for(int i:visited){cout<<i<<" ";}cout<<endl;
            
            if (currfavAlt==0){//empty
                visited[pos] = currAlt;//To shift
                ans[i]++;
                break;
            }else if(currfavAlt==-1){//No other place to go
                visited[pos] = currAlt;
                break;
            }else{
                visited[pos] = s[i];
                cout<<"shift"<<currfavAlt<<" "<<visited[currfavAlt]<<"\n";
                //go to next value
                pos=currfavAlt;
                currfavAlt=visited[currfavAlt];
                currAlt=-1;//Nowhere else to go
            }
        }
        for(int i:visited){cout<<i<<" ";}cout<<endl;
    }
    
    ofstream outfile;
    outfile.open("cereal.out");
    for(int i=0;i<N;i++){
        if(i!=0)outfile<<"\n";
        outfile<<ans[i];
        
        cout<<ans[i]<<"\n";
    }
    outfile.close();
    return 0;
}
