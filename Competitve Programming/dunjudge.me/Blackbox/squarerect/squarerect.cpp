#include "squarerect.h"
#include <bits/stdc++.h>
using namespace std;

//Compile Command: ./compile_cpp.sh && cat ./sample.1.in | ./run_cpp.sh 

short int memo[100][100];
bool find_in_square(int x,int y){
    if (memo[x][y]==-1){
        memo[x][y]=inside_shape(x,y);
    }
    return memo[x][y];
}
int x,y;bool isX=false;
bool bsCmp(int i){
    if (isX)return find_in_square(i,y);
    else return find_in_square(x,i);
}
//find the minimum i such that f(i) is true
bool findMin=true;
int binarySearch(int l, int r) { 
    int m;
    while (l <= r) { 
        m = (l+r)/ 2; 
        bool cmp = findMin?bsCmp(m):!bsCmp(m);
        if (cmp){r = m-1;}
        else{l = m + 1;}
    }
    return l; 
} 

bool am_i_square(int N, int Q) {
    memset(memo,-1,sizeof(memo));
    //All cases, N = 100
    //Subtask 1
    if (Q >= N*N){
        //cout<<"Subtask1 ";
        int i1=-1,j1=-1,i2=-1,j2=-1,pi=0,pj=0;
        bool pastq = false;
        for (int i=1;i<=N;i++){
          for (int j=1;j<=N;j++){
            bool query = inside_shape(i,j);
            if (query && i1==-1){
              i1=i,j1=j;
            }
            else if (!query && i1!=-1 && pastq){
              i2=pi;
              j2=pj;
            }
            pi=i;pj=j;pastq = query;
          }
        }
        //cout<<i1<<","<<j1<<"|"<<i2<<","<<j2<<endl;
        return i2-i1==j2-j1;
    }

    int check[]={20,40,60,80};
    int i,j;bool checkbool=false;
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            if (inside_shape(check[i],check[j])){
                checkbool=true;
                break;
            }
        }
        if (checkbool){break;}
    }
    if (checkbool){
        int lower,upper;
        //Search x
        y=j;
        lower=i-20,upper=i-1;
        isX=true;findMin=false;//Find lower x first
        int x1 = binarySearch(lower,upper);
        
        lower=i+1,upper=i+20;
        isX=true;findMin=true;//Find upper x first
        int x2 = binarySearch(lower,upper);
        
        //Search y
        x=i;
        lower=j-20,upper=j-1;
        isX=false;findMin=false;//Find lower y first
        int y1 = binarySearch(lower,upper);
        
        int length=x2-x1;
        bool q1=find_in_square(x,y1+length);
        bool q2=find_in_square(x,y1+length+1);
        if (!q1 || (q1&&q2)){return true;}
        else{return false;}
    }else{
        int side=0;
        //Find Edges
        for(i=0;i<4;i++){
            if (inside_shape(check[i],100)){
                side=1;
                break;};
        }
        if (!side&&inside_shape(100,100)){
            side=2;}
        if (!side){for(i=0;i<4;i++){
            if (inside_shape(100,check[i])){
                side=3;
                break;};
        }}
        
        if (!checkbool){return false;}
        else if (side<=2){ //Lying on y
            //Binary Search for x
            y=j;
            int lower=i-20,upper=i-1;
            isX=true;findMin=false;//Find lower x first
            int x1 = binarySearch(lower,upper);
            
            int length=20; //Guaranteed at least 4% of area
            bool q1=find_in_square(x1+length,y);
            bool q2=find_in_square(x+length+1,y);
            if (!q1 || (q1&&q2)){return true;}
            else{return false;}
        }else if (side==3){ //Lying on x
            //Binary Search for y
            x=i;
            int lower=j-20,upper=j-1;
            isX=false;findMin=false;//Find lower x first
            int y1 = binarySearch(lower,upper);
            
            int length=20; //Guaranteed at least 4% of area
            bool q1=find_in_square(x,y1+length);
            bool q2=find_in_square(x,y1+length+1);
            if (!q1 || (q1&&q2)){return true;}
            else{return false;}
        }
    }
    return inside_shape(1, 1);
}
