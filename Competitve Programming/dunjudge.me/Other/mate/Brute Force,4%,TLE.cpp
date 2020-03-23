#include <bits/stdc++.h>
using namespace std;
#define V 1000000

typedef pair<int,int> ipair;
typedef long long ll;

int val(char a){
    if(a=='M'){return 0;}
    else if(a=='A'){return 1;}
    else if(a=='T'){return 2;}
    else if(a=='E'){return 3;}
    else{return 0;}
}

int R,C;
int conv(int x,int y){return y*C+x;}
int xv,yv;void conn(int v){xv=v%C;yv=v/C;}

ll visited[V];
char m[V]; 


int find(int v,int x,int y){
    if (v==4){return 0;}
    int cost=INT_MAX;
    for(int i=0;i<C;i++){for(int j=0;j<R;j++){
        if (val(m[conv(i,j)])==v){
            cost=min(cost,abs(x-i)+abs(y-j)+find(v+1,i,j));
        }
    }}
    return cost;
}

int find(){//Start node at 0
    int cost=INT_MAX,v=0;
    for(int i=0;i<C;i++){for(int j=0;j<R;j++){
        if (val(m[conv(i,j)])==v){
            cost=min(cost,find(v+1,i,j));
        }
    }}
    return cost;
}
typedef tuple<ll,ll,ll> group;
int main(){
    cin>>R>>C;
    for (ll i=0; i<R; i++){for (ll j=0; j<C; j++){
        cin>>m[conv(j,i)];visited[conv(j,i)] = -1;
    }}
    
    int cost=find();
    cout<<cost;
}
/*
4 4
MATE
MATE
MATE
MATE
*/
