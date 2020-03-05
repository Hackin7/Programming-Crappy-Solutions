#include <bits/stdc++.h>
using namespace std;

int directions[8][2] = {{0,1},{0,-1},{1,0},{1,1},{1,-1},{-1,0},{-1,1},{-1,-1}};
bool inRange(int x, int y){
    return (1<=x && x<=8 && 0<=y&&y<=8);
}
bool rookEat(int xr,int yr,int xk,int yk){
    bool condition=(xr==xk || yr==yk);
    //cout<<xk<<","<<yk<<" "<<xr<<","<<yr<<":"<<condition<<endl;
    return condition;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int pos[4][2];
    for(int i=0;i<4;i++){
        char x;cin>>x>>pos[i][1];
        pos[i][0] = x-'a'+1;
        //cout<<pos[i][0]<<endl;
    }
    
    string barr = "BARR THE BEAR PWWWWNNNNEEEDDD KANG THE PENGUIN!!!!!!!!!!!!";
    string kang = "OMG KANG THE PENGUIN SUUUUURRRVVVIIIVVVEEEEDDD!!!!!";
    
    bool die=1;
    for (int i=0;i<8;i++){
        int dx=directions[i][0],dy=directions[i][1];
        int xk = pos[3][0]+dx, yk=pos[3][1]+dy;
        if (!inRange(xk,yk)){continue;}
        if(xk==pos[2][0]&&yk==pos[2][1]){continue;}//Got king there
        bool rook1Eat = rookEat(pos[0][0],pos[0][1],xk,yk)&&
                        !(xk==pos[0][0] && yk==pos[0][1]);
        bool rook2Eat = rookEat(pos[1][0],pos[1][1],xk,yk)&&
                        !(xk==pos[1][0] && yk==pos[1][1]);
        if (rook1Eat||rook2Eat){}//cout<<"Die";}
        else{die=0;}//Got position where no die
    }
    if (die)cout<<barr;
    else cout<<kang;
    
    
    return 0;
}
