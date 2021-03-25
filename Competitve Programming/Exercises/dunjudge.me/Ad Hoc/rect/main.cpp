#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;cin>>n;
    
    int xleft,xright,ylower,yupper;
    for(int i=0;i<n;i++){
        int x1,x2,y1,y2;cin>>x1>>x2>>y1>>y2;
        if (i==0){
            xleft=x1,xright=x2,ylower=y1,yupper=y2;
        }else{
            xleft = max(xleft,x1);
            xright = min(xright,x2);
            ylower = max(ylower,y1);
            yupper = min(yupper,y2);
        }
    }
    int area=max(0,(yupper-ylower)*(xright-xleft));

    if(yupper-ylower<0 || xright-xleft<0){
        area=0;
    }
    cout<<area;
    return 0;
}
/*
3
1 4 1 8
0 2 0 5
10 15 22 35
*/
