#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("frogin.txt"); 
    ofstream outfile;
    outfile.open("frogout.txt");
    
    int N; infile >> N;
    int h[N];for (int i=0;i<N;i++)infile >> h[i];
    
    vector<int> posts;
    int arr[N]; memset(arr, 0, sizeof(arr));
    int lower = h[0];
    for (int i=1;i<N;i++){
        //cout<<i<<":"<<h[i]<<" "<<(h[i] < h[i-1])<<endl;
        /*
        if (h[i] < lower){
            arr[i] = 0;
            lower = h[i];
            posts.push_back(i-1);
        }else{
            arr[i] = h[i] - lower;
        }*/
        arr[i] = h[i] - h[i-1];
    }
    
    int max = 0;
    for (int i=1;i<(int)posts.size();i++){
        int b = posts[i-1], u = posts[i];
        int size = arr[b] + arr[u] ;
        if (size > max) max = size;
    }
    
    for (int i=0;i<N;i++)cout<<arr[i]<<",";
    cout<<max;
    outfile << max;
    
    infile.close();
    outfile.close();
    return 0;
}
