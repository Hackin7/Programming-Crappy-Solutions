#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int N,L; 
int dist(int X,int d){
    if (d==1){return L-X;}
    else{return X;}
}
int pos(int X,int d,int t){return X+d*t;}

int collide(int x1,int d1, int x2, int d2){
    if ((x1 < x2 && d1 > d2)||
        (x2 < x1 && d2 > d1)){
            return (x1+x2)/2;}
    else{return -1;}
}

bool timeWeightsCmp(pair<int,int> a, pair<int,int> b){
    return a.first < b.first; // Increasing order of timings
}
int main(){
    ifstream infile; 
    infile.open("meetings.in"); 
    infile>>N>>L;
    int w[N],x[N],d[N];
    for (int i=0;i<N;i++){
        infile>>w[i]>>x[i]>>d[i];
    }
    infile.close();
    /* Plan
     1. Find Time taken to stop for each cow
       - Sort cows by collisions (dist between cows & direction)
       * 
     2. Sort Timings & Greedily pick the weights by timing
       - Add the collisions per cow 
     3. When the weight meets condition, return number of collisions
    */
    
    ////Timings////////////////////////////////
    long long timings[N];int collisions[N];
    // At start, no collisions;
    for (int i=0;i<N;i++){
        timings[i] = dist(x[i],d[i]);collisions[i] = 0;
    }
    
    //
    
    ////Sort Timings///////////////////////////
    pair<int,int> tW[N];//time & Cow Number[N];
    for (int i=0;i<N;i++){
        tW[i] = make_pair(timings[i],i);
    }
    stable_sort(tW,tW+N, timeWeightsCmp);
    ////Greedily pick timings//////////////////
    int weights = 0, sumWeights = accumulate(w,w+N);
    int ans = 0;
    for (int i=0;i<N;i++){
        weights += w[tW[i].second];
        ans+= collisions[tW[i].second];
        if (weights > sumWeights/2){break;}
    }
    
    cout<<ans;
    
    ofstream outfile;
    outfile.open("meetings.out");
    outfile.close();
    return 0;
}
