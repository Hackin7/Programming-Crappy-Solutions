#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int N, M, L;

int lower(int *location, int house, int dist){
    cout<<"["<<house-dist<<"]";
    if (house-dist < 0) return 0;
    else return location[house-dist];
}
int upper(int *location, int house, int dist){
    cout<<"["<<house+dist<<")";
    if (house+dist > L) return 0;
    else return location[house+dist];
}
int main(){
    ifstream infile; 
    infile.open("lscin.txt"); 
    ofstream outfile;
    outfile.open("lscout.txt");
    
    infile>>N>>M>>L;
    int p[N];for (int i=0;i<N;i++)infile>>p[i];//Shops
    int h[M];for (int i=0;i<M;i++)infile>>h[i];//Houses
    int s[M];for (int i=0;i<M;i++)infile>>s[i];//Phamplets

    int ans = -1;
    
    int location[L+1];memset(location, 0, sizeof(location));
    for (int i=0;i<N;i++){location[p[i]]=1;}
    
    int dist[M][L];//For different R distances;
    for (int i=0; i<M;i++){
        dist[i][0] = min(location[h[i]], 1);
        for (int j=1; j<L; j++){
            int l = lower(location, h[i], j), u=upper(location, h[i], j);
            cout << dist[i][j-1]<<":"<<j<<","<<l<<",,"<<u<<endl;
            dist[i][j] = dist[i][j-1] + l + u;
        }
    }
    
    //for (int i=0; i<L+1;i++){cout<<location[i]<<",";}cout<<endl;
    for (int i=0; i<M;i++){
        cout<<h[i]<<" ";
        for (int j=0; j<L; j++){
            cout<<dist[i][j]<<", ";
        }cout<<endl;
    }

    
    
    bool flag = false;int j=1;    
    for (j=0; j<L; j++){
        flag = true;
        int arr[M];for(int i=0; i<M;i++){arr[i] = s[i];}
        for(int i=0; i<M;i++){
            for (int k=0; k<M;k++){
            cout<<dist[i][j]<<"<"<<s[k]<<" ";
                if (dist[i][j] == arr[k]){
                    arr[k] = -1;cout<<endl;break;}
            }
            
        }
        cout<<flag<<":"<<endl;
        for(int i=0; i<M;i++){
                if (arr[i] !=-1){
                    flag = false;break;}
            }
        if (flag){cout<<j;break;}
    }
    if (flag)ans=j;


    cout<<endl<<ans;outfile<<ans;
    infile.close();
    outfile.close();
    return 0;
}
