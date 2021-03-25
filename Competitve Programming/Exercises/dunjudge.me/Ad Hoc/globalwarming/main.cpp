#include <bits/stdc++.h>
using namespace std;

typedef pair<int,int> ipair;
int checkIslands(int N,int *H,double h){
    int islands=0;bool goingUp=false;
    for(int i=1;i<N;i++){
        if ( H[i-1]>h && H[i]<=h ){
            islands++;
            goingUp=false;
        }else if(H[i-1]<=h && H[i]>h){
            goingUp=true;
        }
    }
    return islands+goingUp;
}
int gwBruteForce(int N,int *H){
    int ans=1; //Minimum Answer
    int maxH=*max_element(H,H+N);
    set<int> visited;
    for(int h=*min_element(H,H+N);h<=maxH;h++){
        if (visited.find(h)!=visited.end()){continue;}
        //Count number of islands
        ans = max(ans,checkIslands(N,H,h));
        visited.insert(h);
    }
    return ans;
}
int gw(int N,int *H){
    /*multiset<int, greater<int> > valleys;
    multiset<int, greater<int> > peaks;
    set<int, greater<int> > items;*/
    priority_queue<ipair> pq;
    
    if (N==1){return 1;}
    
    if (H[0]>H[1]){
        pq.push(make_pair(H[0],1));}
    for(int i=1;i<N-1;i++){
        //Going Down Valley
        if (H[i-1]>H[i]){
            while(H[i]>=H[i+1] && i<N-2){//Go Down Further
                i++;
            }if(H[i]<H[i+1]){//Reach turning up point
                pq.push(make_pair(H[i],0));
            }
        }
        //Going Up Peak
        else if (H[i-1]<H[i]){
            while(H[i]<=H[i+1] && i<N-2){//Go Up Further
                i++;
            }if(H[i]>H[i+1]){//Reach turning down point
                pq.push(make_pair(H[i],1));
            }            
        }
    }
    if (H[N-2]<H[N-1]){
        pq.push(make_pair(H[N-1],1));
    }

    int islands=0; //Start from top
    //cout<<*(peaks.begin())<<" "<<"Islands: "<<islands<<"\n";
    int ans=islands;
    while(!pq.empty()){
        int h=pq.top().first;
        int isPeak=pq.top().second; 
        pq.pop();
        if (isPeak){islands++;}
        else{islands--;}
        if ((!pq.empty() && pq.top().first!=h)||pq.empty()){
            ans = max(ans,islands);
        }
        //Count number of islands
        //cout<<h<<":"<<islands<<","<<ans<<"\n";
    }
    return ans;
    
    //return gwBruteForce(N,H);
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N;cin>>N;
    int H[N];for(int i=0;i<N;i++){cin>>H[i];}
    //cout<<"No. Islands: "<<checkIslands(N,H,2)<<"\n";
    cout<<gw(N,H);
    return 0;
}

/*
//1 island
3
1 2 1

//2 island
3
2 1 2

7
5
6
1
3
2
9
8

8
5
6
1
1
3
2
9
8

8
8 2 8 2 8 2 8 1
*/
