#include <bits/stdc++.h>
#include <fstream>
using namespace std;


int Ra, Pa, Sa;
int Rb, Pb, Sb;

int ans = 0;
void fight(int b, int a, int *c, int *d){
    int score = min(a, b);
    int left = b - score;//Amount you lost
    ans += score; // b can win the minimum amount of rounds 
    if (a <= b){cout<<"b win";}
    else {
        cout<<"a win";
    }
        if (*c >= left && left > 0){ // All Draws left
            *c -= left; // Draws
        }else if  (left>0){
            ans -= left-*c; // Lost points
            *d -= left-*c;//Other side also use up
            *c = 0;//Draws all used up
        }
    cout <<a<<","<<b<<","<<*c<<","<<*d<<")"<<" "<< score << left  << *c << ans<<endl;
}
int main(){
    ifstream infile; 
    infile.open("rpsin.txt"); 
    ofstream outfile;
    outfile.open("rpsout.txt");
    
    int N; infile >> N;
    infile >> Ra >>  Pa >> Sa;
    infile >> Rb >>  Pb >> Sb;
    
    //int ans = min(Rb,Sa) + min(Sb,Pa) + min(Pb,Ra);
    fight(Rb,Sa, &Ra, &Pa); fight(Sb,Pa, &Sa, &Ra); fight(Pb,Ra,&Pa, &Sa);
    cout << ans;
    outfile << ans;

    infile.close();
    outfile.close();
    return 0;
}
