#include <bits/stdc++.h>
using namespace std;
//80%
bool cmp(tuple<int,int,int>a,tuple<int,int,int>b){
    return get<0>(a) < get<0>(b);
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    //Input Output
    int a,b,c,d;cin>>a>>b>>c>>d;
    vector<int> s[4];
    for (int i=0;i<a;i++){
        int x;cin>>x;s[0].push_back(x);}
    for (int i=0;i<b;i++){
        int x;cin>>x;s[1].push_back(x);}
    for (int i=0;i<c;i++){
        int x;cin>>x;s[2].push_back(x);}
    for (int i=0;i<d;i++){
        int x;cin>>x;s[3].push_back(x);}
    //Sort
    for(int i=0;i<4;i++){
        sort(s[0].begin(),s[0].end());}
    
    //Brute force sets a and b 
    vector< tuple<int,int,int> > combiAB;
    for (int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            combiAB.push_back(make_tuple(s[0][i]+s[1][j],i,j));
        }
    }
    sort(combiAB.begin(),combiAB.end(),cmp);
    
    //Brute force sets c and d 
    vector< tuple<int,int,int> > combiCD;
    for (int i=0;i<c;i++){
        for(int j=0;j<d;j++){
            combiCD.push_back(make_tuple(s[2][i]+s[3][j],i,j));
        }
    }
    sort(combiCD.begin(),combiCD.end(),cmp);
    for (auto i:combiCD){
        int val=-get<0>(i);
        
        //Binary search for value 
        int l=0,r=combiAB.size(),m;
        while (l <= r) { 
            m = (l+r)/ 2; 
            bool cmp = get<0>(combiAB[m])>=val;
            if (cmp){r = m-1;}
            else{l = m + 1;}
        }
        //cout<<m<<":";
        if (get<0>(combiAB[m])==val){
            cout<<s[0][get<1>(combiAB[m])]<<' ';
            cout<<s[1][get<2>(combiAB[m])]<<' ';
            cout<<s[2][get<1>(i)]<<' ';
            cout<<s[3][get<2>(i)]<<endl;
            return 0;
        }
    }
    return 0;
}
/*
3 2 4 2
5
17
-8
-13
19
6
-9
10
0
-14
7
*/
