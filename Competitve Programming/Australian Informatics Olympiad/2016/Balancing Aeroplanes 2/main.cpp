#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("balancein.txt"); 
    ofstream outfile;
    outfile.open("balanceout.txt");

    int S; infile >> S;
    int n[S], sum[S];
    for (int i=0; i<S; i++){
        infile >> n[i];
        if (i==0) sum[0] = n[i];
        else sum[i] = sum[i-1]+n[i];
    }
    int mid = 0, midval = sum[S-1]/2 + (sum[S-1]%2);
    for (mid = 0; mid<S; mid++){
        if (sum[mid] >= midval){
            break;
        }
    }
    
    int start;
    if (S % 2 == 1){start = mid - 1;}//Odd
    else{start = mid;}
    
    int ans=0;
    int i=start, r=1, l=1; //Right, left
    while (i>=0){
        //cout<<"["<<ans<<"]("<<i<<","<<i<<","<<S-1-i<<") ";
        while (n[i] != n[S-1-i]){
            if (n[i] > n[S-1-i]){
                //Switching but need forklift instead of pushing
                if (n[S-1-i] != 0 && n[S-1-i+r] != 0){ans++;}
                n[S-1-i] += n[S-1-i+r];
                n[S-1-i+r] = 0;r++;
            }
            else if (n[i] < n[S-1-i]){
                //Switching but need forklift instead of pushing
                if (n[i-l] != 0 && n[i] != 0){ans++;}
                n[i] += n[i-l];
                n[i-l] = 0;l++;
            }
        }
        i--; r=1; l=1;
        //for (int j=0; j<S; j++)cout<<n[j]<<",";
        //cout<<endl;
    }
    
    cout<<ans;
    outfile << ans;
    
    infile.close();
    outfile.close();
    return 0;
}
