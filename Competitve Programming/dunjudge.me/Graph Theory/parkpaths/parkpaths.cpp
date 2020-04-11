#include "parkpaths.h"
#include <iostream>
#include <cstdio>
#include <bits/stdc++.h>
using namespace std;
#define V 100

//https://dunjudge.me/analysis/submissions/722556/
int val(char a){return (int)a-64;}
int parkpaths(string S) {
    int ans=0;
    int visited[V];memset(visited,0,sizeof(visited));
    for(auto s:S){
        if (visited[val(s)]){}
        else{visited[val(s)]=1;ans+=2;}
        //cout<<s<<val(s)<<" "<<ans<<endl;
    }
    
    int g[V][V];memset(g,0,sizeof(g));
    for(int i=1;i<(int)S.length();i++){
        //cout<<S[i-1]<<S[i]<<" "<<ans<<endl;
        if ( !g[val(S[i-1])][val(S[i])] ){
            ans+=1;
            //Connect them
            g[val(S[i-1])][val(S[i])]=1;
            g[val(S[i])][val(S[i-1])]=1;
        }
        
    }
    return ans;
}
