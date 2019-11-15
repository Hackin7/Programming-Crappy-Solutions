#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("chairsin.txt"); 
    ofstream outfile;
    outfile.open("chairsout.txt");
    
    int c, n, k; infile >> c >> n >> k;
    string chairline;infile >> chairline;

    //Dynamic Programming///////////////////////////////
    int wsizes[c];//no wet seats in between
    memset(wsizes, 0, sizeof(wsizes));
    if (chairline[0] == 'w'){wsizes[0]++;}
    //Preprocessing////////////
    for (int i=1;i<c;i++){
        wsizes[i] = wsizes[i-1];
        if (chairline[i] == 'd'){
        }else{//Wet
            wsizes[i]++;
        }
    }
    //////////////////////////////////////////////////////

    int size = 0;
    //Get size
    int i;for (i=n-1; i<c; i++){
        //spaces available = no items - (wetseats - people willing to sit on wet seats)
        size = (i+1)-wsizes[i]+k;
        if (size == n)break;
    }
    int sum = i+1; //From 0 index to i: i+1 items
    int lower = 0; //Start from 1 to sum+1 index, remove 0 index
    for (int i=sum-1; i<c; i++){
        //Formula
        size = (i+1-wsizes[i]+k) - (lower+1-wsizes[lower]+k);//Difference
        //Debugging
        cout<<lower+1<<","<<i<<":"<<size<<" "<<i-lower<<endl;
        while (size > n || 
               (size >= n && chairline[i] == 'w') ){
            i--;
            size = (i+1-wsizes[i]+k) - (lower+1-wsizes[lower]+k);
            cout<<lower+1<<","<<i<<":"<<size<<" "<<i-lower+1<<endl;
        }
        if (size == n and i-lower < sum){
            sum = i-lower;
        }
        lower++;
    }
    cout<<sum<<":";

    outfile << sum;
    infile.close();
    outfile.close();
    return 0;
}
