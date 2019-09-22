#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ifstream infile; 
    infile.open("snakein.txt"); 
    ofstream outfile;
    outfile.open("snakeout.txt");

    int N; infile >> N;
    string dna; infile >> dna;
    
    int ans = 0;


    //Subtask 2 & 3
    if (true){
        int no[5] = {0,0,0,0,0}, min = INT_MAX;
        vector<int> count;
        string match = "SNAKES";
        int mode = 0;
        for (int i=0; i<N; i++){
            //cout<<dna[i]<<match[mode]<<no[mode]<<endl;
            if(dna[i] == match[mode+1]){//Is the next character
                //cout<<no[mode]<<"<"<<min<<")";
                if (no[mode] < min)min = no[mode];
                mode++;
            }
            //Subtask 3
            if (mode == 5){
                //cout<<endl<<"Hi"<<count.size()<<endl;;
                count.push_back(min);
                min = INT_MAX;
                mode = 0;memset(no, 0, sizeof(no));
            }
            if (dna[i] == match[mode]){
                no[mode]++;
            }else{
            }

        }
        if (no[mode] < min)min = no[mode];
        count.push_back(min);
        
        ans = 0;
        for (int i =0; i<(int)count.size(); i++){
            //cout<<count[i]<<",";
            if (count[i] > ans)ans = count[i];
        } 
        
        //for (int i=0; i<5; i++)cout<<no[i]<<",";
    }
    
    cout << ans;outfile << ans;
    
    infile.close();
    outfile.close();
    return 0;
}
