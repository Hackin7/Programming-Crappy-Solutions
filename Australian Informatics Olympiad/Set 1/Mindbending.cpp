#include <bits/stdc++.h>
#include <fstream>
using namespace std;

bool inRange(int l,int a,int h){
    return l<a && a<h;
}

int main(){
    ifstream infile; 
    infile.open("bendin.txt"); 
    
    int x1, y1,x2,y2;
    infile >>x1 >> y1 >> x2 >> y2; 
    int rx1, ry1,rx2,ry2;
    infile >>rx1 >> ry1 >> rx2 >> ry2; 
    infile.close();

    int area1 = (y2-y1) * (x2-x1);
    int area2 = (ry2-ry1) * (rx2-rx1);
    int midarea = 0;//overlap
    //R1 in R2
    if (inRange(rx1,x2,rx2) && inRange(ry1,y2,ry2)){
        int cx2 = x2, cy2 = y2;
        int cx1 = (inRange(rx1,x1,rx2))? x1:rx1;
        int cy1 = (inRange(ry1,y1,ry2))? y1:ry1;
        midarea = (cx2-cx1)*(cy2-cy1);
        cout<<cx1<<","<<cy1<<"_"<<cx2<<","<<cy2<<endl;
    }else if (inRange(x1,rx2,x2) && inRange(y1,ry2,y2)){
        int cx2 = rx2, cy2 = ry2;
        int cx1 = (inRange(x1,rx1,x2))? rx1:x1;
        int cy1 = (inRange(y1,ry1,y2))? ry1:y1;
        midarea = (cx2-cx1)*(cy2-cy1);
        cout<<cx1<<","<<cy1<<"_"<<cx2<<","<<cy2<<endl;
    }
    
    
    cout<<area1<<" "<<area2<<" "<<midarea;
    ofstream outfile;
    outfile.open("bendout.txt");
    outfile << area1+area2-midarea;
    outfile.close();
}
