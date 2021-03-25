#include <cstdio>
#include <bits/stdc++.h>
#include "askonegetonefree.h"
using namespace std;

//https://dunjudge.me/analysis/submissions/722656/
#define V 1000000
int queriedX[V];
int queriedY[V];
int queryX(int x){
    if (queriedX[x]==-1){
        Answer reply=query(x); 
        queriedX[x] = reply.p;
        queriedY[x] = reply.q;
    }
    return queriedX[x];
}
int queryY(int y){
    queryX(y);return queriedY[y];
}

int findX=1;
bool bsCmp(int i){
    return findX?queryX(i):queryY(i);
}
//find the max i such that f(i) is true
bool findMin=0;
int binarySearch(int l, int r) { 
    //cout<<l<<" "<<r<<endl;
    int m;
    while (l <= r) { 
        m = (l+r)/ 2; 
        //cout<<m<<endl;
        bool cmp = findMin?bsCmp(m):!bsCmp(m);
        if (cmp){r = m-1;}
        else{l = m + 1;}
    }
    return l; 
} 


Answer guess(int N){
    Answer reply;      // reply from Bob
    Answer secrets;    // Your guessed secrets

    //----------  Put your code below  -------------------//
    memset(queriedX,-1,sizeof(queriedX));
    memset(queriedY,-1,sizeof(queriedY));
    secrets.p = max(1,binarySearch(1,N)-1);
    findX=0;secrets.q = max(1,binarySearch(1,N)-1);    
    //for(int i=1;i<=N;i++){cout<<i<<":"<<queriedX[i]<<","<<queriedY[i]<<" ";}cout<<"\n";
    //cout<<secrets.p<<" "<<secrets.q<<"\n";
    /*
    reply = query(4);
    if (reply.p == 1){
        //   "the secret x is greater or equal to 4 "  
    } else {
        //   "the secret x is smaller than 4 " 
    }
    if (reply.q == 1){
        //   "the secret y is greater or equal to 4 "  
    } else {
        //   "the y is smaller than 4 " 
    }

    reply = query(1);
    reply = query(2);
        
    secrets.p = 3;
    secrets.q = 2;
    */
    //----------    Put your code above -------------------//

    return (secrets);
}
