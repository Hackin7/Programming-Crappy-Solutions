#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int x,y;cin>>y>>x;
    int pokenumber=0;
    for(int i=0;i<32;i++){//the nth bit
        int newPosition=1<<i;
        //bitset<32> a(newPosition);
        //cout<<a<<"\n";
        if (i%2==0){
            //Position on x
            int posX=i/2;
            newPosition *= x>>posX&1;
            //bitset<32> b(newPosition);
            //cout<<""<<b<<"\n";
        }else{
            int posY=i/2;
            newPosition *= y>>posY&1;
            //bitset<32> b(newPosition);
            //cout<<""<<b<<"\n";
        }
        pokenumber+=newPosition;
    }
    cout<<pokenumber;
    return 0;
}
