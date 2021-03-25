#include <bits/stdc++.h>
#include <fstream>
using namespace std;
// 1/13
int N,L;

void showM(short int *m){
    for(int i=0;i<L;i++){
        if (m[i] == -1){cout<<"_";}
        else{cout<<m[i];}
    }
    cout<<endl;
}
int main(){
    ifstream infile; 
    infile.open("meetings.in"); 
    infile>>N>>L;
    int w[N],x[N],d[N];
    for (int i=0;i<N;i++){
        infile>>w[i]>>x[i]>>d[i];
    }
    short int m[L];//map
    infile.close();
    fill(m,m+L+1,-1);//Nothing
    for (int i=0;i<N;i++){m[x[i]] = i;} //Position
    
    bool done[N]; fill(done, done+N, false);
    int collisions = 0;
    int T=0, weights=0, threshold = accumulate(w,w+N,0)/2;
    while (weights < threshold){
        T++;//cout<<"Time <= "<<T<<endl;showM();
        for (int i=0;i<N;i++){
            if (done[i]){continue;}
            ////Reaching Barn
            if((x[i] == 0 && d[i]==-1) || 
               (x[i] == L && d[i]==1)){
                weights+=w[i];
                done[i] = true;
                m[x[i]] = -1;
                continue;
            }
            else{ //Detect collision (Odd spaces)
                
                /*if (m[x[i]] != -1){
                    int a=i,b=m[x[i]];
                    cout<<"Collision 1:"<<a<<","<<b<<endl;
                    swap(d[a],d[b]); //Swap Directions
                    collisions++;
                }//About to collide: Near & opp Directions
                else */if (m[x[i]+d[i]] != -1 && d[m[x[i]+d[i]]] == -d[i]){
                    int a=i,b=m[x[i]+d[i]];
                    //cout<<"Collision 2:"<<a<<","<<b<<endl;
                    swap(d[a],d[b]);
                    //d[b]*=2; //Countdown
                    collisions++;
                }
            }
            ////Moving/////////////////////////////
            if (abs(d[i]) == 1){//Valid Direction
                m[x[i]] = -1;//Remove current position
                x[i] += d[i];
            }else{
                d[i]-= d[i]/abs(d[i]);
            }//Switch Directions
            
            m[x[i]] = i; //Reinforce new position
        }
        
    }

    cout<<collisions;
    ofstream outfile;
    outfile.open("meetings.out");
    outfile << collisions;
    outfile.close();
    return 0;
}
