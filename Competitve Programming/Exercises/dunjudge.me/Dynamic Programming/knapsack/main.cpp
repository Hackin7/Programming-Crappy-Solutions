#include <bits/stdc++.h>
using namespace std;


//From https://github.com/ranaldmiao/sg_noi_archive/blob/master/2018_prelim/solution_writeup/NOI2018_Prelim_SolutionPackage.zip

vector <pair<int, int>> A[200100];
long long dp[1000000], answer;
int main(){

    int noItems=5;
    int v[noItems],s[noItems];
    for(int i=0;i<noItems;i++){
        if (i%noItems==0){v[i]=2; s[i]=1;} //Salmon Sashimi
        else if (i%noItems==1){v[i]=7; s[i]=2;} //Salmon Maki
        else if (i%noItems==2){v[i]=60; s[i]=6*s[1]+5;} //Premium Bento
        else if (i%noItems==3){v[i]=588; s[i]=179*s[0];} //Yu Sheng
        else if (i%noItems==4){
            v[i]=2888;
            s[i]=s[3] + s[2]*24 + 67*s[1] + 88*s[0];
        } //CNY Gift Box
        A[s[i]].push_back(make_pair(v[i], 1023));
    }
    
    int N;cin>>N;
    for(int i = 1; i <= N; i++){
        sort(A[i].begin(), A[i].end(), greater<pair<int, int>>());
        int index = 0;
        for(int j = 0; j < N / i; j++){
            if(index >= A[i].size()) break;
            for(int k = N; k >= i; k--){
                dp[k] = max(dp[k], dp[k - i] + A[i][index].first);
                answer = max(answer, dp[k]);
            }
            A[i][index].second--;
            if(A[i][index].second == 0) index++;
        }
    }
    cout << answer << endl;
    return 0;
} 

